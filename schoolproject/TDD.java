public class TDD{
	public static void main(String []arg)
	{
		School school=new School();
		school.name="ghss";
		school.place="tirur";
		school.class1.std=1;
		school.class1.div="A";
		school.class1.teacher1.name="riya";
		school.class1.teacher1.id=12;
		school.class1.student1.rollno=2;
		school.class1.student1.name="manu";
		school.class1.student2.rollno=4;
		school.class1.student2.name="rahul";
		
		school.class2.std=3;
		school.class2.div="B";
		school.class2.teacher2.name="diya";
		school.class2.teacher2.id=14;
		school.class2.student3.rollno=6;
		school.class2.student3.name="ninu";
		school.class2.student4.rollno=3;
		school.class2.student4.name="raj";
		
		school.print();
		System.out.println("\n");
		school.class1.print();
		school.class1.teacher1.print();
		school.class1.student1.print();
		school.class1.student2.print();
		System.out.println("\n");
		school.class2.print();
		school.class2.teacher2.print();
		school.class2.student3.print();
		school.class2.student4.print();
	}
	
	
	
}