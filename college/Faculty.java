public class Faculty
{
	String name;
	public Faculty(String name)
	{
		this.name=name;
	}
	void detailsf()
	{
		System.out.println("Faculty name is:"+name);
		Classroom cr=new Classroom("semester 7");
		cr.detailsc();
	}
}