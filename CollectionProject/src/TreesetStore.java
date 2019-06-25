/**
	*@author AJAY E.S 
	*Page for Treeset operations
	**/
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TreesetStore<T>implements CollectionRepository {
	TreeSet<T> store=new TreeSet<T>(); 
Class <T>type;
public TreesetStore(Class<T>type) {
	this.type=type;
}
private static final Logger log=Logger.getLogger(TreesetStore.class.getName());
public TreesetStore(){
	log.setLevel(Level.WARNING);
}
	public void display(int ty) {
		log.info("Started performing Operations in Arraylist");
		System.out.println("Intially ArrayList:");
		read();
		//Adding  sample values
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
		log.info("Ended performing Operations in Arraylist");
	}
	public  void creater(Object data) {
		store.add((T) data);
		log.info("Sucessfully added value to Arraylist!");
	}

	public void read() {
	
		if(store.size()==0) {
			System.out.println("TreeSet is empty!!");
			log.warning("No data found!");
		}
		else {
			
			System.out.println("TreeSet  contains:");
			int i=0;
			Iterator<T> itr=store.iterator();
			while(itr.hasNext()) {
				System.out.println((i++)+"."+itr.next());
			}
		}
			
	}
	public void updater() {
		log.info("Started for updation!");
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
		log.info("Ended updation operation");
		
	}
	public void remover() {
		log.info("Started for removing data!");		
		read();	
		Random rand=new Random();
		int y=rand.nextInt(store.size());
		store.remove(y);
		log.info("Removing operation ended!");
		
	}
	public void sorter() {
		log.info("Going to perform sort");
		Scanner in =new Scanner(System.in);
		if((type.equals(Intern.class))) {
			System.out.print("\n1.By Id\n2.By Name\nSelect your choice:");
			int c=in.nextInt();
		    if(c==1) {
			    Set<Intern> newstore=new TreeSet<Intern>(new CompareByName());
			    for(T t:store) {							
				    newstore.add((Intern) t);			
			     }
			     System.out.println(newstore);
		      }
		     else {
			    System.out.println(store);
		      }
		  }
		 else {
			  System.out.println(store);
		  }
		log.info("sorted completed");
	}
	
	
}
























