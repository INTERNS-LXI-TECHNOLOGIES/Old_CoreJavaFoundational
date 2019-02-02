package com.lxisoft.Animalgame.forest;
import com.lxisoft.Animalgame.forest.Carnivor;
import java.lang.Math.*;
public class Lion extends Animal implements Carnivor
{
	public Lion()
	{
		
		energyLevel=(int)(Math.random()*10);
		hungryLevel=(int)(Math.random()*4);
	}
}