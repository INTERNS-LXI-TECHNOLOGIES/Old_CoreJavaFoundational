package com.lxisoft.requirements;
import java.util.*;
public class Dice
{
int diceVal;

public int getDiceValue()
{
	Random r=new Random();
	diceVal=r.nextInt(6-1)+1;
	return diceVal;
}

}