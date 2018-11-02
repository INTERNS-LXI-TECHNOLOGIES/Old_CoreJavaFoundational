class TDD
{
public static void main(String[] args)
{
 Driver d1 = new Driver("Tony",11);
 Driver d2 = new Driver("Vettel",22); 
 Driver d3 = new Driver("Louis",33); 
 Driver d4 = new Driver("Henry",44); 
 
 
 
 Garage g = new Garage(4);
 
 Race  r = new Race();
 
 Car c1 = new Car("Mercedez",5000);
 Car c2 = new Car("Ferrari",7000);
 Car c3 = new Car("Lamborgini",6000);
 Car c4 = new Car("Maserati",4000);
 c1.setDriver(d2);
 c1.drive();
 c2.setDriver(d1);
 c2.drive();
 c3.setDriver(d3);
 c3.drive();
 c4.setDriver(d4);
 c4.drive();
 
 
 g.addCar(c1);
 g.addCar(c2);
 g.addCar(c3);
 g.addCar(c4);
 
 
 r.setGarage(g);
 
 r.start();
 g.printDetails();
} 

}
