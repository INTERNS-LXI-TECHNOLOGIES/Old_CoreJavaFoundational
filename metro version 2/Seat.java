import java.util.Scanner;
public class Seat
{
int number;
String birth;

Scanner scan=new Scanner (System.in);
Passanger passanger=new Passanger();	


 
     public void setSeatDetails()
       {
		    System.out.println("enter the num of the seat");
			number=scan.nextInt();
			
			
			if(number%8==1||number%8==4)
			{
				birth="LB";
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
			 System.out.println("seat number="+number);
			 System.out.println("birth place ="+birth);
	   }	       

} 