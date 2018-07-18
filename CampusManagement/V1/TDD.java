public class TDD
{
	public static void main(String[] a)
	{
		College c=new College();
		Department d1=new Department();
		Department d2=new Department();
		Department d3=new Department();
		Department d4=new Department();
		c.deps[0]=d1;
		c.deps[1]=d2;
		c.deps[2]=d3;
		c.deps[3]=d4;
		Classroom c1=new Classroom();
		Classroom c2=new Classroom();
		Classroom c3=new Classroom();
		Classroom c4=new Classroom();
		c.deps[0]=c1; 
				
	}
}
