public class TDD{
	public static void main(String[] arg)
	{
		School school=new School();
		school.schoolname="alameen";
		school.place="kulapully";
		school.print();

		school.class1.std=8;
		school.class1.teacher1.trname="anu";
		school.class1.student1.rno=101;
		school.class1.student1.stname="riya";
		school.class1.student2.rno=102;
		school.class1.student2.stname="manu";

		school.class1.print();
		school.class1.teacher1.print();
		school.class1.student1.print();
		school.class1.student2.print();


		school.class2.std=10;
		school.class2.teacher2.trname="diya";
		school.class2.student1.rno=201;
		school.class2.student1.stname="sunil";
		school.class2.student2.rno=202;
		school.class2.student2.stname="raj";

		school.class2.print();
		school.class2.teacher2.print();
		school.class2.student1.print();
		school.class2.student2.print();
		
	}
}

