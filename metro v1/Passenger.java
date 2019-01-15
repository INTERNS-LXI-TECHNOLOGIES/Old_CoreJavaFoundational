import java.util.Scanner;
public class Passenger
{
String passname,gender;
int aadharno,age,gen;
Scanner scan=new Scanner(System.in);
public void setDetails()
{
System.out.print("Passenger Name:");
passname=scan.nextLine();
System.out.print("Gender:");
gender=scan.nextLine();
System.out.print("Age:");
age=scan.nextInt();

System.out.print("Aaadhar Number:");
aadharno=scan.nextInt();

}
public void printDetails()
{
System.out.print("\tTicket Details\n");
System.out.print("Passenger Name:"+passname+"\n");
System.out.print("Gender:"+gender+"\n");
System.out.print("Age:"+age+"\n");
System.out.print("Aaadhar Number:"+aadharno+"\n");
}
}