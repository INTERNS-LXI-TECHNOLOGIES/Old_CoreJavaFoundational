package org.unicef.inherit.test;
import org.unicef.inherit.animal.Animal;
import org.unicef.inherit.animal.carnivorus.Carnivorus;
import org.unicef.inherit.animal.herbivorus.Herbivorus;
public class TDD
{
	public static void main(String args[])
	{
		System.out.println("There exists a forest");
		Animal a=new Animal();
		Carnivorus c=new Carnivorus();
		Herbivorus h=new Herbivorus();
		a.di();
		a.setname1("animal name is Tiger");
		String v1=a.getname1();
		System.out.println(v1);
		c.show();
		c.di1();
		
		a.setname2("animal name is deer");
		String v2=a.getname2();
		System.out.println(v2);
		
		h.show1();
		h.di2();
	}
}