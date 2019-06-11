package com.intern;
import java.util.*;


public class Tdd
{
	public static void main(String[] args)
	{
		//Repository <Intern> re=new TreeSetStore<String>(String.class);
		//Repository<Intern>re= new ArrayListStore<String>();

		//Repository <Intern> re=new HashSetStore<String>();
		Repository<Intern>re=new LinkedListStore<Intern>();
		Intern i=new Intern("102","Sarath");
		Intern i1=new Intern("121","jose");
		Intern i2=new Intern("122","Anish");
		Intern i3=new Intern("103","Ajay");
		Intern i4=new Intern("104","Rahul");

		re.create(i);
		re.create(i1);
		re.create(i2);
		re.create(i3);
		re.create(i4);
		System.out.println(re.readAll());
		re.update(i4);

		System.out.println(re.readAll());
		re.delete("Anish");
		System.out.println(re.readAll());
		re.sort();
		re.sort();
		System.out.println(re.readAll());

	}
}