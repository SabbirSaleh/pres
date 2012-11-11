package pres;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.sql.SQLException;
import java.util.*;


public class TesFra extends JFrame implements ActionListener{
		

	private static final long serialVersionUID = 823455969921768454L;
ArrayList<ArrayList<String>> arrayList = new ArrayList<ArrayList<String>> ();
ArrayList  <String> name= new ArrayList<String>() ;
public JCheckBox cb[];
String cat_id;

	
JButton ok;
	
 TesFra(String catNam,String catId){
	 super("CheckBox ");
	 cat_id=catId;
	  Container con  = getContentPane();
        con.setLayout(new FlowLayout());
        
        try {
			arrayList=new Sql().execute("select tes_nam ,tes_id from tes where cat_id= "+ catId +" ");
		} catch (SQLException e) {
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		}
   
	cb=new JCheckBox[arrayList.get(0).size()];
	  

          for(int i=0; i < arrayList.size() ; i++)  {
		cb[i]=new JCheckBox( arrayList.get(0).get(i));
		  con.add(cb[i]);
		  
		  cb[i].setSelected(false);
		
           
	}
	
	
	
	ok = new JButton("ok");
        con.add(ok);
        ok.addActionListener(this);
	setSize(230,150);
        setVisible(true);
  }



	   
    
	



  
    
    public void actionPerformed(ActionEvent event){
	   
    	for(int i=0;i<arrayList.get(0).size();i++)
	    if(cb[i].isSelected())
	{
         //arrayList.get(1).get(i)
	    	try {
				new Sql().update("insert into pat_tes values ("+ InterCon.getPat() +","+ InterCon.getDat() +","+arrayList.get(1).get(i)+","+ null+ ")");
			} catch (SQLException e) {
				
				e.printStackTrace();
			} catch (Exception e) {
			
				e.printStackTrace();
			}	
	    
		    
	}
       
    	setVisible(false);

    }
    
    

}
 

        
