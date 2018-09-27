public class Tyre
{
	int serialNo;

	double size;	
	String comp;

	String mfd;
	String expd;		// Expiring date

	Tyre(int serialNo , double size , String comp , String mfd , String expd)
	{
		this.serialNo = serialNo;
		this.size = size;
		this.comp = comp;
		this.mfd = mfd;
		this.expd = expd;
	}

	public void printDetails()
	{
		System.out.println(" serialNo" + this.serialNo);
		System.out.println(" Size : " + this.size);
		System.out.println(" Company : " + this.comp);
		System.out.println(" MFD : " + this.mfd);
		System.out.println(" EXPD : " + this.expd);
		System.out.println(" ");
	}
		
}
