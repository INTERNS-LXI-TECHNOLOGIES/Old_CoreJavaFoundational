package com.lxisoft.metrov2.metro;

public class MetroDetails
{
	Metro metro = new Metro();
	
	String metroName = metro.getmetroName();
	
	public void metroDetail()
	{
		System.out.println("Metro name::" + metroName);
	}
}