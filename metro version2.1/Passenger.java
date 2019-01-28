public class Passenger
{

                                    
	String name,gender,age;
	

	  Ticket ticket=new Ticket(); 
	 
	 public void calling()
	 {
		 ticket.reservation();
	 } 
	 
	 public void passengerDetails()
			  {
				  String name;
				  int age;
				  String gender;
				  System.out.println("enter the name of the passenger");
				  name=scan.next();
				  System.out.println("enter the age of the passenger");
				  age=scan.nextInt();
				  System.out.println("enter the gender of passenger");
				  gender=scan.next();
				  
				  passengers.calling();
			  }

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