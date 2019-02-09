package com.lxisoft.forestv4.animal;
public class Hunter extends Animal implements Omnivore
{
	public int gun()
	{
	      int bullets=(int)(Math.random()*3); 
		return bullets;
	}
}