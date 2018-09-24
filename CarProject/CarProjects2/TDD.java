
import java.util.*;

public class TDD {
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		Driver drivers[] = {
								new Driver("jish" , 1456) ,
								new Driver("jish" , 1456) ,
								new Driver("jish" , 1456) ,
								new Driver("jish" , 1456) 
							};
		
		Car cars[] = {
						new Car("nano" , 1234) ,
						new Car("maruti" , 1234) ,
						new Car("bmw" , 1234) ,
						new Car("audi" , 1234) 
					 };
					 
		for(int i = 0;i < 4;i++) cars[i].setDriver(drivers[i]);
		
		Garage garage = new Garage(5);
		
		garage.addCarMul(cars);
		
		Stadium stadium = new Stadium("blll" , 23);
		
		stadium.setGarage(garage);
		
		Race race = new Race(stadium);
		
		System.out.println("Select the cars to register for race\n");
		
		garage.printAllVehicleDetails();
		
		int choice = 1;
		
		while(true)
		{
			System.out.print("Enter Car number to add [ Enter 0 tp stop adding ] :");
			choice = scanner.nextInt();
			
			if(choice <= Garage.slot_no)
			{
				System.out.println("Car Added");
			}
			else
			{
				System.out.println("Garage Full\n");
			}
			
			if(choice ==  0) break;
			race.registerCar(choice - 1);
		}
		
		race.start();
		
		race.result();

	}
}