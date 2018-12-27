import java.util.Scanner;
public class Tdd
{
public static void main(String args[])
{

Scanner scan=new Scanner(System.in);

int i,n;

System.out.println("How many records do you want to insert");
n=scan.nextInt();

Student[] students=new Student[n];

for(i=0;i<n;i++)
{

students[i]=new Student();

}

for(i=0;i<n;i++)
{

students[i].setStudentDetails();

}

for(i=0;i<n;i++)
{

students[i].printStudentDetails();

}

}
}