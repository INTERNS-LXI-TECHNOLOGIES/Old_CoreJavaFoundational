import java.util.Scanner;
public class School
{
int noOfClass,i;

Classroom[] classroom=new Classroom[10];
public void setDetails()
{
Scanner s=new Scanner(System.in);
System.out.println("HOLY FAMILY C.G.H.S.S,THRISSUR");
System.out.println("how many classes are there:");
noOfClass=s.nextInt();

for(i=0;i<noOfClass;i++)
{

classroom[i]=new Classroom();
classroom[i].setDetails();

}
}
public void printDetails()
{
for(i=0;i<noOfClass;i++)
{

classroom[i].printDetails();
}
}



}