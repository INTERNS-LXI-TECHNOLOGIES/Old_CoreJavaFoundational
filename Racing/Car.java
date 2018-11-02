class Car
{
 String brand;
 double power;
 
 Driver d;
 
 Car(String brand,double power)
 {
	 this.brand = brand;
	 this.power = power;
 }
 
 public void setDriver(Driver d)
 {
	 this.d = d;
 }

public void drive()
{
	System.out.println("Ignition");
	System.out.println("Brand:" +this.brand);
	System.out.println("Power:" +this.power);
	System.out.println("Driver name:" +this.d.name);
	System.out.println("Driver number:" +this.d.num);
	System.out.println(" ");

}
	
	
	
}
