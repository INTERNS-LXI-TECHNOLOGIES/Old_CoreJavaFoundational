import java.util.Scanner;
public class Tdd{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("How Many Cars Details You Wants Enter");
	int n = scan.nextInt();
		Car[] car  = new Car[n];
		for(int i = 0;i<n;i++){
			car[i]=new Car();
			car[i].Details();
		}
		for(int i = 0;i<n;i++){
			car[i].display();
			System.out.printf("____________________________________");
		}
		
	}
}