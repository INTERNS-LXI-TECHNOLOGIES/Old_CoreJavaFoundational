import java.util.Scanner;
public class Tdd
{

public static void main(String[] args) 
{
int i,num;
System.out.println("how many car you want:");
Scanner n=new Scanner(System.in);
num=n.nextInt();
Car[] c=new Car[num];
for(i=0;i<num;i++)
{
c[i]=new Car();
Scanner s=new Scanner(System.in);
System.out.println("Enter the name,price of the car:");
c[i].name=s.nextLine();
c[i].price=s.nextInt();
}
for(i=0;i<num;i++)
{
int a = i+1;
System.out.println("enter the details of  " +a+"th car");
c[i].details();
}
for(i=0;i<num;i++)
{
int a = i+1;
System.out.println("Print the details of  " +a+ "th car");
System.out.println(" car name:"+c[i].name);
System.out.println("price:"+c[i].price);
c[i].display();
}
}
}