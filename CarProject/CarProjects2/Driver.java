public class Driver{
	
	String name;
	int number;
	
	Driver(String name , int number)
	{
		this.name = name;
		this.number = number;
	}
	
	public void printDetails()
	{
		System.out.print("Name : " +this.name + " , ");
		System.out.print("Number : " +this.number);
	}
}
