
import java.util.Scanner;

public class Tdd {
public static void main(String[] args)  {
	Scanner in =new Scanner(System.in);
    int n=10,x;
 
    do {
    	System.out.print("Press 1 to start play!!");
	    x=in.nextInt();
	    if(x==1) {
	    	Game g=new Game();
	    	g.play(n);
	   }
	   else {
		System.out.print("Invalid choice!!");
	    }
    }while(x!=1);
}

}
