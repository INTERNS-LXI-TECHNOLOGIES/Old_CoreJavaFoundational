import java.util.Scanner;
public class Metro
{
String destin,name;
int noOfTick;
Train[] trains=new Train[6];
String times[]=new String[5];
Passenger[] passenger=new Passenger[10];
Scanner scan=new Scanner(System.in);
public Metro()
{
for(int i=0;i<6;i++)
{
trains[i]=new Train();
}
System.out.println("WELCOME TO THRISSUR RAILWAY STATION");
}
public void trainDetails()
{
System.out.println("Train going places are\n1.Trivandrum \n2.Ernamkulam\n3.Kottayam\n4.Palakkad\n5.Kozhikode\n");
System.out.print("Destination:");
destin=scan.nextLine();
	
trains[0].name="Amritha Express";
trains[1].name="Trivandrum Express";
trains[2].name="Ernamkulam Passenger";
trains[3].name="Palakkad Express";
trains[4].name="Thrissur Passenger";
trains[5].name="Bangalore Express";

times[0]="9.00 am";
times[1]="1.00 pm";
times[2]="3.00 pm";
times[3]="10.00 am";
times[4]="2.00 pm";


if(destin.equals("Trivandrum")||destin.equals("trivandrum")||destin.equals("TRIVANDRUM"))
{
System.out.println("1."+trains[0].name+" "+times[0]+"\n2."+trains[1].name+" "+times[1]+"\n");
int choice=scan.nextInt();
switch(choice)
{
case 1:
break;
case 2:
break;
default:System.out.println("Trains not available");
}
}
else if(destin.equals("Ernamkulam")||destin.equals("ernamkulam")||destin.equals("ERNAMKULAM"))
{
System.out.println("1."+trains[0].name+" "+times[0]+"\n2."+trains[1].name+" "+times[1]+"\n3."+trains[2].name+" "+times[3]+"\n");
int choice=scan.nextInt();
switch(choice)
{
case 1:
break;
case 2:
break;
case 3:
break;
default:System.out.println("Trains not available");
}
}
else if(destin.equals("Kottayam")||destin.equals("kottayam")||destin.equals("KOTTAYAM"))
{
System.out.println("1."+trains[0].name+" "+times[0]+"\n2."+trains[1].name+" "+times[1]+"\n");
int choice=scan.nextInt();
switch(choice)
{
case 1:
break;
case 2:
break;
default:System.out.println("Trains not available");
}
}
else if(destin.equals("Palakkad")||destin.equals("palakkad")||destin.equals("PALAKKAD"))
{
System.out.println("1."+trains[3].name+" "+times[3]+"\n2."+trains[4].name+" "+times[4]);
int choice=scan.nextInt();
switch(choice)
{
case 1:
break;
case 2:
break;
default:System.out.println("Trains not available");
}
}
else if(destin.equals("Kozhikode")||destin.equals("kozhikode")||destin.equals("KOZHIKODE"))
{
System.out.println("1."+trains[5].name+" "+times[4]+"\n2."+trains[0].name+" "+times[0]);
int choice=scan.nextInt();
switch(choice)
{
case 1:
break;
case 2:
break;
default:System.out.println("Trains not available");
}
}
}


public void printDetails()
{
System.out.print("Number of tickets:");
noOfTick=scan.nextInt();
for(int i=0;i<noOfTick;i++)
{
passenger[i]=new Passenger();
System.out.println("\tPassenger Details");
passenger[i].setDetails();
}
for(int i=0;i<noOfTick;i++)
{
passenger[i].printDetails();
System.out.println("Destinaion:"+destin+"\n");
}
}
}
