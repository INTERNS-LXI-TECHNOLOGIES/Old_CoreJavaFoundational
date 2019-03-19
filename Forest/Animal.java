import java.util.*;
public class Animal
{
	String name;
	int animalStrength;
	
public void fight(Tiger tiger,Rabbit rabbit,Bear bear,Lion lion)
{
	int l1,l2,l3;
	l1=(tiger.animalStrength>rabbit.animalStrength)?tiger.animalStrength:rabbit.animalStrength;
	l2=(bear.animalStrength>lion.animalStrength)?bear.animalStrength:lion.animalStrength;
	l3=l1>l2?l1:l2;
    System.out.println("largest is :"+l3);
    if(l3==tiger.animalStrength)
    {
    	System.out.println("tiger wins");
    }
    else if(l3==rabbit.animalStrength)
    {
    	System.out.println("rabbit wins");
    }
    else if(l3==bear.animalStrength)
    {
    	System.out.println("bear wins");
    }
    else
    {
    	System.out.println("lion wins");
    }
}
}
	