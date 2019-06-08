package com.lxisoft.collectionstore;
import java.util.*;
import java.io.*;

public class Tdd
{
	public static void main(String[] args)throws Exception
	{

		ArrayListStore<User> a=new ArrayListStore<User>();
		//LinkedListStore<User> a=new LinkedListStore<User>();
		//TreeSetStore <User> a = new TreeSetStore <User> ();
		User u1=new User(10,"A");
		User u2=new User(11,"B");
		User u3=new User(12,"C");
		User u4=new User(15,"D");
		User u5=new User(16,"Sharath");
		User u6=new User(21,"Aby");
		User u7=new User(2,"Sareth");
		User u8=new User(9,"Aaaaaa");
		User u9=new User(5,"Sharat");

		// a.create(new User(10,"A"));
		// a.create(new User(11,"B"));
		// a.create(new User(12,"C"));
		a.create(u1);
		a.create(u5);
		a.create(u3);
		a.create(u2);
		a.create(u4);
		a.create(u8);
		a.create(u7);
		a.create(u6);
		a.create(u9);

		for(User user:a.read())
		{
			System.out.println(user);
		}
		a.update(u2,new User(14,"Pooja"));
		System.out.println("After Updation1");
		for(User user:a.read())
		{
			System.out.println(user);
		}
		a.update(10,new User(13,"Sarath"));
		System.out.println("After Updation2");
		for(User user:a.read())
		{
			System.out.println(user);
		}
		a.delete(u3);
		System.out.println("After Deletion");
		for(User user:a.read())
		{
			System.out.println(user);
		}

		a.delete(15);
		System.out.println("After Deletion1");
		for(User user:a.read())
		{
			System.out.println(user);
		}
		a.sort("Name");
		System.out.println("After Name Sorting");
		for(User user:a.read())
		{
			System.out.println(user);
		}

	}
}

