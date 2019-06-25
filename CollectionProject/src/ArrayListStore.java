/**
*@author AJAY E.S

*Page for Arraylist operations
**/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.*;

public class ArrayListStore<T> implements CollectionRepository{
List<T> store=new ArrayList<T>(); 
Class <T>type;
public ArrayListStore(Class<T>type) {
	this.type=type;
}
private static final Logger log=Logger.getLogger(ArrayListStore.class.getName());
public ArrayListStore(){
	log.setLevel(Level.WARNING);
}
//Method to start or display the details	
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
			System.out.println("Arraylist is empty!!");
			log.warning("No data has found!");
		}
		else {			
			System.out.println("Arraylist contains:");
			for(int i=0;i<store.size();i++)
				System.out.println((i+1)+"."+store.get(i));
		}
	}
	public void updater() {
		log.info("Started for updation!");
		Scanner in =new Scanner(System.in);
		read();
		//System.out.println("Select the index to update:");
		//int y=in.nextInt();
		Random rand=new Random();
		int y=rand.nextInt(store.size());
		Object d1;//updation values
		if((type.equals(Intern.class))) {
		 d1=new Intern(4,"ADTHI");
		}
		else if((type.equals(Integer.class))) {
			d1=new Integer(7);
		}
		else
			d1=new String("South Africa");
		store.set(y, (T) d1);
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
			Collections.sort((List<Intern>)store);
			log.info("Sorted by Id ,Worked");
		 }
		else {
            Collections.sort((List<Intern>)store,new CompareByName());
		log.info("Sorted by Name ,Worked");
		 }
		}
		else if((type.equals(Integer.class))){
			Collections.sort((List<Integer>) store);
			log.info("Sorted Worked for integer");
		}
		else {
			Collections.sort((List<String>) store);
			log.info("Sorted Worked for String");
		}
	}

	
	
	
	
}
