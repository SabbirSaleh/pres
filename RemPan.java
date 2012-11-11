package pres;

class RemPan extends DockedPan{
	
	
	private static final long serialVersionUID = 1009199335274781889L;
	private GRem_com com_pan;
	
	public RemPan(int y,int x,int width,int height)
	{
		super(y,x,width,height);
		com_pan=new GRem_com();
		addLabel("Add Remarks");
		add(com_pan);
		
	}	

}
