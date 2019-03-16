import java.util.*;
class Principal
{
	String name,age;
	Scanner n=new Scanner(System.in);

void setData()
{
	System.out.println("Enter the name of the principal: ");
	name=n.next();
	System.out.println("Enter the age of the principal: ");
	age=n.next();
	System.out.println("\t <----------------------------------->");
}
void getData()
{

	System.out.println("\nEnter the name of the principal: "+name+"\nEnter the age of the principal: "+age);
}
}