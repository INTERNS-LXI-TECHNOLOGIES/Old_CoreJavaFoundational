import java.util.Scanner;
public class Car
{
String brandName;
String modelName;
  String modelNum;
 
Tyre t1,t2,t3,t4;
Door d1,d2,d3,d4;
Stearing s;

Car(){}

Car(String brandName,String modelName,String modelNum)
{
	this.brandName=brandName;
	this.modelName=modelName;
	this.modelNum=modelNum;
}

public void fixDoor(Door d1,Door d2,Door d3,Door d4)
{
	this.d1=d1;
	this.d2=d2;
	this.d3=d3;
	this.d4=d4;
}
public void fixTyre(Tyre t1,Tyre t2,Tyre t3,Tyre t4)
{
	this.t1=t1; 
	this.t2=t2; 
	this.t3=t3; 
	this.t4=t4;
}
public void fixStearing(Stearing s)
{
	this.s=s;
} 
public void printDetails()
{
	System.out.println("Brandname:" +this.brandName);
	System.out.println("Modelname:" +this.modelName);
	System.out.println("Modelnumber:" +this.modelNum);
	System.out.println(" ");



	System.out.println("Tyre details");	
	this.t1.printDetails();
	this.t2.printDetails();
	this.t3.printDetails();
	this.t4.printDetails();
	
	System.out.println("Door details");
	this.d1.printDetails();
	this.d2.printDetails();
	this.d3.printDetails();
	this.d4.printDetails();
	
	this.s.printDetails();
}	

public void getDetails()
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Car Details");
	System.out.println("Type Brandname:");
	this.brandName = scan.next();
	System.out.println("Type Modelname:");
	this.modelName = scan.next();
	System.out.println("Type Modelnumber:");
	this.modelNum = scan.next();
}	
}	
	
