package com.lxisoft.metro.train;
import com.lxisoft.metro.train.Compartment;

import java.util.Scanner;
public class Train
{
Scanner scan=new Scanner(System.in);

private Compartment compartment;

private String name,time,number;

                        public void setCompartment(Compartment compartment)
						{
							this.compartment=compartment;
						}
						public Compartment getCompartment()
						{
							return compartment;
						}
						public void setName (String name)
						{
							this.name = name;
						}
						public String getName ()
						{
							return name;
						}

						public void setTime(String name)
						{
							this.time=time;
						}
						public String getTime()
						{
							return time;
						}
						public void setNumber(String number)
						{
							this.number=number;
						}
						public String getNumber()
						{
							return number;
						}


public void trainDetails()
	{
		setCompartment(new Compartment());
		
		System.out.println("enter the number of the train");
		setNumber(scan.next());
		System.out.println("enter the train name");
		setName(scan.next());
		System.out.println("enter the time of the train");
		setTime(scan.next());
		getCompartment().compartmentDetails();
		
	}

public void printDetails()
	{
		System.out.println("number of the train="+getNumber());
		System.out.println("name of the train="+getName());
		System.out.println("time of the Train="+getTime());
		getCompartment().getSeat().printDetails();
		
	}	
	
}
