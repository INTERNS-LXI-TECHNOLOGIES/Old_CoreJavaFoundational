package com.lxisoft.test;
import com.lxisoft.forest.Forest;
import com.lxisoft.animal.*;
import java.util.*;
public class Tdd
{
public static void main(String args[])
{
	
Forest forest=new Forest();
/*
forest.setAnimalDetails();
forest.fight();*/
List<Animal> animals=createAnimals();
forest.setAnimals(animals);
forest.animalDetails();
}

public static List<Animal> createAnimals()
{
   int i;
   List<Animal>animals=new ArrayList<Animal>();
	for(i=0;i<3;i++)
	{
		Tiger t=new Tiger();
		t.setName("Tiger"+(i+1));
		t.setStrength(100);
		animals.add(t);
	}
	
	for(i=3;i<6;i++)
	{
		Lion l=new Lion();
		l.setName("Lion"+(i-2));
		l.setStrength(105);
		animals.add(l);	
    }
	
	for(i=6;i<9;i++)
{
	Rabbit r=new Rabbit();
	r.setName("Rabbit"+(i-5));
	r.setStrength(50);
	animals.add(r);
}

	for(i=9;i<12;i++)
	{
		Deer d=new Deer();
		d.setName("Deer"+(i-8));
		d.setStrength(80);
		animals.add(d);
	}
	return animals;
}

}