public class TDD
{
 public static void main(String[] args)
 {
	Door d1 = new Door();
	Door d2 = new Door();
	Door d3 = new Door();
	Door d4 = new Door();
	Tyre t1 = new Tyre();
	Tyre t2 = new Tyre();
	Tyre t3 = new Tyre();
	Tyre t4 = new Tyre();
	Stearing s = new Stearing();
	
	Car a = new Car();
 
	a.fixDoor(d1,d2,d3,d4);
	a.fixTyre(t1,t2,t3,t4);
	a.fixStearing(s);
	a.getDetails();
	t1.getDetails();
	t2.getDetails();
	t3.getDetails();
	t4.getDetails();
	d1.getDetails();
	d2.getDetails();
	d3.getDetails();
	d4.getDetails();
	s.getDetails();
	a.printDetails();
	
 }
 
 
}

