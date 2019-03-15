import java.util.*;
class Car
{
	Tyre [] tyres =new Tyre[4];
	Door [] doors =new Door[4];
    Stearing stearing=new Stearing();
	String regNo="A7733",mfgDate="02/03/19",Brand="Suzuki";
void displayDetails()
{
System.out.println("\nBrand:"+Brand+"\nRegister number:"+regNo+"\nManufacturing Date:"+mfgDate);

for(int i=0;i<2;i++)
{
tyres[i].displayDetails();
}
for(int i=0;i<2;i++)
{
doors[i].displayDetails();
System.out.print("Door"+i);
}
stearing.displayDetails();
}
void setData()
{

for(int i=0;i<2;i++)
{
tyres[i]=new Tyre();
System.out.print("Tyre"+(i+1));
tyres[i].setData();

}
for(int i=0;i<2;i++)
{
doors[i]=new Door();
System.out.print("Door"+(i+1));
doors[i].setData();

}
stearing.setData();
}
}

