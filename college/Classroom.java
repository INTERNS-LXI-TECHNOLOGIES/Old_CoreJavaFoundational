public class Classroom
{
	String name;
	public Classroom(String name)
	{
		this.name=name;
	}
	void detailsc()
	{
		System.out.println("classroom name:"+name);
		Student stu=new Student("kavull",36);
		stu.detailss();
		}
}