package com.lxisoft.animalgame.animal;
import com.lxisoft.animalgame.animal.*;
import com.lxisoft.animalgame.animaltype.*;

import java.io.*;
import java.util.*;
public class Tiger extends CarnivorousAnimal
{
	Random ran=new Random();
	public Tiger(int id)
	{
		setName("Tiger"+String.valueOf(id));
		setStrength(ran.nextInt(10));
		setReach(ran.nextInt(2));
		setHunger(ran.nextInt(10));
		findloc();
		
		
	}
	
	
}