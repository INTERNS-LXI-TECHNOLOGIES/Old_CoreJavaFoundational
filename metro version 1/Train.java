import java.util.Scanner;
public class Train
{
	Seat[] seats=new Seat[10];
	
	int no;
	String name;
	Scanner scan=new Scanner(System.in);

        public void create()
	          {
				  int p;
					
					System.out.println("                                        ");
					System.out.println("how many passengers do you want tickets to");
					p=scan.nextInt();
					seats =new Seat[p];
        
					for(int i=0;i<p;i++)
						{
							seats[i]=new Seat();
                            seats[i].passengerDetails();
						
						}
						
						
						
				
				
	 }


}