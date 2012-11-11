package pres;

import java.awt.*;
import javax.swing.*;

public class New_med extends JFrame{




    
	private static final long serialVersionUID = 5078173769028115926L;
	private JLabel tra_name,gen_name,company;
    	  private JTextField ttra_name,tgen_name,tcompany;
	     JButton ok;
	  
	  
	  New_med(){
		          super("Add a new medicine into your Database");
		  
		          JPanel panel=new JPanel(null);
        Container con  = getContentPane();
        con.setLayout(null);
	panel.setLayout(null);
		  
		  
		  tra_name = new JLabel("Medicine Name");
		gen_name= new JLabel("Medicine Generic Name:");
		company= new JLabel("Company Name:");
	          con.add(tra_name);
	     con.add(gen_name); 
	     con.add(company);
		  
		  	    
	             ttra_name= new JTextField();
	        tgen_name= new JTextField();
	      tcompany= new JTextField();
	
		   
		       con.add(ttra_name);
	             con.add(tgen_name);
		     con.add(tcompany);
		     
		     	   ok = new JButton("OK");
        con.add(ok);
       // ok.addActionListener(this);
	
	 Insets insets = con.getInsets();
	    
	    
	tra_name.setBounds(insets.left+60,insets.top+50,150,30);
	gen_name.setBounds(insets.left+60,insets.top+50+50,150,30);
        company.setBounds(insets.left+60,insets.top+50+50+50,150,30);
	
	    
        ttra_name.setBounds(insets.left+230,insets.top+50,200,30);
	tgen_name.setBounds(insets.left+230,insets.top+50+50,200,30);
	
	tcompany.setBounds(insets.left+230,insets.top+50+50+50,200,30);
	
	  setSize(500,400);
        setVisible(true); 
}
}

		     
