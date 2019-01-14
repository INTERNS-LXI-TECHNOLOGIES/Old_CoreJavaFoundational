import java.util.Scanner;
public class Student
{
int min=200,i,totMark=0;
int[] markOfSub=new int[5];
String nameOfStud;
Scanner s=new Scanner(System.in);
public void setDetails()
{
System.out.println("Enter the name of student:");
nameOfStud=s.nextLine();
System.out.println("Enter the mark of subjects :");
for(i=0;i<5;i++)
{
markOfSub[i]=s.nextInt();
}
for(i=0;i<5;i++)
{
totMark=totMark+markOfSub[i];
}

}
public void printDetails()
{

if(totMark<min)
{
System.out.println("\t\tName of student : "+nameOfStud);
for(i=0;i<5;i++)
{
System.out.println("\t\tMark of Subject "+(i+1)+":"+markOfSub[i]);
}
System.out.println("\t\tTotal mark : "+totMark);
System.out.println("\t\tStatus : Failed");
}
else
{
System.out.println("\t\tName of student : "+nameOfStud);
for(i=0;i<5;i++)
{
System.out.println("\t\tMark of Subject "+(i+1)+":"+markOfSub[i]);
}
System.out.println("\t\tTotal mark : "+totMark);
System.out.println("\t\tStatus : Passed");
}
}
}
