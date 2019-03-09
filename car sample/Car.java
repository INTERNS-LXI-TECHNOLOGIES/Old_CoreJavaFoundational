import java.util.*;
public class Car
{
private String name;
private Tyre t1,t2,t3,t4;
private Door d1,d2,d3,d4;
private Stearing s;
Scanner scan=new Scanner(System.in);

public void setName(String name)
{
	this.name=name;
}
public String getName()
{
	return name;
}

public void setT1(Tyre t1)
{
	this.t1=t1;
}
public Tyre getT1()
{
	return t1;
}

public void setT2(Tyre t2)
{
	this.t2=t2;
}
public Tyre getT2()
{
	return t2;
}

public void setT3(Tyre t3)
{
	this.t3=t3;
}
public Tyre getT3()
{
	return t3;
}

public void setT4(Tyre t4)
{
	this.t4=t4;
}
public Tyre getT4()
{
	return t4;
}

public void setD1(Door d1)
{
	this.d1=d1;
}
public Door getD1()
{
	return d1;
}

public void setD2(Door d2)
{
	this.d2=d2;
}
public Door getD2()
{
	return d1;
}

public void setD3(Door d3)
{
	this.d3=d3;
}
public Door getD3()
{
	return d3;
}

public void setD4(Door d4)
{
	this.d4=d4;
}
public Door getD4()
{
	return d4;
}

public void setS(Stearing s)
{
	this.s=s;
}
public Stearing getS()
{
	return s;
}

/*public void printDetails()
{
	System.out.println(" Name : "+getName());
	
	System.out.println(" Tyres :");
	
	/*t1.printTyreDetails();
	t2.printTyreDetails();
	t3.printTyreDetails();
	t4.printTyreDetails();
	
	t1.getName();
	t2.getName();
	t3.getName();
	t4.getName();
	
	System.out.println(" Doors :");
	
	/*d1.printDoorDetails();
	d2.printDoorDetails();
	d3.printDoorDetails();
	d4.printDoorDetails();
	d1.getName();
	d2.getName();
	d3.getName();
	d4.getName();
	
	System.out.println(" Size of the stearing : ");
	/*s.printStearingDetails();
	s.getName();
}*/

}