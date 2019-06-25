/**
*@author AJAY E.S

*Page for PriorityQueue operations
**/
	
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

	public class PriorityQueueStore<T> implements CollectionRepository{

	PriorityQueue<T> store=new PriorityQueue<T>(); 
	Class <T>type;
	public PriorityQueueStore(Class<T>type) {
		this.type=type;
	}
	private static final Logger log=Logger.getLogger(PriorityQueueStore.class.getName());
	public PriorityQueueStore(){
		log.setLevel(Level.WARNING);
	}	
		public void display(int ty) {
			log.info("Started performing Operations in PriorityQueue");
			System.out.println("Intially PriorityQueue:");
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
			
			log.info("Ended performing Operations in PriorityQueue");
		}
		public  void creater(Object data) {
			store.add((T) data);
			log.info("Sucessfully added value to Arraylist!");
		}

		public void read() {
			
			if(store.size()==0) {
				System.out.println("PriorityQueue is empty!!");
				log.warning("No data has found!");
			}
			else {
				
				System.out.println("PriorityQueue contains:");
				
			            System.out.println(store); 
			       
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
			remover();
			Object d1;
			if((type.equals(Intern.class))) {
			 d1=new Intern(7,"ADTHI");//updation value
			}
			else if((type.equals(Integer.class))) {
				d1=new Integer(7);
			}
			else
				d1=new String("South Africa");
			store.add( (T) d1);
			log.info("Ended updation operation");
		}
		public void remover() {
			log.info("Started for removing data!");	
			//Scanner in =new Scanner(System.in);
			//read();
			//System.out.println("Select the index to delete:");
			//int y=in.nextInt();
			store.poll();
			log.info("Removing operation ended!");
			
		}
		/*Sorting is not done on collection since ,if sort perform it will not remain priority queue*/
		public void sorter() {
			log.info("Going to perform sort");
			PriorityQueue<Intern> temp=new PriorityQueue<Intern>();
			temp=(PriorityQueue<Intern>) store;
			Scanner in =new Scanner(System.in);
			if((type.equals(Intern.class))) {
				PriorityQueue<Intern> store1=new PriorityQueue<Intern>();
				PriorityQueue<Intern> store2=new PriorityQueue<Intern>(new CompareByName());
        		
				System.out.print("\n1.By Id\n2.By Name\nSelect your choice:");
				int c=in.nextInt();
				 if(c==1) {
	   	            	for(Intern i:temp) { 
	            		store1.add((Intern)i);
	            		    	}
	   	             while (!store1.isEmpty()) { 
			                System.out.println(store1.poll().getName());}
	            	  }
	            	else {
	            		for(Intern i:temp) { 
	            			store2.add((Intern)i);
		            	 }	
	            		while (!store2.isEmpty()) { 
			                System.out.println(store2.poll().getName());}
	            	   }
				      
	            }
	      else {
	    	  while (!store.isEmpty()) { 
	                System.out.println(store.poll());}
	    	 /*No data will be in store so add value back for further use*/
	    	  for(Intern i:temp) { 
	        		store.add((T)i);
	        		    	}
      	  }
			
			}
		}

		