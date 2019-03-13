import java.util.*;
class Tdd
{
public static void main(String[] args)
{
int i;
Car detail=new Car();
Tyre [] tyre=new Tyre[6];
Door [] door=new Door[6];
Stear stear=new Stear();
detail.getdata();
detail.display();
for(i=1;i<=4;i++)
{
tyre[i].getdata();
tyre[i].display();
}
for(i=1;i<=4;i++)
{
door[i].getdata();
door[i].display();
}
stear.getdata();
stear.display();
}
}

