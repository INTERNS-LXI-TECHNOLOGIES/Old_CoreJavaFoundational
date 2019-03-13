import java.util.*;
class Tdd
{
public static void main(String arg[])
{
int i,n;
Car [] c1=new Car[10]; 
Scanner in =new Scanner(System.in);
System.out.println("Enter the no.of car:");
n=in.nextInt();
for(i=1;i<=n;i++)
{
c1[i]=new Car();
c1[i].getData(i);
}

for(i=1;i<=n;i++)
{
System.out.println("CAR "+i);
c1[i].display();
}
}
}