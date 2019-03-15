import java.util.*;
class Door
{
String mfgDate,Brand;
Scanner n=new Scanner(System.in);
void setData()
{
System.out.println("Enter the manufacturing date of doors");
mfgDate=n.nextLine();
System.out.println("Enter the Brand of doors");
Brand=n.nextLine();
}

void displayDetails()
{
System.out.println("\nManufacturing date of doors:"+mfgDate+"\nBrand of doors:"+Brand);
}
}