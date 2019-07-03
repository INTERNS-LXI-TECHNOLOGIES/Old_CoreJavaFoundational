package com.lxisoft.files;
public class Dice
{
public int num;
	/*public void setNum(int num)
	{
		this.num=num;
	}
	public int getNum()
	{
		return num;
	}*/
	public int diceThrow()
	{
		for(int i=0;i<10;i++)
		{
		 num=(int)(Math.random()*6)+1;
		}
		 return num;
	}
}