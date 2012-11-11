package pres;

import java.sql.SQLException;




class Tes_com extends Combo {
	
	static String id;
	
	
	private static final long serialVersionUID = 1L;

	void search(String f){
		
		Sql ob = null;
		try {
			ob = new Sql();
		} catch (Exception e) {
			
			
		}
		try {
			v=ob.execute("select cat_nam,cat_id from tes_cat where cat_nam like '" + f+ "%'");
			
			
		} catch (SQLException e) {
			
			
		}
		
		
		
		
	}
	
	void select (String str,String val)
	{	
		v.clear();
		
		tf.setText(null);
		
		id=val;
		
		new TesFra(str,val);
	}
	
	

}