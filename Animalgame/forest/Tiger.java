package com.lxisoft.Animalgame.forest;
import com.lxisoft.Animalgame.forest.Carnivor;
import java.lang.Math.*;
public class Tiger extends Animal implements Carnivor
{
	public Tiger()
	{
		name="Tiger";
		energyLevel=(int)(Math.random()*9);
		hungryLevel=(int)(Math.random()*5);
	}

}