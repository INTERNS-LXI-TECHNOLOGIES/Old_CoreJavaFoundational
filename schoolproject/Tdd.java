public class TDD
{
	public static void main(String[] args)
	{
		School smkschool=new School();
		smkschool.intilaze();
		smkschool.classroom1.print();
		smkschool.classroom2.print();
		// smkschool.classroom1.student1.print();
		// smkschool.classroom1.student2.print();
		// smkschool.classroom1.student3.print();
		// smkschool.classroom1.teacher.print();
		
		// smkschool.classroom2.student1.print();
		// smkschool.classroom2.student2.print();
		// smkschool.classroom2.student3.print();
		// smkschool.classroom2.teacher.print();
	
		smkschool.name="smkschool";
	smkschool.classroom1.teacher.name="kundhi";
	smkschool.classroom1.student1.name="kouru";	
	smkschool.classroom1.student2.name="ravan";	
	smkschool.classroom1.student3.name="dhrona";	
	
	smkschool.classroom2.teacher.name="panjali";
	smkschool.classroom2.student1.name="bheem";
	smkschool.classroom2.student2.name="nakul";	
	smkschool.classroom2.student3.name="Sahadev";


		System.out.println(smkschool.name);
	System.out.println(smkschool.classroom1.number);
	System.out.println(smkschool.classroom1.teacher.name);
	System.out.println(smkschool.classroom1.student1.name);
	System.out.println(smkschool.classroom1.student2.name);
	System.out.println(smkschool.classroom1.student3.name);


	System.out.println(smkschool.classroom2.number);
	System.out.println(smkschool.classroom2.teacher.name);
	System.out.println(smkschool.classroom2.student1.name);
	System.out.println(smkschool.classroom2.student2.name);
	System.out.println(smkschool.classroom2.student3.name);	
	

	}
}