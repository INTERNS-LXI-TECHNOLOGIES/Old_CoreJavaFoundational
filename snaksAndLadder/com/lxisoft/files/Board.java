package com.lxisoft.files;
import java.util.ArrayList;
import com.lxisoft.files.*;
import java.util.*;
public class Board
{
	private ArrayList<Integer> cells = new ArrayList<Integer>();
	ArrayList<Snake> snakes=new  ArrayList<Snake>();
	ArrayList<Ladder> ladders=new  ArrayList<Ladder>();
	ArrayList<Player> players = new ArrayList<Player>();
	
	public void setCells(ArrayList<Integer> cellls)
	{
		this.cells=cells;
	}
	public ArrayList<Integer> getCells()
	{
		return cells;
	}
	
    public void setSnakes(ArrayList<Snake> snakes)	
	{
		this.snakes=snakes;
	}
	public ArrayList<Snake> getSnakes()
	{
		return snakes;
	}
    public void setLadders(ArrayList<Ladder> ladders)
	{
		this.ladders=ladders;
	}
	public ArrayList<Ladder> getLadders()
	{
		return ladders;
	}
	public void getPlayers(ArrayList<Player> players)
	{
		this.players=players;	
	}
	

public void setSnakesAndLaddersOnTheBoard()
		{ 
		for(int i=0;i<players.size();i++)
	    {
	       System.out.println("kkkkkkkk"+players.get(i).getName()+""+players.get(i).getPosition());
        }
           ArrayList<Integer> value=new ArrayList<Integer>();
		
	       for(int i=0;i<4;i++)
		   {
			  boolean checking = false;
			   int a,b,c,d,g =0;
		  do{	
			   a =(int)(Math.random() *100);
			   b =(int)(Math.random() *100);
			   c =(int)(Math.random() *100);
			   d =(int)(Math.random() *100);
			   //System.out.println("a:"+a);  
			   //System.out.println("b:"+b);  
			   //System.out.println("c:"+c);  
			   //System.out.println("d:"+d); 
			   System.out.println("                 "); 
               if(b>a)
				{
					int s=a;
					int n=b;
					    b=s;
						a=n;
				}
                if(c>d)
				{
					int l=c;
					int m=d;
					    d=l;
						c=m;
				}
				if(value.size()<=0){
						value.add(a);
						value.add(b);
						value.add(c);
						value.add(d);
						
				}
			   for(int v=0;v<value.size();v++)
				{					
					if(value.get(v)==a||value.get(v)==b||value.get(v)==c||value.get(v)==d)
					{
						checking=true;
						break;
					} 
					else
					{
						checking = false;
				    }
				}
				if(checking== false)
				{
						value.add(a);
						value.add(b);
						value.add(c);
						value.add(d);
						checking = false;
				}
			  }while(checking);
			 Snake snake=new Snake();
			 snake.setHead(a);
			 snake.setTail(b);
			 snakes.add(snake);
			 Ladder ladder=new Ladder();
			 ladder.setStartPosition(c);
			 ladder.setEndPosition(d);
			 ladders.add(ladder);
			 g++;
            }
				createBoard();
		   //for(int j=0;j<snakes.size();j++)
			//{
			     //System.out.println("\n\nladder S"+ladders.get(j).getStartPosition()+"  ladder E"+ladders.get(j).getEndPosition()+"\n");
			     //System.out.println("\n\nsnake H"+snakes.get(j).getHead()+"  snake T"+snakes.get(j).getTail()+"\n");
			//}
		}
		
		
		
		
		
	
	
	
	
	
	
