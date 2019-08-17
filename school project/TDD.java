public class TDD
{
public static void main(String[] args)
{
	School s1=new School();
	s1.name="SNMIMT";
	s1.id=1212;
	s1.c.std=8;
	s1.c.div="c";
	s1.c1.std=9;
	s1.c1.div="b";
	s1.c.t1.name="Maya";
	s1.c.t1.sub="English";
	s1.c1.t2.name="Sruthi";
	s1.c1.t2.sub="Chemistry";
	s1.c.st1.name="Athulya";
	s1.c.st1.id=5;
	s1.c1.st2.name="Akhil";
	s1.c1.st2.id=5;
	System.out.println("\t\t\t\t"+s1.name+"\n\t\t\tschool id - "+s1.id+"\n\nclass 1 std-"+s1.c.std+"\t\t\t\t\t\tclass 2 std-"+s1.c1.std+"\ndivision-"+s1.c.div+"\n\t\t\t\t\t\t\tdivision-"+s1.c1.div+"\nName of the teacher-"+s1.c.t1.name
	+"\t\t\t\tName of the teacher-"+s1.c1.t2.name+"\n Name of the subject"+s1.c.t1.sub+"\t\t\t\t Name of the subject"+s1.c1.t2.sub+"\nName of the student-"+s1.c.st1.name+"\t\t\t\tName of the student-"+s1.c1.st2.name+"\nRollNo-"+s1.c.st1.id
	+"\t\t\t\t\t\tRollNo-"+s1.c1.st2.id);
	
	
	 
	}
}