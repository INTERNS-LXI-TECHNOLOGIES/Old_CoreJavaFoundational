package com.lxisoft.forestv4.animal;
import java.util.ArrayList;
public class Zebra extends Animal implements Herbivore
{
	public int checkLuck()
	{
		int luckFactor=(int)(Math.random()*100);
		return luckFactor;	
	}
	
	
}