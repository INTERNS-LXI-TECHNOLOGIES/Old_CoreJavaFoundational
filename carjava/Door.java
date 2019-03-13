import java.util.*;
class Door
{
String dmfgDate,dBrand;
int i;
Scanner n=new Scanner(System.in);
void getdata()
{
for(i=1;i<=4;i++)
{
door[i]=new Door();
System.out.println("Enter the manufacturing date of door");
door[i].dmfgDate=n.nextLine();
System.out.println("Enter the Brand of door");
door[i].dBrand=n.nextLine();
}
}
void display()
{
System.out.println("\nManufacturing date of door:"+dmfgDate+"\nBrand of door:"+dBrand);
}
}