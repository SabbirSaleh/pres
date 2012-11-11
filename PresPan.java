package pres;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JLabel;

class PresPan extends DockedPan{
	
	private static final long serialVersionUID = -855737555596821209L;
	ArrayList<ArrayList<String>> v = new ArrayList<ArrayList<String>> ();
	ArrayList<ArrayList<String>> x = new ArrayList<ArrayList<String>> ();
	ArrayList<ArrayList<String>> y = new ArrayList<ArrayList<String>> ();
	JLabel med[];

	PresPan(int y,int x,int width,int height)
	{
		super(y,x,width,height);
		initPres();
		
		
	}
	
	void initPres()
	{
		
		removeAll();
		
		revalidate(); 
		
		
		try {
			
			
			v=new Sql().executeR("select typ_id,med_id,uni_id,doz_id,rem_id,duration from pat_med where pat_id="+InterCon.getPat()+ " and dat_id="+ "1212");
			
			for(int j = 0;j<v.size();j++)
			{	
				
				
					x=new Sql().executeR("SELECT typ.typ_nam, med.tra_nam, uni.uni, doz.doz, rem.rem FROM typ, uni, med, doz, rem WHERE typ.typ_id ="+ v.get(j).get(0)+" AND med.med_id ="+ v.get(j).get(1)+" AND uni.uni_id ="+ v.get(j).get(2)+" AND doz.doz_id ="+ v.get(j).get(3)+" AND rem.rem_id ="+ v.get(j).get(4));
					y.add(x.get(0));
				
			}
			
			for(int i=0;i<y.size();i++)
			{
				add(new JLabel("Medcine "+(i+1)+" :"));
				for(int j=0;j<y.get(0).size();j++)
				{
					add(new JLabel(y.get(i).get(j)));
				}
				add(new JLabel("                                                                               "));
			}
			
			setVisible(true);
			
		} catch (SQLException e) {
			
			
		} catch (Exception e) {
			
		}
		
	}
	
	

}
