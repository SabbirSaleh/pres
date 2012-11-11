package pres;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class New_pat extends JFrame  implements ActionListener, ItemListener{

    
	private static final long serialVersionUID = 7833707025469577712L;
	private JLabel name,dob,sex,contact,complain;
        JRadioButton male, female;
	    ButtonGroup radioGroup;
	
	   JButton ok;
	  private JTextField tname,tdob,tcontact,tcomplain;
    New_pat(){
	    
        super("Add a new Patient into your Database");
        
        JPanel panel=new JPanel(null);
        Container con  = getContentPane();
        con.setLayout(null);
	panel.setLayout(null);
	    
	    
		name = new JLabel("Patient's Name:");
		dob= new JLabel("Patient's Date of Birth:");
		sex= new JLabel("Patient's Sex:");
	      contact= new JLabel("Patient's Contact No. :");
	      complain= new JLabel("Patient's complain:");
	    
	     con.add(name);
	     con.add(dob); 
	     con.add(sex); 
	     con.add(contact);
	     con.add( complain);
	    
	    
	             tname= new JTextField();
	        tdob= new JTextField();
	        tcontact= new JTextField();
		   tcomplain= new JTextField();
		   
		       con.add(tname);
	     con.add(tdob); 
	   
	     con.add(tcontact);
	     con.add( tcomplain);
		
	    
	    
	     male = new JRadioButton("Male", false);
           female = new JRadioButton("Female", false);
         con.add(male);
          male.addItemListener(this);
          female.addItemListener(this);
	    
	con.add(female);
        radioGroup = new ButtonGroup();
        radioGroup.add(male);
        radioGroup.add(female);
	
	   ok = new JButton("OK");
        con.add(ok);
       ok.addActionListener(this);
        
	    
	    	        
        Insets insets = con.getInsets();
	    
	    
	name.setBounds(insets.left+60,insets.top+50,150,30);
	dob.setBounds(insets.left+60,insets.top+50+50,150,30);
	sex.setBounds(insets.left+60,insets.top+50+50+50,150,30);
       contact.setBounds(insets.left+60,insets.top+50+50+50+50,150,30);
       complain.setBounds(insets.left+60,insets.top+50+50+50+50+50,150,30);
	
	    
        tname.setBounds(insets.left+230,insets.top+50,200,30);
	tdob.setBounds(insets.left+230,insets.top+50+50,200,30);
	
	male.setBounds(insets.left+230,insets.top+50+50+50,75,30);
	female.setBounds(insets.left+300,insets.top+50+50+50,100,30);
	
	tcontact.setBounds(insets.left+230,insets.top+50+50+50+50,200,30);
	tcomplain.setBounds(insets.left+230,insets.top+50+50+50+50+50,300,80);

      ok.setBounds(insets.left+150,insets.top+50+50+50+50+50+50+50,150,30);

	    
	    
	    
        
       

        setSize(600,600);
        setVisible(true);        
    }
    
    
     public void actionPerformed(ActionEvent event){};
public void itemStateChanged(ItemEvent event){};
	

    
    }