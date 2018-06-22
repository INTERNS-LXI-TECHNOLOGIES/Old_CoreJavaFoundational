package com.lxisoft.animalgame.animals;
import com.lxisoft.animalgame.types.HerbivoreOperation;
import com.lxisoft.animalgame.animalproperty.Animal;
public class Zebra extends HerbivoreOperation
{		
	public Zebra(int s, int h, int r)
	{			
		setFName("ZEBRA");
		setName('Z');
		setStrength(s);
		setHunger(h);
		setRoaming(r);
	}

}