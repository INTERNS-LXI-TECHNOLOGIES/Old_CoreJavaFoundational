import java.util.Scanner;
public class Car{
	Scanner scan = new Scanner(System.in);
		Tire[] tire = new Tire[4];
		Steer steer = new Steer();
		Door[] door = new Door[4];
		String name;
		String regno;
		String price;
	public void Details(){


		System.out.println("Enter Car Name ");
		name = scan.nextLine();
		System.out.println("Enter Reg No");
		regno = scan.nextLine();
		System.out.println("Enter Price");
		price = scan.nextLine();
		System.out.println(" ");
		for (int i = 0;i<4;i++){
		tire[i] = new Tire();
		door[i] = new Door();
		}
		for (int i = 0;i<4;i++){
		tire[i].setDetails();
		}
		for (int i = 0;i<4;i++){
		door[i].setDetails();
		}
		System.out.println("_________________________________");
	}
	public void display(){
System.out.println(" ");
System.out.println("Car Name    = "+name);
System.out.println("Reg No      = "+regno);
System.out.println("Price       = "+price);
System.out.println(" ");
System.out.println("Tire          Price");
		for (int i = 0;i<4;i++){
		tire[i].display();
		}
System.out.println(" ");
System.out.println("Door          Price");
		for (int i = 0;i<4;i++){
		door[i].display();
		}
System.out.println(" ");
System.out.println(steer.name+"    = "+steer.price);
	}
}