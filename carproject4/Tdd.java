import java.util.Scanner;
public class Tdd
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);

Car[] cars;

int n,i;

System.out.println("How many records do you want to insert ?");

n=scan.nextInt();

cars=new Car[n];

for(i=0;i<n;i++)
{

cars[i]=new Car();

}

for(i=0;i<n;i++)
{
	cars[i].setCarDetails();
	
}

for(i=0;i<n;i++)
{

cars[i].printCarDetails();

}

}

}	
	