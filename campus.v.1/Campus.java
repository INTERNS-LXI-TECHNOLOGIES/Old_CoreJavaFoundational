public class Campus{
	String name;
	String address;
	long number;
	Department[] d;



	public Campus(String name,String address,long number)
	{
		String hod[]={"Ganesh","Ramesh"};
		String deptName[]={"CSE","Civil"};
		this.name=name;
		this.address=address;
		this.number=number;
		d=new Department[2];
		for(int i=0;i<2;i++)
		{
			d[i]=new Department(deptName[i],hod[i]);
		}
	}
	public void printDetails()
	{
		System.out.println("\n");
		System.out.println(name);
		System.out.println(address);
		System.out.println(number);
		
		for(int i=0;i<2;i++)
		{
			d[i].printDetails();
		}
		System.out.println("\n");
	}
}