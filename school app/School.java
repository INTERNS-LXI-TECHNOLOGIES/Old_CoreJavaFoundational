public class School

{
	String schoolname;
	String place;
	Classroom class1=new Classroom();
	Classroom class2=new Classroom();
public void print()
{
	System.out.println(" name of the school is "+schoolname);
	System.out.println("situated in "+place);
}

}