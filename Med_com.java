package pres;

import java.sql.SQLException;




class Med_com extends Combo {
	
	
	private static final long serialVersionUID = 1L;

	void search(String f){
		
		Sql ob = null;
		try {
			ob = new Sql();
		} catch (Exception e) {
			
			
		}
		try {
			v=ob.execute("select tra_nam,med_id from med where tra_nam like '" + f+ "%'");
			
			
		} catch (SQLException e) {
			
			
		}
		
		
		
		
	}
	
	void select (String str,String val)
	{	
		v.clear();
		
		tf.setText(null);
		
		new MedFra(str,val);
	}
	
	

}
