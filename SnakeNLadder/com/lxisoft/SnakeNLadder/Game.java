package com.lxisoft.SnakeNLadder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/**
*This class is used to play Game
*
*@author AJAY .E.S
*
*@version 1.0

*/
public class Game  {
	 ArrayList<Player> playerslist=new ArrayList<Player>();
	 Board b=new Board();
	 Dice d=new Dice();
	 AudioPlay audio=new AudioPlay();


	 public void start(){
		 int n=10,x;
		 do {
					Scanner in =new Scanner(System.in);
					System.out.print("**RULES**\n1.One must get 6 to get into Board.\n2.One who get extra throw if\n\t\tGot dice value 6\n\t\tGet over previous player position.\n3.Start from 1 and Win when reach at "+(n*n)+"\nPress 1 to start play!!");
					x=in.nextInt();
					if(x==1) {	    	
						play(n);
					}
					else {
						try{
							 throw new OneCheckException("Invalid input !!Press 1 .");
						  }
						 catch(OneCheckException oce){
								  System.out.println(oce.getMessage());
						   }
					 }
		 }while(x!=1);
	 }		        


	 public String readPlayerName(int i){
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));	
		String name=null;
		System.out.print("Enter the name for player(first 3 chararter is taken)"+i+":");
				try {
					 name=input.readLine();
				} 
				catch (IOException e) {						
				}
		return name;
	 }
     

     public void readData() {			
			Scanner in =new Scanner(System.in);
			int no;		
			do{
				System.out.print("Enter the Number of Players(2-5):");
				no=in.nextInt();		
			}while((no>5)||(no<2));
			for(int i=1;i<=no;i++) {
				String name=readPlayerName(i);			
				Player p=new Player();
				p.setName(name);
				p.setPos(b.INITIAL);			
				p.state="DIED";
				playerslist.add(p);				
			}		
	 }


	 public void play(int n) {			   		
				readData();	
				b.setLadder(n);
				b.setSnake(n);
				int res=0;
				do {
						for(int i=0;i<playerslist.size();i++) {
								clearDelayedView(n);	
								playerChance(i,n);
						}		
					   res=checkWin();
				}while(res!=1);
	}


	public void playerChance(int i,int n){
		  int point=0;
		 do{
			 System.out.print("\n"+playerslist.get(i).getName()+" Press one to throw the dice:");
			 point=throwDice();
			  System.out.println("#"+point);
			  if(((playerslist.get(i).state).equals("DIED"))&&(point==6)) {
					 givePlayerLife
                     (i,n);	
			 }	     
			  else if((playerslist.get(i).state).equals("ALIVE")) {
					 point=playPlayer(i,point,n);
			 }
			  else { }	    
		  }while((point==6)||(point==0));
	}


	public int playPlayer(int i, int point,int n){
		int oldValue= playerslist.get(i).getPos();
		int temp=0;
		while(temp<point){
		   oldValue++;
		   temp++;
		   playerslist.get(i).setPos(oldValue);
		   System.out.println("Moving....................");
		   clearDelayedView(n);                   
		}
		 int newValue=oldValue;
		if(newValue<100) {
			point=movePlayer(newValue,i,point);
		}
		else if(newValue==100) {
			 winner( i);
		}
		else {  }
			return point;
	}


	public void givePlayerLife(int i,int n){
			 playerslist.get(i).setPos(1);
			 playerslist.get(i).state="ALIVE";
			 System.out.println("Moving....................");
			 clearDelayedView(n);
	}


	  public int movePlayer(int newValue,int i,int point){
				audio.playSound("walk.wav");
				newValue=checkSnakeandLadder(newValue);
				 playerslist.get(i).setPos(newValue);
				for(int j=0;j<playerslist.size();j++) {
					if(i!=j) {
							if((playerslist.get(i).getPos())==(playerslist.get(j).getPos())) {
								audio.playSound("kill.wav");			    			
								playerslist.get(j).setPos(b.INITIAL);
								 System.out.println(playerslist.get(i).getName()+" Killed "+playerslist.get(j).getName());
								playerslist.get(j).state="DIED";
								 point=0;
							 }
					 }
				}
				return point;
	 }


	public int checkWin(){
		int res=0;
		for(int i=0;i<playerslist.size();i++) {
				 if((playerslist.get(i).state).equals("WIN"))	
						 res=1;
						}
		return res;
	}


	private int checkSnakeandLadder(int newValue) {
		Boolean flag=b.values.contains(newValue);
		if(flag==true) {
			for(int z=0;z<b.snakes.size();z++) {
				 if((b.snakes.get(z).head==newValue)) {
					 audio.playSound("snake.wav");
					 newValue=b.snakes.get(z).tail;
				  }
			}
			for(int z=0;z<b.ladders.size();z++) {
				  if((b.ladders.get(z).bottom==newValue)) {
						audio.playSound("ladder.wav");
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
					value=d.dice();
					AudioPlay audio=new AudioPlay();
					audio.playSound("dice.wav");
			   }
			   else{
				   try{                   
					   throw new OneCheckException("Invalid input !!Press 1 .");                            
					}
				   catch(OneCheckException oce){
					   System.out.println(oce.getMessage());
					}
			   }
		 }while(ch!=1);
		 return value;
	}


	public void winner(int i) {
			playerslist.get(i).state="WIN";
			playerslist.get(i).setPos(100);
			String name=playerslist.get(i).getName();
			try {  
				Cls.cls();                                
				} 
			 catch (IOException | InterruptedException e) {		
				e.printStackTrace();
			 }
			 audio.playSound("win.wav");
			 System.out.print(name+" WINS!!!!!!!!!!!");
			 System.exit(0);
	}


	public void getScore() {
		for(int i=0;i<playerslist.size();i++) {
			 System.out.print(playerslist.get(i).getName()+" : "+playerslist.get(i).getPos()+"\t");		    
		}
	}


	public void clearDelayedView(int n){
		 try {  
				Thread.sleep(1200);
				 Cls.cls();
				System.out.println("\n\n");
		  }
		 catch (IOException | InterruptedException e) {		
				e.printStackTrace();
		}
		b.setBoard(n,playerslist);
		getScore();
	}
}