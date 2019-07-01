import java.util.ArrayList;
import java.util.Random;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Board {
	int INITIAL=0,FINAL=100;
	 ArrayList<Integer> values=new ArrayList<Integer>();
	 ArrayList<Snake> snakes=new ArrayList<Snake>();
	 ArrayList<Ladder> ladders=new ArrayList<Ladder>();

	 public void setBoard(int n,ArrayList<Player> players) {
	int x=n, z=n*n+1;
	int a[][]=new int [20][20];
	for(int i=0;i<x;i++) {
		int c=(n%2==0)?-1:1;
		for(int j=0;j<x;j++) {
			z=z+c;
			a[i][j]=z;			
		}
		z=z-x+c;
		n--;		
		}	
		getBoard(a,x,players);
		
}
  private void getBoard(int[][] a,int x,ArrayList<Player> players) {
	  String b=null;
	
	  for(int i=0;i<x;i++) {
			for(int j=0;j<x;j++) {	
				int s=0;
				for(int t=0;t<players.size();t++) {	
					if(a[i][j]==players.get(t).getPos()) {
						b="( "+(players.get(t).getName().substring(0,3))+" )";
						s=1;
					}
				}
				if(s==0) {
				Boolean flag=values.contains(a[i][j]);
				if(flag==true) {
					
					 for(int z=0;z<snakes.size();z++) {
					 if((snakes.get(z).head==a[i][j])) {
						 b=snakes.get(z).name+"h";
						 }
					 else if(snakes.get(z).tail==a[i][j]) {
						 b=snakes.get(z).name+"t";
					 }
					  }
					  for(int z=0;z<ladders.size();z++) {
						 	  if((ladders.get(z).bottom==a[i][j])) {
						 		 b=ladders.get(z).name+"b";
						 	  }
						 	  else if(ladders.get(z).top==a[i][j]) {
							 b=ladders.get(z).name+"t";
						 }
					  }
				}
				else {
					b=Integer.toString(a[i][j]);
				}
				
				}
				System.out.print(b+"\t|\t");
		     }
		    System.out.print("\n\n--------------------------------------------------------------------------------------------------------------------------------------------------------\n\n");
		 }                     
	}
	
public int dice()
	{
		Random rand=new Random();
		int diceValue=rand.nextInt(6)+1;
		return diceValue;
	}
  public void setSnake(int n) {
	  int tail=0,head=0;	  
	  Random rand=new Random();
	 
	  int per=75;
	  int noOf_Snake=rand.nextInt((n/2))+(n/2);
	  for(int i=1;i<=noOf_Snake;i++,per=per-7) {
		  Snake s=new Snake();
		  int len=((n*n*per)/100);
		  do {
           head=rand.nextInt(n*n)-1;
           tail=head-len;
          if(tail>2) {
        	  tail=checkDuplication(head,tail);
          }
		  }while(tail<=2);
           s.head=head;values.add(head);
           s.tail=tail;values.add(tail);
           s.name="S"+i;  // System.out.println(head+" S "+tail+s.name);       
           snakes.add(s);
	  }
  }
  public void setLadder(int n) {
	  int top=100,bottom=0;	  
	  Random rand=new Random();
	 
	  int per=75;
	  int noOf_Ladder=rand.nextInt((n/2))+(n/2);
	  for(int i=1;i<=noOf_Ladder;i++,per=per-7) {
		  Ladder l=new Ladder();
		  int len=((n*n*per)/100);
		  do {
			  bottom=rand.nextInt(n*n)+1;
              top=bottom+len;
              if((top<((n*n)-2))&&(bottom<top)) {
            	  top=checkDuplication(bottom,top);
              }
		  }while((top>((n*n)-2)));
           l.bottom=bottom;values.add(bottom);
           l.top=top;values.add(top);
           l.name="L"+i;     // System.out.println(bottom+" L "+top+l.name);            
           ladders.add(l);
	  }
  }
  public int checkDuplication(int a, int b) {
	  int res=b;
	  for(int p=0;p<values.size();p++) {
   	   if((values.get(p)==a)||(values.get(p)==b)) {
   		   res=0;
   	   }   	   
      }
	  return res;
}
}
