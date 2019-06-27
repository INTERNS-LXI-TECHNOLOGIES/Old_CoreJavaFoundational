
package com.lxisoft.Snakeladder;
import java.util.*;

public class Player
{
	private String name;
	private String coin;
	//private String color;
	private int pos;
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setCoin(String coin)
	{
		this.coin=coin;
	}
	public String getCoin()
	{
		return coin;
	}
	public void setPos(int pos)
	{
		this.pos = pos;
	}
	public int getPos()
	{
		return pos;
	}
	public String toString()
	{
		return ("Name: "+name+"Coin: "+coin);
	}
}
	// public void setColor(String color)
	// {
	// 	this.color = color;
	// }
	// public String getColor()
	// {
	// 	return color;
	// }
	
