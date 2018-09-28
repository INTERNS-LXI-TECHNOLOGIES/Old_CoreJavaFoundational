public class Car {
	
	String company_name;
	
	int power;
	
	Driver driver;
	
	int distance;
	
	Car(){}
	
	Car(String companyName , int power)
	{
		this.company_name = companyName;
		this.power = power;
		this.distance = 0;
	}
	
	public void setDriver(Driver driver)
	{
		this.driver = driver;
	}
	
	public void printDetails()
	{
		System.out.print("Company : " + this.company_name + " , ");
		System.out.print("Company : " + this.power + " | " );
		System.out.print("Ditance : " + this.distance + " | " );
		this.driver.printDetails();
		System.out.println("\n");
	}
	
	public void drive(int distance)
	{
		this.distance = distance;
	}

}