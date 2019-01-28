package com.lxisoft.metro.train;
import com.lxisoft.metro.passanger.Passanger;

import java.util.Scanner;
public class Seat
{

Scanner scan=new Scanner (System.in);

private Passanger passanger;	

private int number;
private String birth;
                 
				public void setPassanger(Passanger passanger)
				{
					this.passanger=passanger;
				}
				public Passanger getPassanger()
				{
					return passanger;
				}
				public void setNumber(int number)
				{
					this.number=number;
				}
				public int getNumber()
				{
					return number;
				}
				public void setBirth(String birth)
				{
					this.birth=birth;
				}
				public String getBirth()
				{
					return birth;
				}

public void seatDetails()
       {
		    System.out.println("enter the num of the seat");
			number=scan.nextInt();
			
			
			if(number%8==1||number%8==4)
			{
				setBirth("LB");
			}
			 
		     else if (number%8==2||number%8==5)
			 {
				 birth="MB";
		     }
			 else if(number%8==3||number%8==6)
			 {
				 birth="ub";
			 }
			 else if(number%8==7)
			 {
				 birth="SL";
			 }
			 else
			 {
				 birth="SU";
			 }
			
		    
       }
public void printDetails()
       {
		   setPassanger(new Passanger());
			 System.out.println("seat number="+getNumber());
			 System.out.println("birth place ="+getBirth());
	   }	       

} 