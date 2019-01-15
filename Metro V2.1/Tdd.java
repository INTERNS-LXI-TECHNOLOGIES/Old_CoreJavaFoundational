import java.util.Scanner;
public class Tdd{
public static void main (String[] args){
	int cont;
	Metro metro = new Metro();
	Scanner scan = new Scanner(System.in);
	do{
	metro.toDetails();
	metro.displayTicket();
	System.out.println("\nPress 1 To Book Again 0 To Exit");
	cont = scan.nextInt();
	}
	while (cont == 1);
}
}