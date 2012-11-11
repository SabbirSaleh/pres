package pres;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

public class Combo extends JComboBox{


	private static final long serialVersionUID = 4664892229851007343L;
	JTextField tf;
    JComboBox combo = new JComboBox();
    ArrayList<ArrayList<String>> v = new ArrayList<ArrayList<String>> ();//it stores the list returned by database
    boolean hide_flag = false;	
    
   public Combo()
	{
	   
		initCom();
	}
	
   public void initCom() {
	
	   //v=null;
	   setEditable(true);
    
        tf = (JTextField) getEditor().getEditorComponent();
	 
		    
	    
        tf.addKeyListener	
	(new KeyAdapter()	//define an anonymous class of keyAdapter 
	    
	{
                public void keyTyped(KeyEvent e)
		{
                	
			EventQueue.invokeLater(new Runnable()
			{	
				public void run() {
					
				
				String text = tf.getText();
				
				if(text.length()==0) 
				{	
					
					//as length is O then hide popUp
					hidePopup();	
					//sets the list empty
					setModel(new DefaultComboBoxModel(), text);
				}	
				else	//else 1
				{
					//construct list with a call to another function  which will be overridden by 
					//other superclasses
					
					
					
					//text in the text filed with the current result
					
					
					//if(v.get(0).size()>0)
					//v.get(0).clear();
					
					//make a list of new reslut
					search(text);
					
					//add the result to popup
					DefaultComboBoxModel m=new DefaultComboBoxModel(v.get(0).toArray());
					//set the model
					setModel(m,text);
					
					
					
					if(m.getSize()==0 || hide_flag) 
					
				{
					//as length of popup is O then hide popUp
					setModel(new DefaultComboBoxModel(),text);
					hidePopup();
					hide_flag = false;
				}
			else
			{
				//set the model with result
				setModel(m, text);
				
				showPopup();
				
			}
		}//else 1 ending
		}//EventQueue.invokeLater ending
        });
	}
                public void keyPressed(KeyEvent e)
	{
			
		String text = tf.getText();
		int code = e.getKeyCode();
		
             
		if(code==KeyEvent.VK_ENTER) 
	{
		
		hide_flag = true;
		
		
		
		//if typed items matched with the list returned by database 
		try{
			
		for(int loop=0;loop<v.get(0).size();loop++)
		{	
		
			
			if(text.equals(v.get(0).get(loop)))
			{
				
				
				//open a frame to slelect medicine
				//get the id of medicine matches with text
				//and send it to medicine frame
				//and initialize comboox
				//empty the vector
				
				String Nam=v.get(0).get(loop);
				String Id=v.get(1).get(loop);
				
				
				
				
				select(Nam,Id);
				
				return;
				
			}				
			
		}
		}
		catch (NullPointerException e1)
		{
			System.out.println(e1+"hello");
		}
		
		
		
		
	}
           
	 
        else if(code==KeyEvent.VK_ESCAPE)
	{
            hide_flag = true; //it will make the pop up hide
        }
	else if(code==KeyEvent.VK_RIGHT) 
	{
		
            for(int i=0;i<v.get(0).size();i++)
	   {
            
		   String str = v.get(0).get(i);
                if(str.startsWith(text)) 
		{
                    //text in the textFiled mathces with a value in the list
                	//make it the text value in CBOx
                	setSelectedIndex(-1);
                    tf.setText(str);
                    return;
                }
            }
        }
            }
      });
      
       
       // setModel(new DefaultComboBoxModel(v.toArray()), "");
       
        
    }
    
      void setModel(DefaultComboBoxModel mdl, String str) 
    {
	
        setModel(mdl);
        setSelectedIndex(-1);
        tf.setText(str);
        
    }
	
    
    
    
    
    void search(String str)
    {
    	//dummy method
    
    }
    
    void select (String str,String val)
    {
    	//dummy method
    }
    
    
    
    }