package pres;

class MedPan extends DockedPan{
	
	
	private static final long serialVersionUID = 1009199335274781889L;
	private Med_com com_pan;
	
	public MedPan(int y,int x,int width,int height)
	{
		super(y,x,width,height);
		com_pan=new Med_com();
		addLabel("Add a Medicine");
		add(com_pan);
		
	}	

}
