/**
	*@author AJAY E.S 
	*Page for Treemap operations
	**/
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

	public class TreeMapStore<T>implements  CollectionRepository{
		Map<Integer,T> store=new TreeMap<Integer,T>(); 
		Class <T>type;
		public TreeMapStore(Class<T>type) {
			this.type=type;
		}
			
		private static final Logger log=Logger.getLogger(TreeMapStore.class.getName());
		public TreeMapStore(){
			log.setLevel(Level.WARNING);
		}
			public void display(int ty) {
				log.info("Started performing Operations in TreeMap");
				System.out.println("Intially TreeMap:");
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
				log.info("Ended performing Operations in TreeMap");
			}
			public  void creater(Object data) {
				int i=store.size();
				store.put(i, (T) data);
				log.info("Sucessfully added value to TreeMap!");
			}
			public void remover() {
				log.info("Started for removing data!");
				Scanner in =new Scanner(System.in);
				System.out.print("Enter the key value to delete:");
				int k=in.nextInt();
				store.remove(k);
				log.info("End for removing data!");
			}
			public void updater() {
				log.info("Started for updation!");
				Scanner in =new Scanner(System.in);
				System.out.print("Enter the key value to update:");
				int k=in.nextInt();
				Object d1;
				if((type.equals(Intern.class))) {
				 d1=new Intern(4,"ADTHI");//updation value
				}
				else if((type.equals(Integer.class))) {
					d1=new Integer(7);
				}
				else
					d1=new String("South Africa");

				store.replace(k, (T) d1);
				log.info("Ended for updation!");
			}

            public void read() {
        		
        		if(store.size()==0) {
        			System.out.println("TreeMap is empty!!");	
        			log.warning("No data found!");
        		}
        		else {
        			 
        			System.out.println("TreeMap contains:\nKey-Value ");
        			
        				for (Integer key: store.keySet()) {
        		    	    System.out.println(key+":"+store.get(key));
        		    	
        			}
        		}
        			 
        		
        	 }
            public void sorter() {
            	log.info("Going to perform sort");
        		Scanner in =new Scanner(System.in);
        		Set <T> store1=new TreeSet<T>();
        		for (Integer key: store.keySet()) {
		    	    store1.add( (T) store.get(key));        		    	    
		    	}
        		if((type.equals(Intern.class))) {
        			System.out.print("\n1.By Id\n2.By Name\nSelect your choice:");
        			int c=in.nextInt(); 
        			System.out.println("After Sorting:");
        			Set <Intern> store2=new TreeSet<Intern>(new CompareByName());
        		    if(c==1) {        		    			
        		    	System.out.println(store1);
        		      }
        		     else {
        		    	 for (Integer key: store.keySet()) {
         		    	    store2.add( (Intern) store.get(key));        		    	    
         		    	}		
         		    	System.out.println(store2);
        		      }
        		  }
        		 else {
        			 System.out.println(store1);
        		  }
        		log.info("sorted completed");
        	}
        	
			
			
			
		}
