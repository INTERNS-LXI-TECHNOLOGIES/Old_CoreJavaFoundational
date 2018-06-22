package com.lxisoft.animalgame.animals;
import com.lxisoft.animalgame.types.HerbivoreOperation;
import com.lxisoft.animalgame.animalproperty.Animal;
public class Deer extends HerbivoreOperation{
		
	public Deer(int s, int h, int r){
		
		setFName("DEER");
		setName('D');
		setStrength(s);
		setHunger(h);
		setRoaming(r);
	}
}
