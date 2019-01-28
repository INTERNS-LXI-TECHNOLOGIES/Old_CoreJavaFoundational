package com.lxisoft.metro.metro;
import com.lxisoft.metro.train.Train;

import java.util.Scanner;
public class Platform   
 {
Scanner scan=new Scanner(System.in);
private Train train;

private int pfnumber;

                public void setTrain (Train train)
				{
					this.train=train;
				}
				public Train getTrain()
				{
					return train;
				}
				public void setPfnumber(int pfnumber)
				 {
					this.pfnumber=pfnumber ;
				 }
				public int getPfnumber()
				 {
					 return pfnumber;
				 }
 


 public void	PlatformDetails()
 
				{
					setTrain(new Train());
					
					System.out.println("enter platform number");
					setPfnumber(scan.nextInt());
					train.trainDetails(); 
				}
	
 public void	printDetails()
				{
					 System.out.println("platform number="+getPfnumber());
					 train.printDetails();
				}
}