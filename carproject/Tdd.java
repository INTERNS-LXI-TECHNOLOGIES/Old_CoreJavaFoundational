import java.util.Scanner;
public class Tdd
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);

Car car1=new Car();
Car car2=new Car();



car1.setCarDetails();
car2.setCarDetails();

car1.printCarDetails();
car2.printCarDetails();

}
}