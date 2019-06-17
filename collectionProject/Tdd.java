import java.util.Scanner;

public class Tdd {
public static <T> void main(String[] args) {
	Scanner in =new Scanner(System.in);
	System.out.println("1.Intern \n2.Integer\n3.String \nEnter the object type:");
	int ty=in.nextInt();
	System.out.println("1.ArrayList\nEnter your choice:");
	int ch=in.nextInt();
	switch(ch) {
	case 1:		
		if(ty==1) {
			ArrayListStore<Intern> aS=new ArrayListStore<Intern>(Intern.class);
			aS.display(ty);
		}
		else if(ty==2) {
			ArrayListStore<Integer> aS=new ArrayListStore<Integer>(Integer.class);
			aS.display(ty);
		}
		else {
			ArrayListStore<String> aS=new ArrayListStore<String>(String.class);
			aS.display(ty);
		}
		break;
	case 2:
		if(ty==1) {
			TreesetStore<Intern> tS=new TreesetStore<Intern>(Intern.class);
			tS.display(ty);
		}
		else if(ty==2) {
			TreesetStore<Integer> aS=new TreesetStore<Integer>(Integer.class);
			aS.display(ty);
		}
		else {
			TreesetStore<String> aS=new TreesetStore<String>(String.class);
			aS.display(ty);
		}
		break;
		
	}
}
}
