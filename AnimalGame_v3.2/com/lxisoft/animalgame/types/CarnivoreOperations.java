package com.lxisoft.animalgame.types;
import com.lxisoft.animalgame.animalproperty.Animal;
public class CarnivoreOperations extends Animal implements Carnivores
{
	public void eatMeat(Animal a)
	{
		System.out.println("\t"+this.getname1()+" EATS "+a.getname1());
		this.setHunger(this.getHunger()+(a.getStrength()/2));
		this.setStrength(getStrength()+2);
	}
	public void kills(Animal a)
	{
		System.out.println("\t"+this.getname1()+" KILLS "+a.getname1());
		this.setHunger(a.getStrength()-1);
	}
}