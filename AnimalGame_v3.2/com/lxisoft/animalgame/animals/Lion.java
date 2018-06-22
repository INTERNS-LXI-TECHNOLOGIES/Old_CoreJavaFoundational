package com.lxisoft.animalgame.animals;
import com.lxisoft.animalgame.types.CarnivoreOperations;
import com.lxisoft.animalgame.animalproperty.Animal;
public class Lion extends CarnivoreOperations
{		
	public Lion(int s, int h, int r)
	{
		setFName("LION");
		setName('L');
		setStrength(s);
		setHunger(h);
		setRoaming(r);
	}
}

