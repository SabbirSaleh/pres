package pres;

import java.sql.SQLException;

import javax.swing.DefaultComboBoxModel;

class Uni_com extends Combo{
	

	private static final long serialVersionUID = 3028301760250277352L;
	String medId;
	String id;
	
	
	Uni_com(String val) {
		medId=val;
		
		try {
			
			v=new Sql().execute("select uni,uni_id from uni where uni_id=(select uni_id from med_typ where med_id="+medId+")");
			
			//set the model
			setModel(new DefaultComboBoxModel(v.get(0).toArray()),"");
			
			
		} catch (SQLException e) {
			
			
		} catch (Exception e) {
			
			
		}
	}


	void search( String f)
	{
		try {
			v=new Sql().execute("select uni,uni_id from uni where uni_id=(select uni_id from med_typ where med_id="+medId+")and uni like '"+f+"%'");
		} catch (SQLException e) {
			
		} catch (Exception e) {
			
			
		}
	}
	
	void select(String nam,String id)
	{
		
		
		this.id=id;
	
	}
	

}