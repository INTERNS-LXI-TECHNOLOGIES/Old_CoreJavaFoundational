public class Car
{
	
String name="BMW";
Door d = new Door();
Tyre t = new Tyre();
Steering s = new Steering();
Engine e = new Engine();
public void displayDetails()
{
	int g;
	System.out.println("CAR NAME:"+name);
	s.displaySteering();
	d.readPrice();
	d.doorPrice();
	t.readPrice();
	d.displayDoor();
	t.totalPrice();
	t.readBrand();
	t.displayTyre();
	e.displayEngine();
	s.displaySteeringPrice();
  	g=s.price+e.price+t.totalPrice()+d.doorPrice();
  	System.out.println("\nGrand Total     = "+g);

}

}