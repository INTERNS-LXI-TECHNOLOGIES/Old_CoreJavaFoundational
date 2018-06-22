package com.lxisoft.animalgame.animals;
import com.lxisoft.animalgame.types.CarnivoreOperations;
import com.lxisoft.animalgame.animalproperty.Animal;
public class Tiger extends CarnivoreOperations{
		
	public Tiger(int s, int h, int r){
			
		setFName("TIGER");
		setName('T');
		setStrength(s);
		setHunger(h);
		setRoaming(r);
	}
}

