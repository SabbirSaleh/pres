package pres;

import java.sql.*;
import java.util.ArrayList;


class Sql {
	
	ResultSet rs;
	Statement st;
	Connection conn;
	
	
	
	
	Sql() throws Exception
  {
    conn = getConnection();
    st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
    
    
  }
	
	
	//execute quries
	ArrayList<ArrayList<String>> execute(String qr) throws SQLException
	{
		ArrayList <ArrayList<String>> result=new ArrayList<ArrayList<String>>();
		
		rs = st.executeQuery(qr);
		ResultSetMetaData rsmd = rs.getMetaData();
	    int col = rsmd.getColumnCount();
		for(int i=0;i<col;i++)
			//create rows of arraylist equal to the column number
		{
			result.add(new ArrayList<String>());
		}
		while(rs.next())
		{
			for(int i=1;i<=col;i++)
				//transvers the column into rows
			{
				result.get(i-1).add( rs.getString(i) );
			}
		}
		
		rs.close();
		closeConnection();
		return result;
		
	}
	
	
	ArrayList<ArrayList<String>> executeR(String qr) throws SQLException
	{
		ArrayList <ArrayList<String>> result=new ArrayList<ArrayList<String>>();
		
		rs = st.executeQuery(qr);
		ResultSetMetaData rsmd = rs.getMetaData();
	    int col = rsmd.getColumnCount();
		/*for(int i=0;i<col;i++)
			//create rows of arraylist equal to the column number
		{
			result.add(new ArrayList<String>());
		}*/
	    int j=0;
		while(rs.next())
		{
			result.add(new ArrayList<String>());
			
			for(int i=1;i<=col;i++)
				
			{
				result.get(j).add( rs.getString(i) );
			}
			j++;
		}
		
		
		rs.close();
		closeConnection();
		return result;
		
	}
	
	//execute updates
	void update(String qr) throws SQLException
	{
		st.executeUpdate(qr);	
		
		closeConnection();
		
		
	}
	
	//make connections
	 Connection getConnection() throws Exception {
		 Class.forName("com.mysql.jdbc.Driver");
	    String url ="jdbc:mysql://localhost:3306/pres";
	   
	    
	    return DriverManager.getConnection(url, "root", "");
	  }
	 
	 //close connections
	 void closeConnection() throws SQLException
	 {
		 
		 st.close();
		 conn.close();
		 
	 }
	 
}