public class Tdd
{
public static void main(String[]args)

{
	School school=new School();
	school.schoolname="LSN";
	school.details();
	
	school.class1.div="5A";
	school.class1.teacher.trname="bindu";
	school.class1.student1.stname="neethu";
	school.class1.student1.id=15;
	school.class1.student2.stname="ammu";
	school.class1.student2.id=51;
	
	school.class1.details();
	school.class1.teacher.details();
	school.class1.student1.details();
	school.class1.student2.details();
	
	school.class2.div="5B";
	school.class2.teacher.trname="sindu";
	school.class2.student1.stname="geethu";
	school.class2.student1.id=25;
	school.class2.student2.stname="anu";
	school.class2.student2.id=52;
	
	school.class2.details();
	school.class2.teacher.details();
	school.class2.student1.details();
	school.class2.student2.details();
	
	
}
}
	
	
	
	
	
	
	
