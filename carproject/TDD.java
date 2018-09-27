public class TDD
{
 public static void main(String[] args)
 {

	
	Car a = new Car(1,"BMW","S CLASS","SPORTS","RED");
 
	Door d1 = new Door(1,"black","benz","opendoor");
	Door d2 = new Door(2,"red","benz","opendoor");
	Door d3 = new Door(3,"blue","benz","normal");
	Door d4 = new Door(4,"orange","benz","opendoor");
	Tyre t1 = new Tyre(1,10,"pirelli","12-8-2018","12-8-2020");
	Tyre t2 = new Tyre(2,10,"pirelli","12-8-2018","13-6-2019");
	Tyre t3 = new Tyre(3,10,"michelin","12-8-2018","20-10-2023");
	Tyre t4 = new Tyre(4,10,"michelin","12-8-2018","5-9-2021");
	Stearing s = new Stearing(1,"black","audi","sports",15);
	
	a.fixDoor(d1,d2,d3,d4);
	a.fixTyre(t1,t2,t3,t4);
	a.fixStearing(s);
	a.printDetails();
	/**t1.printDetails();
	t2.printDetails();
	t3.printDetails();
	t4.printDetails();
	d1.printDetails();
	d2.printDetails();
	d3.printDetails();
	d4.printDetails();
	s.printDetails();
	a.printDetails();*/
	
 }
 
 
}
