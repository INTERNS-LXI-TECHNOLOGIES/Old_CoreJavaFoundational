public class College
{
	String name;
	String location;
	Department[] deps=new Department[2];
	int i;
	public College(String name,String location)
	{
		this.name=name;
		this.location=location;
		setdetails();
	}
	void setdetails()
	{
		deps[0]=new Department("CSE","Ganesh");
		deps[1]=new Department("ECE","Sushama");
	}
	void details()
	{
		System.out.println("CollegeName:"+name);
		System.out.println("Location:"+location);
		for(i=0;i<2;i++)
		{
		deps[i].output();
		}
	}
		
	
	
}

	