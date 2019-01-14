import java.util.Scanner;
public class Car
{
int regno,price,i;
String name;
Door[] door=new Door[4];
Tire[] tire=new Tire[4];
Steer st=new Steer();
Scanner s=new Scanner(System.in);
public void details()
{
for(i=0;i<4;i++)
{
door[i]=new Door();
door[i].setDetails();
}
for(i=0;i<4;i++)
{
tire[i]=new Tire();
tire[i].setDetails();
}
st.setDetails();
}
public void display()
{
for(i=0;i<4;i++)
{
door[i].printDetails();
}
for(i=0;i<4;i++)
{
tire[i].printDetails();
}
st.printDetails();
}
}