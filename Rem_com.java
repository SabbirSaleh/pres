package pres;

import java.sql.SQLException;

import javax.swing.DefaultComboBoxModel;

class Rem_com extends Combo{
	

	private static final long serialVersionUID = 3028301760250277352L;
	String medId;
	String id;
	
	Rem_com(String val) {
		medId=val;
		
		try {
			
			v=new Sql().execute("select rem,rem_id from rem where rem_id=(select rem_id from med_typ where med_id="+medId+")");
					
					//set the model
					setModel(new DefaultComboBoxModel(v.get(0).toArray()),"");
					
					
				} catch (SQLException e) {
					
					
				} catch (Exception e) {
					
					
				}
			}
	


	void search( String f)
	{
		try {
			v=new Sql().execute("select rem,rem_id from rem where rem_id=(select rem_id from med_typ where med_id="+medId+") and rem like ;+"+f+"%'");
		} catch (SQLException e) {
			
		} catch (Exception e) {
			
			
		}
	}
	
	void select(String nam,String id)
	{
		
		this.id=id;
	
	}

}