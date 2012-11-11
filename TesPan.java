package pres;

class TesPan extends DockedPan{
	
	
	private static final long serialVersionUID = 1009199335274781889L;
	private Tes_com com_pan;
	
	public TesPan(int y,int x,int width,int height)
	{
		super(y,x,width,height);
		com_pan=new Tes_com();
		addLabel("Add a Test   ");
		add(com_pan);
		
	}	

}
