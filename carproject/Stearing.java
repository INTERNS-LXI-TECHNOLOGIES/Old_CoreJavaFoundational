public class Stearing
{
	int serialNo;

	double size;
	
	String colour;
	String type;
	String comp;

	Stearing(int serialNo , String colour , String comp , String type , double size)
	{
		this.serialNo = serialNo;
		this.colour = colour;
		this.comp = comp;
		this.type = type;
		this.size = size;
	}
	
	
	public void printDetails()
	{
		System.out.println(" sno " + this.serialNo);
		System.out.println(" Color : " + this.colour);
		System.out.println(" Company : " + this.comp);
		System.out.println(" Type : " + this.type);
		System.out.println(" Size : " + this.size);
		System.out.println(" ");
	}

}