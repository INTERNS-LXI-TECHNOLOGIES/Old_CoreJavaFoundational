public class Department
{
	String name;
	public Department(String name)
	{
		this.name=name;
	}
	void detailsD()
	{
		System.out.println("name of the department:"+name);
		Faculty F=new Faculty("vishnu");
		F.detailsf();
	}
}