package pres;


import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;

import javax.swing.*;

class MedFra extends JFrame implements ActionListener{
	
    
	private static final long serialVersionUID = -1327394142605046250L;
	private JLabel name,type,unit,doze,remarks,duration,med;
    private JTextField tduration;
    private JButton ok;    
    private Uni_com cunit;
    private Doz_com cdoze;
    private Typ_com ctype;
    private Rem_com cremarks;
    String id;
  
	MedFra(String traNam,String medId){
		
		super("Medicine Selection Frame");
		
		//setLocationRelativeTo(LEFT);
	   id=medId;
		JPanel panel=new JPanel(null);
        Container con  = getContentPane();
        con.setLayout(null);
	    panel.setLayout(null);
		
		type = new JLabel("Type :");
	        unit = new JLabel("Unit :");
		med = new JLabel(traNam);
	        doze = new JLabel("Doze :");
		name= new JLabel("Medicine Name:");
		
		
		
		
	        duration= new JLabel("Duration :");
		remarks= new JLabel("Remarks :");
		cdoze = new Doz_com(medId);
		
		ctype = new Typ_com(medId);
		
		cunit = new Uni_com(medId);
		
		cremarks = new Rem_com(medId);
		
		tduration= new JTextField();
		ok = new JButton("OK");
		
		//
		
		name.setFont( new Font( "Serif", Font.BOLD + Font.ITALIC, 20 ) );
		type.setFont( new Font( "Serif", Font.BOLD + Font.ITALIC, 18 ) );
		unit.setFont( new Font( "Serif", Font.BOLD + Font.ITALIC, 18 ) );
		doze.setFont( new Font( "Serif", Font.BOLD + Font.ITALIC, 18 ) );
		
		remarks.setFont( new Font( "Serif", Font.BOLD + Font.ITALIC, 18 ) );
		duration.setFont( new Font( "Serif", Font.BOLD + Font.ITALIC, 18 ) );
   //   g.drawString( "Serif 12 point bold.", 20, 50 );
		
	       con.add(panel);
	        panel.setBounds(0,0,50,100);
		
		con.add(name);
		con.add(med);
        con.add(doze);
        con.add(duration);
     	con.add(remarks);
        con.add(cdoze);
        con.add(cremarks);
		con.add(tduration);
		con.add(type);
		con.add(unit);
		con.add(ctype);
		con.add(cunit);
		con.add(ok);
		
		ok.addActionListener(this);
		        
        Insets insets = con.getInsets();
        
        name.setBounds(insets.left+50,insets.top+50,200,30);
	    type.setBounds(insets.left+100,insets.top+50+50,100,30);
	    unit.setBounds(insets.left+100,insets.top+50+50+50,100,30);
        doze.setBounds(insets.left+100,insets.top+50+50+50+50,100,30);
        remarks.setBounds(insets.left+100,insets.top+50+50+50+50+50,100,30);
	    duration.setBounds(insets.left+100,insets.top+50+50+50+50+50+50,100,30);    
    
	
	med.setBounds(insets.left+210,insets.top+50,200,30);
	ctype.setBounds(insets.left+210,insets.top+50+50,150,30);
	cunit.setBounds(insets.left+210,insets.top+50+50+50,150,30);
	cdoze.setBounds(insets.left+210,insets.top+50+50+50+50,150,30);
	cremarks.setBounds(insets.left+210,insets.top+50+50+50+50+50,150,30);
	tduration.setBounds(insets.left+210,insets.top+50+50+50+50+50+50,150,30);
	
	ok.setBounds(insets.left+100+50,insets.top+50+50+50+50+50+50+60,110,35);
	
	setVisible(true);
	setSize(600,600);
	
	
               
    }

	public void actionPerformed(ActionEvent ae) {
		
		
		setVisible(false);
		try {
			
			//System.out.println("insert into pat_med values ("+ InterCon.getPat() +","+ "1212" +","+ id +","+ cunit.id +","+ctype.id+","+ cdoze.id+","+ cremarks.id +","+tduration.getText()+")");
			new Sql().update("insert into pat_med values ("+ InterCon.getPat() +","+ "1212" +","+ id +","+ cunit.id +","+ctype.id+","+ cdoze.id+","+ cremarks.id +",'"+tduration.getText()+"')");
			InterCon.getPan().removeAll();
			InterCon.getPan().validate();
			InterCon.getPan().revalidate(); 
			InterCon.getPan().initPres();
			repaint();
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
        
}
