package com.lxisoft.requirements;
import java.util.*;
public class Board
{


 int numbers[][]=new int[10][10];
public ArrayList<Ladder> ladders=new ArrayList<Ladder>();
public ArrayList<Snake> snakes=new ArrayList<Snake>();

Random r = new Random();


public void placeSnakes()
{
	int element1=0;
	int element2=0;
	
	for(int i=0;i<5;i++)
	{
		//System.out.println("\n");
    int x=r.nextInt(98-36)+36;
    int y=r.nextInt(64-7)+7;
	snakes.add(new Snake());
	if((x!=element1) && (y!=element2))
	{
		element1=x;
		element2=y;
	if(x>y)
	{
	snakes.get(i).setHead(x);
	snakes.get(i).setTail(y);
	//System.out.println("H"+(i+1)+" : "+snakes.get(i).getHead());
	//System.out.println("T"+(i+1)+" : "+snakes.get(i).getTail());
	}
	else
	{
		snakes.get(i).setHead(y);
		snakes.get(i).setTail(x);
		//System.out.println("H"+(i+1)+" : "+snakes.get(i).getHead());
	    //System.out.println("T"+(i+1)+" : "+snakes.get(i).getTail());
		
	}
	}
	else{
	}
	
	}
	
	
}


public void placeLadders()
{
	int value1=0;
	int value2=0;
	for(int i=0;i<5;i++)
	{    
        System.out.println("\n");
		int p=r.nextInt(56-5)+5;
		int q=r.nextInt(94-35)+35;
		ladders.add(new Ladder());
		if((p!=value1) && (q!=value2))
		{
			value1=p;
			value2=q;
		if(p<q)
		{
			ladders.get(i).setBottom(p);
			ladders.get(i).setTop(q);
			System.out.println("B"+(i+1)+" : "+ladders.get(i).getBottom());
			System.out.println("t"+(i+1)+" : "+ladders.get(i).getTop());
		}
		else{
			
			ladders.get(i).setBottom(q);
			ladders.get(i).setTop(p);
			System.out.println("B"+(i+1)+" : "+ladders.get(i).getBottom());
			System.out.println("t"+(i+1)+" : "+ladders.get(i).getTop());
		}
		}
		else{
		}
	}
	
	
}


public void createBoard()
{


              int x = 101;
			int  n=10;
			 
			 for(int i=0;i<10;i++)
			   {
			        for(int j=0;j<10;j++)
			           {
			               if(n%2==0)
			                 {
			                      x--;
			                      numbers[i][j]=x;
			                 }
			 
			               else
			                 {
			                      numbers[i][j]=x;
			                      x++;
			                 }
			           }
			        x=x-10;
			        n--;
			  }
			 
			 
			 
			int k=0;
			placeSnakes();
			
		for(int i=0;i<10;i++)
			 { 
			    for(int j=0;j<10;j++)
			      {
					  int m=0;
					  for(k=0;k<snakes.size();k++)
					  {
						  
						  if((snakes.get(k).getHead())==(numbers[i][j]))
						  {
                      System.out.print("("+numbers[i][j]+")H"+(k+1)+"\t");
					 m=1;
						  }
						  else if((snakes.get(k).getTail())==(numbers[i][j]))
						  {
							System.out.print("("+numbers[i][j]+")T"+(k+1)+"\t");
                          m=1;
						  }
						 
						  else{
							//System.out.print(numbers[i][j]+"\t"); 
							//m=0;
						  }
						  
					  }
					  if(m==1)
					  {
						  
					  }
					  else
					 System.out.print(numbers[i][j]+"\t"); 
                  }

                  System.out.println("\n");
             }


        
}			 
			 

}
