import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class TreesetStore<T> {
	TreeSet<T> store=new TreeSet<T>(); 
Class <T>type;
public TreesetStore(Class<T>type) {
	this.type=type;
}
	public void display(int ty) {
		System.out.println("Intially ArrayList:");
		read();
		//Adding  values
		if(ty==1) {
		Intern d1=new Intern(2,"AJAY");creater(d1);
		Intern d2=new Intern(1,"RAHUL");creater(d2);
		Intern d3=new Intern(3,"ADHU");creater(d3);
		Intern d4=new Intern(5,"DRUV");creater(d4);
		}
		else if(ty==2){
			Integer d1=new Integer(4);creater(d1);
			Integer d2=new Integer(3);creater(d2);
			Integer d3=new Integer(2);creater(d3);
			Integer d4=new Integer(5);creater(d4);
		}
		else {
			String d1=new String("India");creater(d1);
			String d2=new String("Australia");creater(d2);
			String d3=new String("England");creater(d3);
			String d4=new String("Srilanka");creater(d4);
		}
		System.out.println("After Adding 4 values ");
		read();
		updater();
		System.out.println("After Updating :");
		read();
		remover();
		System.out.println("After Removing :");
		read();
		sorter();
		System.out.println("After Sorting:");
		read();
	}
	public  void creater(Object data) {
		store.add((T) data);
	}

	public boolean read() {
		boolean res=false;
		if(store.size()==0) {
			System.out.println("Arraylist is empty!!");		
		}
		else {
			res=true;
			System.out.println("Arraylist contains:");
			int i=0;
			Iterator<T> itr=store.iterator();
			while(itr.hasNext()) {
				System.out.println((i++)+"."+itr.next());
			}
		}
			return res;
		
	}
	public void updater() {
		//Scanner in =new Scanner(System.in);
		read();
		//System.out.println("Select the index to update:");
		//int y=in.nextInt();
		Random rand=new Random();
		int y=rand.nextInt(store.size());
		Object d1;
		if((type.equals(Intern.class))) {
		 d1=new Intern(4,"ADTHI");//updation value
		}
		else if((type.equals(Integer.class))) {
			d1=new Integer(7);
		}
		else
			d1=new String("South Africa");
		store.remove(y);
		store.add((T) d1);
		
	}
	public void remover() {
		//Scanner in =new Scanner(System.in);
		read();
		//System.out.println("Select the index to delete:");
		//int y=in.nextInt();
		Random rand=new Random();
		int y=rand.nextInt(store.size());
		store.remove(y);
		
	}
	public void sorter() {
		Scanner in =new Scanner(System.in);
		if((type.equals(Intern.class))) {
			System.out.print("\n1.By Id\n2.By Name\nSelect your choice:");
			int c=in.nextInt();
		if(c==1) {
			
		}
		}
		else {
			Collections.sort( (List<T>) store, Collections.reverseOrder());
		}
	}
	
	
}
























