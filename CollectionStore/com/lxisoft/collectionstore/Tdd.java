package com.lxisoft.collectionstore;
import java.util.*;
import java.io.*;

public class Tdd
{
	public static void main(String[] args)throws Exception
	{

		//ArrayListStore<User> a=new ArrayListStore<User>();
		//LinkedListStore<User> a=new LinkedListStore<User>();
		TreeSetStore <User> a = new TreeSetStore <User> ();
		User u1=new User(10,"A");
		User u2=new User(11,"B");
		User u3=new User(12,"C");
		User u4=new User(15,"D");
		User u5=new User(16,"E");
		// a.create(new User(10,"A"));
		// a.create(new User(11,"B"));
		// a.create(new User(12,"C"));
		a.create(u1);
		a.create(u2);
		a.create(u3);
		a.create(u4);
		a.create(u5);
		// for(User user:a.read())
		// {
		// 	System.out.println(user);
		// }
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
		//a.sort("Id");

	}
}

