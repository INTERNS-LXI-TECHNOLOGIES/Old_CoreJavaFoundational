package com.snakeandladder;
import com.snakeandladder.*;
import java.util.ArrayList;
import java.util.function.BooleanSupplier;
public class Board
{
 
ArrayList<Snake>snakes= new ArrayList();
ArrayList<Ladder>ladders=new ArrayList();
public ArrayList <Player> players=new ArrayList<Player>();
int Cell[][]= new int[11][11];
@SuppressWarnings("static-access")

public void setBoard()
{
	setSnakeAndLadder();
	int a = 100;
	int b = 1;
	int c = 2;
	
	
	for(int i=10;i>0;i--)
	{
		
		
		if(i%2==0) 
		{
			for(int j=10;j>0;j--)
			{
				int status = checkSnakeAndLadder((10*(i-1))+j);
				int check=checkPlayer((10*(i-1))+j);
				//System.out.print(check);
				if(check==6)
				{
					System.out.print("('')");
				}
				if(status==5)
				{
					System.out.print("/o\\"+"\t");
				
				}
				else if(status==3)
				{
					System.out.print("|_|"+"\t");
				}
				else if(status==-5)
				{
					System.out.print("$"+"\t");
				}
				else if(status==-3)
				{
					System.out.print("|^|"+"\t");
				}
				else
				{
					System.out.print((10*(i-1))+j+"\t");
				}
				
			}
		}
		else
		{
			for(int j=0;j<10;j++)
			{
				int playerCheck=checkPlayer(((10*(i-1))+j)+1);
				if(playerCheck==6)
				{
					System.out.print("('')");
				}
			
				int status = checkSnakeAndLadder(((10*(i-1))+j)+1);
				if(status==5)
				{
					System.out.print("/o\\"+"\t");
				}
				else if(status==3)
				{
					System.out.print("|_|"+"\t");
				}
				else if(status==-5)
				{
					System.out.print("$"+"\t");
				}
				else if(status==-3)
				{
					System.out.print("|^|"+"\t");
				}
				else
				{
					System.out.print(((10*(i-1))+j)+1+"\t");
				}
			}
		}
	
		System.out.println("\n\n");
		a=a-10;
	
	}
}
public void setSnakeAndLadder()
{
		int numberOfSnake = 4;
		int numberOfladder = 4;
		for(int i=snakes.size();i<numberOfSnake;i++)
		{
			Snake snake= new Snake(); 
			int h,b;
			boolean chek = false;
			do{
				h = (int)(Math.random()*48)+50;
				b = (int)(Math.random()*50)+2;
				chek = checking(h,b);
			}while(chek);
			snake.setStart(h);
			snake.setEnd(b);
			//System.out.println(b+"$$"+h);
			snakes.add(snake);
			
		}
		for(int i=ladders.size();i<numberOfladder;i++)
		{
			Ladder ladder=new Ladder();
			int	x,y;
			Boolean repeat = false;
			do{
				
			x = (int)(Math.random()*45)+5;
			y =  (int)(Math.random()*50)+50;
				repeat = checking(x,y);
			
			}
			while(repeat);
			ladder.setStart(x);
			ladder.setEnd(y);
			ladders.add(ladder);
			//System.out.print(ladders.size()+"{}");
			
		}
}

	public boolean checking(int start,int end)
	{
		int a = 0;
		//Boolean res=false;
		for(int j=0;j<ladders.size();j++)
		{
			if(ladders.get(j).getStart()==start||ladders.get(j).getEnd()==end||ladders.get(j).getStart()==end||ladders.get(j).getEnd()==start){
				a++;
			}
		}
		for(int j=0;j<snakes.size();j++)
		{
			if(snakes.get(j).getStart()==start||snakes.get(j).getEnd()==end||snakes.get(j).getStart()==end||snakes.get(j).getEnd()==start){
				a++;
			}
		}
		if(a>0)
		{
			return true;
		}
		return false;
	}
public int checkPlayer(int j)
{
//	GamePlay gp=new GamePlay();
//	
//	players=gp.getPlayers();
	//System.out.print("#"+j+"#"+players.size());
	int res=-6;
	for(int i=0;i<players.size();i++)
	{
		
		//System.out.print(gp.players.get(i).getPosition()+"?");
		if(players.get(i).getPosition()==j)
		{
			//gp.players.get(i).setPosition(1);
		
			res=6;
		}
		
	}
	//System.out.print(gp.players.size()+"?");
	return res;
}
public int checkSnakeAndLadder(int j)
{
	int res=0;
//	System.out.print(snakes.size()+"#"+ladders.size()+"%");
	for(int o=0;o<snakes.size();o++)
	{
		//System.out.print(snakes.size()+"%%%%");
		if(snakes.get(o).getStart()==j)
		{
			res= 5;
		}
		if(snakes.get(o).getEnd()==j)
		{
			res=-5;
		}
	}
	for(int i=0;i<ladders.size();i++)
	{
		//System.out.print(ladders.size()+"LL***");
		if(ladders.get(i).getStart()==j)
		{
			res= 3;
		}
		else if(ladders.get(i).getEnd()==j)
		{
			res= -3;
		}
	
	}	
	
	
	return res;
}

	public int roller()
{
	return Dice.roll();
}

public void boardView()
{
	GamePlay gp=new GamePlay();
	setBoard();
}
 

}
