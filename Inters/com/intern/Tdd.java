package com.intern;


public class Tdd
{

	public static void main(String[] args)
	{
		//Repository <Intern> re=new TreeSetStore<Intern>(Intern.class);
		//Repository<Intern>re= new ArrayListStore<Intern>(Intern.class);
		//Repository<Intern> re=new HashSetStore<Intern>(Intern.class);
		//Repository<Intern>re=new LinkedListStore<Intern>(Intern.class);
		//Repository<Intern>re=new LinkedHashSetStore<Intern>();
		Repository<Intern>re=new PriorityQueueStore<Intern>(Intern.class);
		
		Intern i=new  Intern(102,"Sarath");
		Intern i1=new Intern(121,"jose");
		Intern i2=new Intern(122,"Anish");
		Intern i3=new Intern(103,"Ajay");
		Intern i4=new Intern(104,"Rahul");

		re.create(i);
		re.create(i1);
		re.create(i2);
		re.create(i3);
		re.create(i4);
		System.out.println("DAta : "+re.readAll());
		re.delete(i4);
		System.out.println("\nAfter deletion :"+re.readAll());
		Intern i5=new Intern(109,"Jishnu");
		re.update(i3,i5);
		System.out.println("\nupdated data :"+re.readAll());
		// re.sort( name);
		re.sort();
		System.out.println("\nSorted data"+re.readAll());

	}
}