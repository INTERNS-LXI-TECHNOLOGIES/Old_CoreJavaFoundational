 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
	 ArrayList<Player> playerslist=new ArrayList<Player>();
	 Board b=new Board();
     public void readData() {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));	
		Scanner in =new Scanner(System.in);
		int no;		
		do{
			System.out.print("Enter the Number of Players(2-5):");
			no=in.nextInt();		
		}while((no>5)||(no<2));
		for(int i=1;i<=no;i++) {
			String name=null;			
			System.out.print("Enter the name for player(first 3 chararter is taken)"+i+":");
			try {
				 name=input.readLine();
			} 
			catch (IOException e) {			
				
			}
			Player p=new Player();
			p.setName(name);
			p.setPos(b.INITIAL);			
			p.state="DIED";
			playerslist.add(p);				
		}
		
	}
	public void play(int n) {	
		int point=0;
		readData();	
		b.setLadder(n);
		b.setSnake(n);
		
		int res=0;
		do {
			
					
		for(int i=0;i<playerslist.size();i++) {
                       try {  
				Thread.sleep(1729);
				Cls.cls();
                                System.out.println("\n\n");
			} catch (IOException | InterruptedException e) {		
				e.printStackTrace();
			}

			b.setBoard(n,playerslist);
			getScore();	
			do{
		     System.out.print(playerslist.get(i).getName()+" press one to throw the dice:");
		     point=throwDice();
		     System.out.println("#"+point);
	    if(((playerslist.get(i).state).equals("DIED"))&&(point==6)) {
	    	playerslist.get(i).setPos(1);
	    	playerslist.get(i).state="ALIVE";
	    }
	     
	    else if((playerslist.get(i).state).equals("ALIVE")) {
	    	 int oldValue= playerslist.get(i).getPos();
			    int newValue=oldValue+point;
			 if(newValue<100) {
				newValue=checkSnakeandLadder(newValue);
			    playerslist.get(i).setPos(newValue);
			    for(int j=0;j<playerslist.size();j++) {
				   if(i!=j) {
			    	    if((playerslist.get(i).getPos())==(playerslist.get(j).getPos())) {			    			
			    		  playerslist.get(j).setPos(b.INITIAL);
                                          System.out.println(playerslist.get(i).getName()+" Killed "+playerslist.get(j).getName());
			    		  playerslist.get(j).state="DIED";
			    		  point=0;
			    			}
				    }
			    }
		      }
			    else if(newValue==100) {
			    	playerslist.get(i).state="WIN";
			    	playerslist.get(i).setPos(100);
			    	winner(playerslist.get(i).getName());
			    }
			    else {			    	
			    }
	    }
	    else {
	    	
	    }
	    
	    }while((point==6)||(point==0));
	}
		
		for(int i=0;i<playerslist.size();i++) {
		    if((playerslist.get(i).state).equals("WIN"))	
		    	res=1;
	    }
		}while(res!=1);
}
	private int checkSnakeandLadder(int newValue) {
		Boolean flag=b.values.contains(newValue);
		if(flag==true) {
			for(int z=0;z<b.snakes.size();z++) {
				 if((b.snakes.get(z).head==newValue)) {
					 newValue=b.snakes.get(z).tail;
					 }
				  }
				  for(int z=0;z<b.ladders.size();z++) {
					 	  if((b.ladders.get(z).bottom==newValue)) {
					 		 newValue=b.ladders.get(z).top;
					 }
				  }
		}
		return newValue;
	}
	public int throwDice() {
		int ch,value=0;
	 Scanner in =new Scanner(System.in);
		do {
		       ch=in.nextInt();		     
		     if(ch==1) {
		    	 value=b.dice();
		     }
		     else{
		    	 System.out.print("Try again!! Press 1 to throw the dice:");
		     }
		     }while(ch!=1);
		return value;
	}
	public void winner(String name) {
                        try {  
				Cls.cls();                                
			} catch (IOException | InterruptedException e) {		
				e.printStackTrace();
			}
		System.out.print(name+" WINS!!!!!!!!!!!");
		System.exit(0);
	}
	public void getScore() {
		for(int i=0;i<playerslist.size();i++) {
		     System.out.print(playerslist.get(i).getName()+" : "+playerslist.get(i).getPos()+"\t");		    
	    }
	}

}