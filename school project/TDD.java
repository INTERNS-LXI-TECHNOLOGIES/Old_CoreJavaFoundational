public class TDD
{
public static void main(String[] args)
{
	School nmr=new School();
	 nmr.classroom1 = new Classroom();
	 nmr.classroom2 = new Classroom();
	nmr.classroom1.teacher= new Teacher();
	nmr.classroom2.teacher= new Teacher();
	nmr.classroom1.student1=new Student();
	nmr.classroom1.student2=new Student();
	nmr.classroom1.student3=new Student();

	nmr.classroom2.student1=new Student();
	nmr.classroom2.student2=new Student();
	nmr.classroom2.student3=new Student();

	nmr.name="MES College";
	nmr.classroom1.number=101;
	nmr.classroom2.number=102;

	nmr.classroom1.teacher.name="priya";
	nmr.classroom2.teacher.name="vishnu";
	nmr.classroom1.student1.name="ramu";
	nmr.classroom1.student2.name="somu";
	nmr.classroom1.student3.name="momu";

	nmr.classroom2.student1.name="ram";
	nmr.classroom2.student2.name="sam";
	nmr.classroom2.student3.name="pam";


	System.out.println(nmr.name);
	System.out.println(nmr.classroom1.number);
	System.out.println(nmr.classroom1.teacher.name);
	System.out.println(nmr.classroom1.student1.name);
	System.out.println(nmr.classroom1.student2.name);
	System.out.println(nmr.classroom1.student3.name);


	System.out.println(nmr.classroom2.number);
	System.out.println(nmr.classroom2.teacher.name);
	System.out.println(nmr.classroom2.student1.name);
	System.out.println(nmr.classroom2.student2.name);
	System.out.println(nmr.classroom2.student3.name);
}}