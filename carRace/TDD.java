class TDD
{
public static void main(String[] args)
{
	Car a = new Car();
	a.car("AUDI" , 1100);
	
	Driver d = new Driver();
	d.driver("ALEX",25);
	
	a.printDetails();
	d.printDetails();
}
}