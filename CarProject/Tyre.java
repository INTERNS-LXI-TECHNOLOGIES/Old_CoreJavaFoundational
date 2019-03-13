import java.util.*;
class Tyre
{
String tB,tmfgDate;
Scanner in =new Scanner(System.in);
void display(int i)
{
System.out.println("Tyre:"+i+"\n\t Brand:"+tB+"\n\tManufacturing Date:"+tmfgDate);
}
void getData(int j)
{
System.out.print("\nTyre "+j+": ");
tB=in.nextLine();
tmfgDate=in.nextLine();
}
}



