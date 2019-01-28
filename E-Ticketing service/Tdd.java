import java.util.Scanner;
public class Tdd
{
public static void main(String args[])
{
	int p;
	Scanner scan=new Scanner(System.in);
	
	System.out.println("                           ");
	System.out.println("WELCOME TO E-TICKET SERVICE");
	System.out.println("                           ");

	Train train=new Train();
	train.trainDetails();
}  
}