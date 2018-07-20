 public class College
{
	String name;
	String location; 
	public College(String name,String location)
	{
	this.name=name;
	this.location=location;
	}	
	void details()
	{	
	System.out.println("name of the college:"+name);
	System.out.println("location of the college:"+location); 
	Department D=new Department("cse");
	D.detailsD();
	
	}

}