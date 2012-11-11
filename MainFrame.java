package pres;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class MainFrame implements ActionListener{
	static Dimension screenSize;
	private JFrame fr_main;
	
	
	private MedPan pan_med;
	private TesPan pan_tes;
	private RemPan pan_rem;
	private PresPan pan_pres;
	private InfoPan pan_info;
	private  ComPan pan_com;
	
	//private  PopPan pop_pan;
	
	
	
    JMenu menu2,menu3,menu4,menu5;
    JMenuItem menuItem;

   
	
	
	MainFrame(String patId)
	{
		InterCon.set(patId);
		InterCon.init();
		InterCon.setDat();
		initFra();
		
	}
	
	void initFra()
	{
		/*****************************************************************************/
		//Initialize frame and add components to it
		
		screenSize=Toolkit.getDefaultToolkit().getScreenSize();
		
		
		
		 JMenuBar menuBar = new JMenuBar();
		 JMenu menu1 = new JMenu("File    ");
		 menuBar.add(menu1);
		 
		  JMenuItem item1 = new JMenuItem("New");
		  menu1.add(item1);
		  menu1.addSeparator();
		//item.addActionListener(actionListener);
		  JMenuItem item2 = new JMenuItem("Save");
		  menu1.add(item2);
		  menu1.addSeparator();
		  JMenuItem item3 = new JMenuItem("Save As");
		  menu1.add(item3);
		  menu1.addSeparator();
		  JMenuItem item4 = new JMenuItem("Print");
	      menu1.add(item4);
		  menu1.addSeparator();
		  JMenuItem  item5 = new JMenuItem("Print preview");
		  menu1.add(item5);
	      menu1.addSeparator();
	      JMenuItem item6 = new JMenuItem("Close");
	      menu1.add(item6);
	      menuBar.add(menu1);	      	      	      	      	     
	      menu2 = new JMenu("View");
	      menuBar.add(menu2);		
	      menu3 = new JMenu("Database");
	      menuBar.add(menu3);
	       menuItem = new JMenuItem("New Patient");
	       menu3.add(menuItem);
	      menuItem.addActionListener(this);
	      menu3.addSeparator();
              menuItem = new JMenuItem("New Medicine");	       
	      menu3.add(menuItem);
	         menuItem.addActionListener(this);
		  menu3.addSeparator();
	      menuItem = new JMenuItem("View Patient"); 
	      menu3.add(menuItem);
	         menuItem.addActionListener(this);
		  menu3.addSeparator();	  
		  menuItem = new JMenuItem("View Medicine");
	          menu3.add(menuItem);
	         menuItem.addActionListener(this);
		  menu3.addSeparator();
	      menuItem = new JMenuItem("Edit patient");	      
	      menu3.add(menuItem);
		  menu3.addSeparator();
	      menuItem = new JMenuItem("Edit Medicine");
	      menu3.add(menuItem);			  
		  menu3.addSeparator();
	      menuItem = new JMenuItem("Report");	       
	      menu3.add(menuItem);
		  menu3.addSeparator();
	      menuItem = new JMenuItem("Test");
	      menu3.add(menuItem);
	      menu4 = new JMenu("Tools");	 
	      menuBar.add(menu4);		
	      menuItem = new JMenuItem("Select Patient");	
	      menu4.add(menuItem);
		  menu4.addSeparator();
	      menuItem = new JMenuItem("Select Medicine");
	      menu4.add(menuItem);
	      menu4.addSeparator();
	      menuItem = new JMenuItem("Select Test");
	      menu4.add(menuItem);
		  menu5 = new JMenu("Help");
	      menuBar.add(menu5);
	      menuItem = new JMenuItem("This menu is under construction.");
	      menu5.add(menuItem);
	      
	      
	      
	      
	      
	      
	      
	      
		
		
		
		fr_main=new JFrame("Prescrption");
		Container con = fr_main.getContentPane();	//get content pane
		
		//set the frame
		fr_main.setLayout(null);
		
		fr_main.setResizable(false);
		fr_main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr_main.setSize(screenSize.width,screenSize.height);	//size the frame with the screen resolution
		fr_main.setPreferredSize(screenSize);
		
		fr_main.setJMenuBar(menuBar);
		
		
		
		pan_med=new MedPan (25,0,20,50);
		con.add(pan_med);
		
		
		pan_tes=new TesPan (25,80,20,50);
		con.add(pan_tes);
		
			
		pan_rem=new RemPan (75,0,100,22);
		con.add(pan_rem);
		
		
		pan_pres=new PresPan(25,20,60,75);
		InterCon.set(pan_pres);
		con.add(pan_pres);
		//con.add(new JScrollPane(pan_pres));
		
		pan_info=new InfoPan(5,0,100,5);
		con.add(pan_info);
		
		pan_com=new ComPan(10,0,100,18);
		con.add(pan_com);
		//pop_pan=new PopPan(10,0,100,18);
		//con.add(pop_pan);
		fr_main.setVisible(true);
		
		}

	
	
	
	
	
	
	
	
	//maintains the ratio of height to fully cover the screen
	static int retHeight(int size)
	{	
		if(size>0)
		{
			
			size=screenSize.height*size/100;
						
			return size;
		}
		else return 0;
		
	}
	
	//maintains the ratio of width to fully cover the screen
	static int retWidth(int size)
	{	
		if(size>0)
		{
				size=size*screenSize.width/100;
				
				return size;
		}
		
		
		
		else return size;
		
	}

	public void actionPerformed(ActionEvent event)
    {
        
	     if(event.getActionCommand().equals("New Patient")){
		new New_pat();
	     }
	          if(event.getActionCommand().equals("View Patient")){
		    new View_pat();
	     }
	            if(event.getActionCommand().equals("New Medicine")){
		    new New_med();
	     }
	     
		     
		    }
	
	
}
