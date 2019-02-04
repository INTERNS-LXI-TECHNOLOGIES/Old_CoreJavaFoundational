package com.lxisoft.forest;
import com.lxisoft.animal.*;
public class Forest
{
Animal[] animals;

public void setAnimalDetails()
{
	

animals=new Animal[12];

for(int i=0;i<3;i++)
{
animals[i]=new Tiger();
animals[i].setName("Tiger"+(i+1));
}

for(int i=3;i<6;i++)
{
animals[i]=new Lion();
animals[i].setName("Lion"+(i-2));
}
	
for(int i=6;i<9;i++)
{
	animals[i]=new Rabbit();
	animals[i].setName("Rabbit"+(i-5));
}

for(int i=9;i<12;i++)
{
	animals[i]=new Deer();
	animals[i].setName("Deer"+(i-8));
}
	
System.out.println("AVAILABLE ANIMALS");
System.out.println("_________________");


for(int i=0;i<3;i++)
{
	System.out.println(animals[i].getName());
}

for(int i=3;i<6;i++)
{
	System.out.println(animals[i].getName());
}

for(int i=6;i<9;i++)
{
	System.out.println(animals[i].getName());
}

for(int i=9;i<12;i++)
{
	System.out.println(animals[i].getName());
}
System.out.println("   ");
}
public void fight()
{
	int animal1,animal2;
animal1=(int)(Math.random()*12);
animal2=(int)(Math.random()*12);
System.out.println("AVAILABLE ANIMALS WHO IS READY TO FIGHT AND THEIR STRENGTH LEVELS & CORRESPONDING LOCATIONS");
System.out.println("___________________________________________________________________________________________");
int strength1=animals[animal1].strength();
int strength2=animals[animal2].strength();
int locationX1=animals[animal1].locationX();
int locationY1=animals[animal1].locationY();
int locationX2=animals[animal2].locationX();
int locationY2=animals[animal2].locationY();
int d1=Math.abs(locationX1-locationX2);
int d2=Math.abs(locationY1-locationY2);
System.out.println("Animal="+animals[animal1].getName()+" strength="+strength1+" location="+locationX1+","+locationY1);
System.out.println("Animal="+animals[animal2].getName()+" strength="+strength2+" location="+locationX2+","+locationY2);
System.out.println(d1);
System.out.println(d2);

if(d1<=10 && d2<=10)
{
	
	if(strength1>strength2)
{
	System.out.println("Will fight");
	System.out.println(animals[animal1].getName()+" win....");
}
else
{
	System.out.println(animals[animal2].getName()+" win....");
}

}
else
{
	System.out.println("Will not fight");
}
/*if(d1<0 && d2<0)
{
	d1=-(d1);
	d2=-(d2);
	System.out.println(d1);
	System.out.println(d2);
}
else if(d1<0 || d2>0)
{
	d1=-(d1);
	System.out.println(d1);
}
else if(d2<0 || d1>0)
{
	d2=-(d2);
	System.out.println(d2);
}*/
}
/*
if(strength1>strength2)
{
	System.out.println(animals[animal1].getName()+" win....");
}
else
{
	System.out.println(animals[animal2].getName()+" win....");
}*/

}