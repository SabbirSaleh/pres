package pres;
import javax.swing.*;

class PopPan  extends DockedPan{
	private static final long serialVersionUID = -855737555596821209L;

	PopPan(int y,int x,int width,int height)
	{
		super(y,x,width,height);
		    // Create the menu bar
	//	Container container = getContentPane();
	    //  container.setLayout( null );

    // Create a menu
    JMenu menu = new JMenu("Menu Label");
   /// c.add(menu);

    // Create a menu item
    JMenuItem item = new JMenuItem("Item Label");
    //item.addActionListener(actionListener);
    menu.add(item);

   // JFrame frame = new JFrame();
    // Install the menu bar in the frame
    //frame.setJMenuBar(menuBar);
	 
  }
		
	}



