import java.util.Scanner;
public class Classroom
{
int noOfStud,i,std;

Student[] student=new Student[10];
public void setDetails()
{
Scanner s=new Scanner(System.in);
System.out.println("which standard:");
std=s.nextInt();

System.out.println("Enter the number of students:");
noOfStud=s.nextInt();

for(i=0;i<noOfStud;i++)
{

student[i]=new Student();
student[i].setDetails();
}
}
public void printDetails()
{
for(i=0;i<noOfStud;i++)
{
System.out.println("\t\t\tHOLY FAMILY C.G.H.S.S,THRISSUR");
System.out.println("\t\t\t------------------------------");
System.out.println("\t\t\t\t"+std+" STANDARD\n");
student[i].printDetails();
}
}





}