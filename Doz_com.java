package pres;

import java.sql.SQLException;

import javax.swing.DefaultComboBoxModel;

class Doz_com extends Combo{
	

	private static final long serialVersionUID = 3028301760250277352L;
	String medId;
	String id;
	
	
	Doz_com(String val) {
		medId=val;
try {
			
	v=new Sql().execute("select doz,doz_id from doz where doz_id=(select doz_id from med_doz where med_id="+medId+")");
			
			//set the model
			setModel(new DefaultComboBoxModel(v.get(0).toArray()),"");
			
			
		} catch (SQLException e) {
			
			
		} catch (Exception e) {
			
			
		}
	}


	void search( String f)
	{
		try {
			v=new Sql().execute("select doz,doz_id from doz where doz_id=(select doz_id from med_doz where med_id="+medId+") and doz like"+f+ "%");
			System.out.println(v);
		} catch (SQLException e) {
			
		} catch (Exception e) {
			
			
		}
	}
	
	void select(String nam,String id)
	{
		
		this.id=id;
	
	}
	
	

}
