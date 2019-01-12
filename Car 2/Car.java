public class Car{
	String name = "Benz";
	String regno = "KL 09 AM 4810";
	int price = 1000000;
		Steer steer = new Steer();
		Tire tire1 = new Tire();
		Tire tire2 = new Tire();
		Tire tire3 = new Tire();
		Tire tire4 = new Tire();
		Door dfrontleft = new Door();
		Door dfrontright = new Door();
		Door dbackleft = new Door();
		Door dbackright = new Door();
	public void benz(){

		tire1.name = "Front Left";
		tire2.name = "Front Right";
		tire3.name = "Back Left";
		tire4.name = "Back Right";
		tire1.price = 5000;
		tire2.price = 5000;
		tire3.price = 6000;
		tire4.price = 6000;
		dfrontleft.name = "Front Left";
		dfrontright.name = "Front Right";
		dbackleft.name = "Back  Left";
		dbackright.name = "Back  Right";
		dfrontleft.price = 12000;
		dfrontright.price = 12000;
		dbackleft.price = 10000;
		dbackright.price = 10000;

System.out.println("Tire          Price");
System.out.println(tire1.name+"  = "+tire1.price);
System.out.println(tire2.name+" = "+tire2.price);
System.out.println(tire3.name+"   = "+tire3.price);
System.out.println(tire4.name+"  = "+tire4.price);
System.out.println(" ");
System.out.println("Door          Price");
System.out.println(dfrontleft.name+"  = "+dfrontleft.price);
System.out.println(dfrontright.name+" = "+dfrontright.price);
System.out.println(dbackleft.name+"  = "+dbackleft.price);
System.out.println(dbackright.name+" = "+dbackright.price);
System.out.println(" ");
System.out.println(steer.name+"    = "+steer.price);
	}
}