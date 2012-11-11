 package pres;

import java.sql.SQLException;

import javax.swing.DefaultComboBoxModel;

class Typ_com extends Combo{
	

	private static final long serialVersionUID = 3028301760250277352L;
	String medId;
	String id;
	
	Typ_com(String val)
	{
		medId=val;
		try {
			System.out.println("select typ_nam,typ_id from typ where typ_id=(select typ_id from med_typ where med_id="+medId+")");
			v=new Sql().execute("select typ_nam,typ_id from typ where typ_id=(select typ_id from med_typ where med_id="+medId+")");
		} catch (SQLException e) {
			//
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//set the model
		setModel(new DefaultComboBoxModel(v.get(0).toArray()),"");
	}
	
	
	void search( String f)
	{
		try {
			v=new Sql().execute("select typ_nam,typ_id from typ where typ_id=(select typ_id from med_typ where med_id="+medId+")and typ_nam like '"+f+"%'");
		} catch (SQLException e) {
			
		} catch (Exception e) {
			
			
		}
	}
	
	void select(String nam,String id)
	{
		
		this.id=id;
	
	}
	

}
