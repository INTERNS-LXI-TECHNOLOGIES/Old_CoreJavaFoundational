public class Door
{
	int serialNo;
	
	String colour;	
	String comp;
	String type;

	Door(int serialNo , String colour , String comp , String type)
	{
		this.serialNo = serialNo;
		this.colour = colour;
		this.comp = comp;
		this.type = type;
	}
	

	public void printDetails()
	{
		System.out.println(" Door " + this.serialNo);
		System.out.println(" Color : " + this.colour);
		System.out.println(" Company : " + this.comp);
		System.out.println(" Type : " + this.type);
		System.out.println(" ");
	}
}
