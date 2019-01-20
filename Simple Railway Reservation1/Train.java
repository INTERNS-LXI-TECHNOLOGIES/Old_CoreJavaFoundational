import java.util.Scanner;
public class Train
{
String trainNo;
String trainName;
Coach coach;

Scanner scan=new Scanner(System.in);

public void setTrainDetails()
{
	System.out.print("Train No:");
	trainNo=scan.next();
	System.out.print("Train Name:");
	trainName=scan.next();
}

public void printTrainDetails()
{
	System.out.println("Train No &  Name:"+trainNo+"/"+trainName+" Exp");
}

}