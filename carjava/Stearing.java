import java.util.*;
class Stearing
{

String mfgDate,Brand;
void setData()
{
Scanner n=new Scanner(System.in);
System.out.println("Enter the manufacturing date of stearing");
mfgDate=n.nextLine();
System.out.println("Enter the Brand of stearing");
Brand=n.nextLine();
}
void displayDetails()
{
System.out.println("\n manufacturing date of stearing:"+mfgDate+"\nBrand of steaing:"+Brand);
}
}