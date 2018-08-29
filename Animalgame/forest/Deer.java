package com.lxisoft.Animalgame.forest;
import com.lxisoft.Animalgame.forest.Herbivor;
import java.lang.Math.*;
public class Deer extends Animal implements Herbivor
{
	public Deer()
	{
		name="Deer";
		energyLevel=(int)(Math.random()*5);
		hungryLevel=(int)(Math.random()*4);
	}
}