	public void createBoard()
	{  
	int a=100;
	int t = 0;
	int z=0;
	
			for(int i=0;i<10;i++)
			{
				boolean h = false;
				System.out.println("\n");
			
				for(int k=0;k<snakes.size();k++)
				{
					if(a==snakes.get(k).getHead())
					{
						boolean x = false;
					 z=a;
						for(int m=0;m<players.size();m++)
						{
							if(snakes.get(k).getHead()==players.get(m).getPosition())
							{
								h=true;
								players.get(m).setPosition(snakes.get(k).getTail());
								//if(players.get(m).getPosition()==snakes.get(k).getTail())
								//{
									//x=true;
								  // int v=m;
								  // v++;
								  // System.out.print(a+"{h"+(k+1)+"}"+"P"+v+"\t");
								//}
							}
					
						}
						if(!x){
						 System.out.print(a+"{h"+(k+1)+"}"+"\t");
						}
					}
					else if(a==snakes.get(k).getTail())
					{
					   z=a;
	    			  // System.out.print(a+"{t"+(k+1)+"}"+"\t");
					   int g=0;
							 for(int m=0;m<players.size();m++)
							  {
								  g=m;
								  
							  }
							// if(players.get(g).getPosition()==snakes.get(k).getTail())
							// {
								//System.out.print("P"+g);
							 //}
							  if(players.get(g).getPosition()!=snakes.get(k).getTail())
						  {
							  System.out.print(a+"{t"+(k+1)+"}"+"\t");
						  }
					      if(players.get(g).getPosition()==snakes.get(k).getTail())
							{
								h=true;
								 System.out.print("{t"+(k+1)+"}"+"p"+g+"\t");
							}
					}  
								
					else if(a==ladders.get(k).getStartPosition())
				    {
					z=a;
					boolean x = false;
					for(int m=0;m<players.size();m++)
						{
							if(ladders.get(k).getStartPosition()==players.get(m).getPosition())
							{
								h=true;
							   players.get(m).setPosition(ladders.get(k).getEndPosition());
							   
							  // if(a==players.get(m).getPosition())
							   //{
								 //  x=true;
								// int v=m;
								 //v++;
								//System.out.print(a+"|s"+(k+1)+"|"+"p"+v+"\t");
							   //}
							}
							
						}
						if(!x)
							{
								System.out.print(a+"|s"+(k+1)+"|"+"\t");
							}
						
				    }
				    else if(a==ladders.get(k).getEndPosition())
					{
						
						boolean x = false;
						z=a;
					  for(int m=0;m<players.size();m++)
					  {
						if(ladders.get(k).getEndPosition()==players.get(m).getPosition())
						{
							h=true;
							x=true;
							int v=m;
								 v++;
								System.out.print(a+"|e"+(k+1)+"|");
						}
						
						
					  }
					  if(!x){
							System.out.print(a+"|e"+(k+1)+"|"+"\t");
						}
						
					}
					
				}
				for(int r=0;r<players.size();r++)
					{
						if(a==players.get(r).getPosition()&& h == false)
						{
							 int v=r;
						     v++;
							System.out.print("P#"+v);
						}
					}
			   if(a!=z)
				{
				System.out.print(a+"\t");
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				for(int j=0;j<9;j++)
				{
					boolean l = false;
					if(t%10==1)
					{
						a++;
					}
					
					else
					{
						a--;
					}
				
				
				
				for(int k=0;k<snakes.size();k++)
				{
					if(a==snakes.get(k).getHead())
					{
						l=true;
						boolean x =false;
						z=a;
						for(int m=0;m<players.size();m++)
						{
							if(snakes.get(k).getHead()==players.get(m).getPosition())
							{
								players.get(m).setPosition(snakes.get(k).getTail());
								//if(a==snakes.get(k).getTail())
								//{
								//	x=true;
									//int v=m;
								   //v++;
									//System.out.print(a+"{h"+(k+1)+"}"+"p"+v+"\t");
							//	}	
							}
						}
						if(!x){
							System.out.print(a+"{h"+(k+1)+"}"+"\t");
						}
					}
					
					else if(a==snakes.get(k).getTail())
					{
						z=a;
	    				int g=1;
						 for(int m=0;m<players.size();m++)
					      {
							  g=m;
						  }
						  if(players.get(g).getPosition()!=snakes.get(k).getTail())
						  {
							  System.out.print(a+"{t"+(k+1)+"}\t");
						  }
					      if(players.get(g).getPosition()==snakes.get(k).getTail())
							{
								l=true;
								 System.out.print("{t"+(k+1)+"}"+"p"+g+"\t");
							}
					} 
					
				else if(a==ladders.get(k).getStartPosition())
				 {
				    
					z=a;
					boolean x = false;
					for(int m=0;m<players.size();m++)
						{
							if(ladders.get(k).getStartPosition()==players.get(m).getPosition())
							{
								l=true;
								 players.get(m).setPosition(ladders.get(k).getEndPosition());
							  //if(a==players.get(m).getPosition())
							   //{
								 //  x = true;
								   //int v=m;
								   //v++;
								  //System.out.print(a+"|s"+(k+1)+"|"+"P"+v+"\t");
							   //}
							}
						}
						if(!x){
							System.out.print(a+"|s"+(k+1)+"|"+"\t");
						}
				    }
					
					
					
					 else if(a==ladders.get(k).getEndPosition())
					{
						boolean x = false;
						
						z=a;
					  for(int m=0;m<players.size();m++)
					  {
						//if(a==players.get(m).getPosition())
						if(ladders.get(k).getEndPosition()==players.get(m).getPosition())
						{
							l=true;
							x=true;
							int v=m;
								 v++;
								System.out.print(a+"|e"+(k+1)+"|");
						}
					  }
					  if(!x){
						System.out.print(a+"|e"+(k+1)+"|"+"\t");
					  }
					}
					
					}
				   for(int r=0;r<players.size();r++)
					{
						if(a==players.get(r).getPosition()&&l==false)
						{
						    int v=r;
							v++;
							System.out.print("Px"+v);
						}
					}
					if(a!=z)
					{
					System.out.print(a+"\t");
					}
			}
		a=a-10;
		t=a;
		}
	}
	public void a()
	{
		
	}
}

/*package com.lxisoft.files;
import java.util.ArrayList;
import com.lxisoft.files.*;
import java.util.*;
public class Board
{
    private ArrayList<Integer> cells = new ArrayList<Integer>();
	ArrayList<Snake> snakes=new  ArrayList<Snake>();
	ArrayList<Ladder> ladders=new  ArrayList<Ladder>();
	ArrayList<Player> players = new ArrayList<Player>();
	public void setCells(ArrayList<Integer> cellls){this.cells=cells;}
	public ArrayList<Integer> getCells(){return cells;}
	public void setSnakes(ArrayList<Snake> snakes){this.snakes=snakes;}
	public ArrayList<Snake> getSnakes(){return snakes;}
    public void setLadders(ArrayList<Ladder> ladders){this.ladders=ladders;}
	public ArrayList<Ladder> getLadders(){return ladders;}
	public void getPlayers(ArrayList<Player> players){this.players=players;}
public void createBoard()
{
	int a=100;
	int t = 0;
	int z=0;
	for(int i=0;i<10;i++)
	{
	 System.out.println("\n");
	 if(a!=z)
		{
		  //System.out.print(a+"\t");
		  displayBoard(a);
		}
	for(int j=0;j<9;j++)
	{
		if(t%10==1)
		{
			a++;
		}
		
		else
		{
			a--;
		}
		if(a!=z)
		{
		//System.out.print(a+"\t");
		displayBoard(a);
		}
	}
a=a-10;
t=a;
}
}
public void randomValueAssignSnakesNLadders()
{
	ArrayList<Integer> value=new ArrayList<Integer>();
	for(int i=0;i<4;i++)
	{
			System.out.print("a");
		boolean checking = false;
	    int a,b,c,d,g=0;
		do{
		a =(int)(Math.random() *100);
		b =(int)(Math.random() *100);
		c =(int)(Math.random() *100);
		d =(int)(Math.random() *100);
		if(b>a)
				{
					int s=a;
					int n=b;
					    b=s;
						a=n;
				}
                if(c>d)
				{
					int l=c;
					int m=d;
					    d=l;
						c=m;
				}
				if(value.size()<=0){
						value.add(a);
						value.add(b);
						value.add(c);
						value.add(d);
						
				}
			   for(int v=0;v<value.size();v++)
				{					
					if(value.get(v)==a||value.get(v)==b||value.get(v)==c||value.get(v)==d)
					{
						checking=true;
						break;
					} 
					else
					{
						checking = false;
				    }
				}
				if(checking== false)
				{
						value.add(a);
						value.add(b);
						value.add(c);
						value.add(d);
						checking = false;
				}
			  }while(checking);
	//setSnakesHeadsNTails(a,b); 
	 Snake snake=new Snake();
	 snake.setHead(a);
	 snake.setTail(b);
	 snakes.add(snake);
	 Ladder ladder=new Ladder();
	 ladder.setStartPosition(c);
	 ladder.setEndPosition(d);
	 ladders.add(ladder);
	 g++;
	}
	
}

public void displayBoard(int a)
{
	System.out.print("\t"+a);
	randomValueAssignSnakesNLadders();
	setSnakesHeadsOnTheBoard(a);
}
/*public void setSnakesHeadsNTails(int a,int b)
{
	int g=0;
	 Snake snake=new Snake();
	 snake.setHead(a);
	 snake.setTail(b);
	 snakes.add(snake);
	 g++;
	 
}
/*public void setSnakesHeadsOnTheBoard(int a)
{

  for(int k=0;k<snakes.size();k++)
   {
	   	//System.out.println("llllllllllll");

	   if(a==snakes.get(k).getHead())
	   {
		   System.out.print(a+"{h"+(k+1)+"}"+"\t");
	   }
   }
}
public void setLadders()
{
}
}*/