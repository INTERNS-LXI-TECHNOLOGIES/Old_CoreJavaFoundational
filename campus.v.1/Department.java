public class Department{
	String name;
	String hodName;
	ClassName[] c;

	public Department(String name,String hodName){
		this.name=name;
		this.hodName=hodName;
		String classNames[]={"1st Year","2nd Year"};
		c=new ClassName[2];
		for(int i=0;i<2;i++)
		{
			c[i]=new ClassName(classNames[i]);
		}

	}

	public void printDetails()
	{
		System.out.println("\n");
		System.out.println("DEPARTMENT NAME:"+name);
		System.out.println("HOD NAME:"+hodName);
		System.out.println("\n");
		for(int i=0;i<2;i++)
		{
			c[i].printDetails();
		}

	}
}

	
	