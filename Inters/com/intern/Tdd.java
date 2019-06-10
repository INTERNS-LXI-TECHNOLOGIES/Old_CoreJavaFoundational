package com.intern;
import java.util.*;

public class Tdd
{
	public static void main(String[] args)
	{
		//Repository <String> re=new TreeSetStore<String>(String.class);
		//Repository<String>re= new ArrayListStore<String>();
		Repository <String> re=new HashSetStore<String>();
		re.create("Sarath");
		re.create("Ajay");
		re.create("Zeman");
		re.create("Rahul");
		System.out.println(re.readAll());
		re.update("Sarath","Anish");

		System.out.println(re.readAll());
		re.delete("Anish");
		System.out.println(re.readAll());
		//re.sort();
		re.sort();
		//System.out.println(re.readAll());

	}
}