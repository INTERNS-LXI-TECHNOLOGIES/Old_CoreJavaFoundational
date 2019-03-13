import java.util.*;
class Car
{
public Car(String name)
{
this.name=name;
}

Tyre [] t1=new Tyre[5]; 
Door [] d1=new Door[5];
int i,j;
Scanner in =new Scanner(System.in);
String regNo,mfgDate,name,col;
void display()
{
System.out.print("--------------------------------\n");
System.out.println("\nNAME:"+name+"\nColour:"+col+"\nRegistration no:"+regNo+"\nManufacturing date:"+mfgDate);
System.out.print("Tyres:\n");
for( j=1;j<5;j++)
{
t1[j].display(j);
}
System.out.print("Doors:\n");
for( j=1;j<5;j++)
{
d1[j].display(j);
}
System.out.print("--------------------------------\n");
}

void getData(int i)
{
System.out.println("Details of Car "+i+"\nCar name:");
name=in.nextLine();
System.out.println("Enter the car colour:");
col=in.nextLine();
System.out.println("Enter the car manufacturing date:");
mfgDate=in.nextLine();
System.out.println("Enter the car registration no:");
regNo=in.nextLine();
System.out.println("Enter Tyre details\nBrand name-Manufacturing date:");
for( j=1;j<5;j++)
{
t1[j]=new Tyre();
t1[j].getData(j);
}
System.out.println("Enter Door details\nBrand name-Manufacturing date:");
for( j=1;j<5;j++)
{
d1[j]=new Door();
d1[j].getData(j);
}

}
}