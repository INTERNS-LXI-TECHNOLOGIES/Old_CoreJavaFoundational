package com.lxisoft.hotelv1.repository;
import com.lxisoft.hotelv1.model.Food;
import java.util.Comparator;
public class Sorting implements Comparator <Food>
{
	public int compare(Food f1,Food f2)
	{
	//System.out.println(f1.getName()+","+f2.getName()+" CompareTo:"+f1.getName().compareTo(f2.getName()));
	return f1.getName().compareTo(f2.getName());
	}
}