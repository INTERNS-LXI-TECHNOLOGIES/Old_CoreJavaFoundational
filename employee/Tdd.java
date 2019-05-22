package com.lxisoft.employee;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Tdd
{
	public static void main(String[] args)
	{
		TreeMap<Integer,Employee> map=new TreeMap <Integer,Employee>();
		Employee e=new Employee("Ramesh");
		System.out.println(e);
		map.put(1,e);
		//map.remove(1);
		System.out.println(map.toString());
	}
}
