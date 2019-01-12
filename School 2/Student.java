import java.util.Scanner;
public class Student{
	String name;
	String languageMark;
	String englishMark;
	String mathsMark;
	String scienceMark;
	String socialMark;
	int totalMark;
	Scanner scan = new Scanner(System.in);
public void marks(){
	System.out.println("Enter Mark In Language");
	languageMark = scan.nextLine();
	System.out.println("Enter Mark In English");
	englishMark = scan.nextLine();
	System.out.println("Enter Mark In Maths");
	mathsMark = scan.nextLine();
	System.out.println("Enter Mark In Science");
	scienceMark = scan.nextLine();
	System.out.println("Enter Mark In Social");
	socialMark = scan.nextLine();
	totalMark = Integer.parseInt(languageMark)+Integer.parseInt(englishMark)+Integer.parseInt(mathsMark)+Integer.parseInt(scienceMark)+Integer.parseInt(socialMark);
}

public void display(){

	System.out.println("Language      = "+languageMark);
	System.out.println("English       = "+englishMark);
	System.out.println("Maths         = "+mathsMark);
	System.out.println("Science       = "+scienceMark);
	System.out.println("Social        = "+socialMark);
}
}