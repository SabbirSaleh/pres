package pres;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;


class InterCon {
	
	static PresPan pres;
	static String pat;
	static String date;
	static String dateId;
	
	static void init()
	{
		Calendar cal = Calendar.getInstance();
        int day = cal.get(Calendar.DATE);
        int month = cal.get(Calendar.MONTH) + 1;
        
        	
        int year = cal.get(Calendar.YEAR);
        
        if(month<10)
        date=year+"-0"+month+"-"+day;
        else date=year+"-"+month+"-"+day;
        
        
	}
	
	static void set(PresPan para)
	{
		pres=para;
	}
	
	static void set(String para)
	{
		pat=para;
	}
	
	static void setDat()
	{
		
		
		ArrayList<ArrayList<String>> v = new ArrayList<ArrayList<String>> ();
		
		try {
			
			new Sql().update("insert into pat_dat values (null,"+pat+ ","+ "'" +date+"'" +")" );
			
			v=new Sql().execute("select dat_id from pat_dat where pat_id="+ pat + " and dat='"+date+"'");
			dateId=v.get(0).get(0);
			
			
			
		} 
		
		catch (SQLException e) {
			
			
			
		} 
		catch (Exception e) {
			
			
		}
		
		
		
	}
	
	
	
	static PresPan getPan ()
	{
		return pres;
	}

	static String getPat()
	{
		return pat;
	}
	
	static String getDat()
	{
		return dateId;
	}
	
	
	
	
}
