import java.util.*;
class Door
{
String dB,dmfgDate;
Scanner in =new Scanner(System.in);
void display(int i)
{
System.out.println("Door"+i+"\n\t Brand:"+dB+"\n\tManufacturing Date:"+dmfgDate);
}
void getData(int j)
{ 

System.out.print("\nDoor "+j+": ");
dB=in.nextLine();
dmfgDate=in.nextLine();
}
}
