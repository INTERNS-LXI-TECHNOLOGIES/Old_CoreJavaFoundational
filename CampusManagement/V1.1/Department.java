class Department
{
	String dep_name;
	String hod_name;
	Room[] cr=new Room[2];
	public Department(String dep_name,String hod_name)
	{
		this.dep_name=dep_name;
		this.hod_name=hod_name;
	}
	void output()
	{
		System.out.println("Department Name:"+dep_name);
		System.out.println("Hod Name:"+hod_name);
	}
		
	
}