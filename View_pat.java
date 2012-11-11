package pres;

import java.awt.*;
import javax.swing.*;

public class View_pat extends JFrame{
	    
	private static final long serialVersionUID = 7757247157546111534L;
		private JLabel name,dob,sex,contact,complain,tname,tdob,tsex,tcontact,tcomplain;
	 JButton ok;
	View_pat(){
	
	    
        super("Viewing an existing patient ");
	    JPanel panel=new JPanel(null);
        Container con  = getContentPane();
        con.setLayout(null);
	panel.setLayout(null);
	    
	    
		name = new JLabel("Patient's Name:");
		dob= new JLabel("Patient's Date of Birth:");
		sex= new JLabel("Patient's Sex:");
	      contact= new JLabel("Patient's Contact No. :");
	      complain= new JLabel("Patient's complain:");

	    
	    
		tname = new JLabel("name:");
		tdob= new JLabel("dob:");
		tsex= new JLabel("sex:");
	     tcontact= new JLabel("con no :");
	      tcomplain= new JLabel("complain:");
	      
	     con.add(name);
	     con.add(dob); 
	     con.add(sex); 
	     con.add(contact);
	     con.add( complain);
	     con.add(tname);
	     con.add(tdob); 
	     con.add(tsex); 
	     con.add(tcontact);
	     con.add(tcomplain);
	     
	     	   ok = new JButton("OK");
        con.add(ok);
       // ok.addActionListener(this);
       
       
       
       
       	    	        
        Insets insets = con.getInsets();
       	    
	name.setBounds(insets.left+60,insets.top+50,150,30);
	dob.setBounds(insets.left+60,insets.top+50+50,150,30);
	sex.setBounds(insets.left+60,insets.top+50+50+50,150,30);
       contact.setBounds(insets.left+60,insets.top+50+50+50+50,150,30);
       complain.setBounds(insets.left+60,insets.top+50+50+50+50+50,150,30);
       
       
               tname.setBounds(insets.left+230,insets.top+50,200,30);
	tdob.setBounds(insets.left+230,insets.top+50+50,200,30);
	
	tsex.setBounds(insets.left+230,insets.top+50+50+50,200,30);
	
	tcontact.setBounds(insets.left+230,insets.top+50+50+50+50,200,30);
	tcomplain.setBounds(insets.left+230,insets.top+50+50+50+50+50,400,30);

      ok.setBounds(insets.left+150,insets.top+50+50+50+50+50+50+50,150,30);
      
      
             setSize(600,600);
        setVisible(true);   
      }
 
    
    }
	