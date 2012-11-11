package pres;

import javax.swing.*;

import java.awt.*;

class DockedPan extends JPanel
{
	
	private static final long serialVersionUID = 1L;
	
	private JLabel label;
	

	
	
	DockedPan(int y,int x,int width,int height)
	{
		initPan(x,y,width,height);
		
	}
	
	void initPan(int y,int x,int width,int height)
	{	
		
		//sets the panel's size and border
		setBounds(MainFrame.retWidth(y),MainFrame.retHeight(x),MainFrame.retWidth(width),MainFrame.retHeight(height));
		setBorder(BorderFactory.createLineBorder(Color.GRAY,2));
			 
		
	}
	
	void addLabel(String name)
	{
		label=new JLabel(name);
		add(label);
		
	}
	
	
	
}
