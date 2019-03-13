import java.util.*;
class Tyre
{
String tmfgDate,tBrand;
int i;
Scanner n=new Scanner(System.in);
void getdata()
{
for(i=1;i<=4;i++)
{
tyre[i]=new Tyre();
System.out.println("Enter the manufacturing date of tyre ");
tyre[i].tmfgDate=n.nextLine();
System.out.println("Enter the Brand of tyre");
tyre[i].tBrand=n.nextLine();
}
}
void display()
{
System.out.println("\nmanufacturing date of tyre:"+tmfgDate+"\nBrand of tyre:"+tBrand);
}
}