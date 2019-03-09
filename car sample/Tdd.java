import java.util.*;
public class Tdd
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);

Car car1=new Car();
Car car2=new Car();

car1.setName("Benz");

car1.setT1(new Tyre());
car1.setT2(new Tyre());
car1.setT3(new Tyre());
car1.setT4(new Tyre());
car1.getT1().setName("1");
car1.getT2().setName("2");
car1.getT3().setName("3");
car1.getT4().setName("4");

car1.setD1(new Door());
car1.setD2(new Door());
car1.setD3(new Door());
car1.setD4(new Door());
car1.getD1().setName("1");
car1.getD2().setName("2");	
car1.getD3().setName("3");
car1.getD4().setName("4");

car1.setS(new Stearing());
car1.getS().setSize(40);

/*car1.printDetails();*/

car2.setName("spark");

car2.setT1(new Tyre());
car2.setT1(new Tyre());
car2.setT1(new Tyre());
car2.setT1(new Tyre());
car2.getT1().setName("1");
car2.getT2().setName("2");
car2.getT3().setName("3");
car2.getT4().setName("4");

car2.setD1(new Door());
car2.setD2(new Door());
car2.setD3(new Door());
car2.setD4(new Door());
car2.getD1().setName("1");
car2.getD2().setName("2");
car2.getD3().setName("3");
car2.getD4().setName("4");

car2.setS(new Stearing());
car2.getS().setSize(50);

/*car2.printDetails();*/

}
}