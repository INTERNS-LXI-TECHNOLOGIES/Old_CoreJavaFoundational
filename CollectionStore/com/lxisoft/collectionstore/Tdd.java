package com.lxisoft.collectionstore;
import java.util.*;
import java.io.*;

public class Tdd
{
	public static void main(String[] args)throws Exception
	{

		//ArrayListStore<User> a=new ArrayListStore<>(User.class);
		//LinkedListStore<User> a=new LinkedListStore<User>(User.class);
		//TreeSetStore <User> a = new TreeSetStore <User> ();
		//HashSetStore <User> a=new HashSetStore<User>();
		//LinkedHashSetStore <User> a=new LinkedHashSetStore<User>();
		//PriorityQueueStore <User> a=new PriorityQueueStore<User>();
		// User u1=new User(10,"A");
		// User u2=new User(11,"B");
		// User u3=new User(12,"C");
		// User u4=new User(15,"D");
		// User u5=new User(16,"Sharath");
		// User u6=new User(21,"Aby");
		// User u7=new User(2,"Sareth");
		// User u8=new User(9,"Aaaaaa");
		// User u9=new User(5,"Sharat");

		// a.create(u1);
		// a.create(u5);
		// a.create(u3);
		// a.create(u2);
		// a.create(u4);
		// a.create(u8);
		// a.create(u7);
		// a.create(u6);
		// a.create(u9);

		// for(User user:a.read())
		// {
		// 	System.out.println(user);
		// }
		// a.update(u2,new User(14,"Balu"));
		// System.out.println("AfTer Updation1");
		// for(User user:a.read())
		// {
		// 	System.out.println(user);
		// }
		// a.update(10,new User(13,"Abhijith"));
		// System.out.println("AfTer Updation2");
		// for(User user:a.read())
		// {
		// 	System.out.println(user);
		// }
		// a.delete(u3);		
		// System.out.println("AfTer Deletion");
		// for(User user:a.read())
		// {
		// 	System.out.println(user);
		// }

		// a.delete(15);
		// System.out.println("AfTer Deletion1");
		// for(User user:a.read())
		// {
		// 	System.out.println(user);
		// }
		// a.sort("Id");
		// System.out.println("AfTer Sorting");
		// for(User user:a.read())
		// {
		// 	System.out.println(user);
		// }
		// a.sort("name");
		// for(User user:a.read())
		// {
		// 	System.out.println(user);
		// } 


		LinkedHashMapStore <Integer,User> a=new LinkedHashMapStore<Integer,User>();
		//TreeMapStore <Integer,User> a=new TreeMapStore<Integer,User>();
		a.create(150,new User(105,"A"));
		a.create(175,new User(104,"B"));
		a.create(163,new User(103,"C"));
		a.create(130,new User(102,"D"));
		
		// a.create(1,"Sarath");
		// a.create(2,"Kumar");
		a.read();
		// for(Map.Entry m:a.entrySet())
		// {
		// 	System.out.println(m.getKey()+" "+m.getValue());   
		// }

		System.out.println(a.read());
		a.update(130,new User(129,"Z"));
		System.out.println(a.read());
		a.delete(175);
		System.out.println(a.read());

	}
}

