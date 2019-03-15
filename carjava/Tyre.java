import java.util.*;
class Tyre
{
String mfgDate,Brand;
Scanner n=new Scanner(System.in);
void setData()
{

System.out.println("Enter the manufacturing date of tyre ");
mfgDate=n.nextLine();
System.out.println("Enter the Brand of tyre");
Brand=n.nextLine();
}
void displayDetails()
{
System.out.println("manufacturing date of tyre:"+mfgDate+"\nBrand of tyre:"+Brand);
}
}