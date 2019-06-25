/**
*@author AJAY E.S

*Page for Select types
**/	
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class CollectionSelector {
	private static final Logger log=Logger.getLogger(CollectionSelector.class.getName());
	public CollectionSelector(){
		log.setLevel(Level.WARNING);
	}
	public void displayer() {
		Scanner in =new Scanner(System.in);
	System.out.println("1.Intern \n2.Integer\n3.String \nEnter the object type:");
	int ty=in.nextInt();
	System.out.println("1.ArrayList\n2.LinkedList\n3.Treeset\n4.Hashset\n5.Linkedhashset\n6.Treemap\n7.Hashmap\n8.Linkedhashmap\n9.PriorityQueue\nEnter your choice:");
	int ch=in.nextInt();
	log.info("Selected "+ch);
	switch(ch) {
	case 1:			
		arrayList(ty);
		break;
	case 2:		
		linkedList(ty);
		break;
	case 3:
	    treeSet(ty);
		break;
	case 4:
		hashSet(ty);
		break;
	case 5:
		linkedhashSet(ty);
		break;
	case 6:
	    treeMap(ty);
		break;
	case 7:
		hashMap(ty);
		break;
	case 8:
		linkedhashMap(ty);
		break;
	case 9:
		priorityQueue(ty);
		break;
		default:
			System.out.print("Invalid Entry!!");
			log.warning("Selected option out of expectation!");
			break;
	}
	
}
public void arrayList(int ty) {
	if(ty==1) {
		ArrayListStore<Intern> laS=new ArrayListStore<Intern>(Intern.class);
		laS.display(ty);
	}
	else if(ty==2) {
		ArrayListStore<Integer> laS=new ArrayListStore<Integer>(Integer.class);
		laS.display(ty);
	}
	else {
		ArrayListStore<String> laS=new ArrayListStore<String>(String.class);
		laS.display(ty);
	}
}
public void linkedList(int ty) {
	if(ty==1) {
		LinkedListStore<Intern> llS=new LinkedListStore<Intern>(Intern.class);
		llS.display(ty);
	}
	else if(ty==2) {
		LinkedListStore<Integer> llS=new LinkedListStore<Integer>(Integer.class);
		llS.display(ty);
	}
	else {
		LinkedListStore<String> llS=new LinkedListStore<String>(String.class);
		llS.display(ty);
	}
}
public void priorityQueue(int ty) {
	if(ty==1) {
		PriorityQueueStore<Intern> pS=new PriorityQueueStore<Intern>(Intern.class);
		pS.display(ty);
	}
	else if(ty==2) {
		PriorityQueueStore<Integer> pS=new PriorityQueueStore<Integer>(Integer.class);
		pS.display(ty);
	}
	else {
		PriorityQueueStore<String> pS=new PriorityQueueStore<String>(String.class);
		pS.display(ty);
	}
}
public void treeSet(int ty) {
	if(ty==1) {
		TreesetStore<Intern> stS=new TreesetStore<Intern>(Intern.class);
		stS.display(ty);
	}
	else if(ty==2) {
		TreesetStore<Integer> stS=new TreesetStore<Integer>(Integer.class);
		stS.display(ty);
	}
	else {
		TreesetStore<String> stS=new TreesetStore<String>(String.class);
		stS.display(ty);
	}
}
public void hashSet(int ty) {
	if(ty==1) {
		HashsetStore<Intern> shS=new HashsetStore<Intern>(Intern.class);
		shS.display(ty);
	}
	else if(ty==2) {
		HashsetStore<Integer> shS=new HashsetStore<Integer>(Integer.class);
		shS.display(ty);
	}
	else {
		HashsetStore<String> shS=new HashsetStore<String>(String.class);
		shS.display(ty);
	}
}
public void linkedhashSet(int ty) {
	if(ty==1) {
		LinkedHashsetStore<Intern> slS=new LinkedHashsetStore<Intern>(Intern.class);
		slS.display(ty);
	}
	else if(ty==2) {
		LinkedHashsetStore<Integer> slS=new LinkedHashsetStore<Integer>(Integer.class);
		slS.display(ty);
	}
	else {
		LinkedHashsetStore<String> slS=new LinkedHashsetStore<String>(String.class);
		slS.display(ty);
	}
}
public void treeMap(int ty) {
	if(ty==1) {
		TreeMapStore<Intern> mtS=new TreeMapStore<Intern>(Intern.class);
		mtS.display(ty);
	}
	else if(ty==2) {
		TreeMapStore<Integer> mtS=new TreeMapStore<Integer>(Integer.class);
		mtS.display(ty);
	}
	else {
		TreeMapStore<String> mtS=new TreeMapStore<String>(String.class);
		mtS.display(ty);
	}
}
public void hashMap(int ty) {
	if(ty==1) {
		HashMapStore<Intern> mhS=new HashMapStore<Intern>(Intern.class);
		mhS.display(ty);
	}
	else if(ty==2) {
		HashMapStore<Integer> mhS=new HashMapStore<Integer>(Integer.class);
		mhS.display(ty);
	}
	else {
		HashMapStore<String> mhS=new HashMapStore<String>(String.class);
		mhS.display(ty);
	}
}
public void linkedhashMap(int ty) {
	if(ty==1) {
		LinkedHashMapStore<Intern> mlS=new LinkedHashMapStore<Intern>(Intern.class);
		mlS.display(ty);
	}
	else if(ty==2) {
		LinkedHashMapStore<Integer> mlS=new LinkedHashMapStore<Integer>(Integer.class);
		mlS.display(ty);
	}
	else {
		LinkedHashMapStore<String> mlS=new LinkedHashMapStore<String>(String.class);
		mlS.display(ty);
	}
}
}
