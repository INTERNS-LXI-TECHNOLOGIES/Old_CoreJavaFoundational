public class Garage {
	
	static int slot_no = 0;
	
	int max_limit;
	
	Car[] cars;
	
	Garage(int maxLimit)
	{
		this.max_limit = maxLimit;
		this.cars = new Car[this.max_limit];
	}
	
	
	public void printAllVehicleDetails()
	{
		if(slot_no == 0)
		{
			System.out.println("No cars in garage");
			System.exit(1);
		}
		for(int i = 0;i<this.slot_no;i++)
		{
			System.out.print((i + 1) + ":");
			this.cars[i].printDetails();
		}
	}
	
	public void addCarMul(Car cars[])
	{
		for(int i =0;i<cars.length;i++)
		{
			this.cars[slot_no] = cars[i];
			slot_no++;
		}		
	}
	
	public void addCar(Car car)
	{
		if(slot_no < max_limit)
		{
			this.cars[slot_no] = car;
			slot_no++;
		}
		else
		{
			System.out.print("\n\tGarage Full\n");
		}
	}
	
	public Car getCar(int c)
	{
		return this.cars[c];
	}

	// TODO: function to remove car from Garage	
	
	/*
	public int removeCar(int c)
	{

	}
	*/
}