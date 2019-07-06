package com.lxisoft.game.control;
import com.lxisoft.game.model.*;
import com.lxisoft.game.view.*;
import java.io.*;
import java.util.*;
import java.util.logging.*;
/**
*This class is used as a control class for SnakeNLadder
*
*@author AryaVineesh
*
*@version 1.0
*
*Date Modified:06/07/2019
*/
public class SnakeNLadderControl
{
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(SnakeNLadderControl.class.getName());
	
	SnakeNLadder game;
	SnakeNLadderView gameView;
	
	public SnakeNLadderControl()
	{
		log.setLevel(Level.WARNING);
	}
	
	public void createBoard(SnakeNLadder game)
	{
		
		Board board=new Board();
		placeCells(board);
		placeSnakes(board);
		// placeLadders(board);
		
		game.setBoard(board);
		//placeSnakesNLadders(board);
	}
	
	public void placeCells(Board board)
	{
		Cell[][] cellArray=new Cell[10][10];
		int x=100;
		for(int i=0;i<10;i++)
		{
			if(i%2==0)
			{
				for(int j=0;j<10;j++)
				{
					cellArray[i][j]=new Cell();
					cellArray[i][j].setCellNumber(x);
					x--;
				}
				x=x-10;
			}
			else
			{
				int temp=x+1;
				for(int j=0;j<10;j++)
				{
					cellArray[i][j]=new Cell();
					cellArray[i][j].setCellNumber(temp);
					temp++;
				}
			}
		}
		board.setCells(cellArray);
	}
	
	public void placeSnakesNLadders(Board board)
	{
		ArrayList<Snake> snakes=new ArrayList<Snake>();
		ArrayList<Ladder> ladders=new ArrayList<Ladder>();
		ArrayList<Integer> randomPosition=getListOfRandomNumbers();
		Collections.sort(randomPosition);
		int i=0;
		int j=randomPosition.size()-1;
		do
		{
			for(int n=0;n<5;n++)
			{
				snakes.add(new Snake());
				snakes.get(n).setTailPosition(randomPosition.get(i));
				snakes.get(n).setHeadPosition(randomPosition.get(j));
			
				System.out.println("SH"+n+":"+snakes.get(n).getHeadPosition());
				System.out.println("ST"+n+":"+snakes.get(n).getTailPosition());
			
			
			i=i+1;
			j=j-1;
			}
			
		}while(i<5&&j>14);
		
		
	}
	
	public ArrayList<Integer> getListOfRandomNumbers()
	{
		ArrayList<Integer> numberList=new ArrayList<Integer>();
		int i=0;
		 do
		 {
			 int random=(int)(Math.random()*100);
			 if(!numberList.contains(random))
			 {
				 numberList.add(random);
				 i++;
			 }
		 }while(i<20);
		 return numberList;
	}
	
	public void placeSnakes(Board board)
	{
		ArrayList<Snake> snakes=new ArrayList<Snake>();
		ArrayList<Integer> randomPosition=getListOfRandomNumbers();
		Collections.sort(randomPosition);
		placeLadders(board,randomPosition);
		int i=0;
		int j=randomPosition.size()-1;
		do
		{
			for(int n=0;n<5;n++)
			{
				snakes.add(new Snake());
				snakes.get(n).setTailPosition(randomPosition.get(i));
				snakes.get(n).setHeadPosition(randomPosition.get(j));
			
				System.out.println("SH"+n+":"+snakes.get(n).getHeadPosition());
				System.out.println("ST"+n+":"+snakes.get(n).getTailPosition());
			
			
			i=i+1;
			j=j-1;
			}
			
		}while(i<5&&j>14);
		board.setSnakes(snakes);
	}
	
	public void placeLadders(Board board,ArrayList<Integer> randomPosition)
	{
		ArrayList<Ladder> ladders=new ArrayList<Ladder>();
		int i=5;
		int j=14;
		do
		{
			for(int n=0;n<5;n++)
			{
				ladders.add(new Ladder());
				ladders.get(n).setStartingPoint(randomPosition.get(i));
				ladders.get(n).setEndPoint(randomPosition.get(j));
			
				System.out.println("LB"+n+":"+ladders.get(n).getStartingPoint());
				System.out.println("LT"+n+":"+ladders.get(n).getEndPoint());
			
			
			i=i+1;
			j=j-1;
			}
			
		}while(i<10&&j>9);
		board.setLadders(ladders);
	}
	
	public int getRandomCellNumber(Board board)
	{
		int i=(int)(Math.random()*9);
		int j=(int)(Math.random()*9);
		Cell[][] cellArray=new Cell[10][10];
		cellArray=board.getCells();
		return cellArray[i][j].getCellNumber();
	}
	
	public void playGame(SnakeNLadder game)
	{
		gameView=new SnakeNLadderView();
		ArrayList<Player> playerList=game.getPlayers();
		Scanner sc=new Scanner(System.in);
		Dice dice=game.getDice();
		Board board=game.getBoard();
		for(int j=0;j<playerList.size();j++)
		{
			playerList.get(j).setIsAlive(false);
			playerList.get(j).setPlayerPosition(0);
		}
		do
		{
			
			for(int i=0;i<playerList.size();i++)
			{
				gameView.displayBoard2(board,playerList);
					System.out.println(" ");
				//gameView.displayBoard(board,i+1,playerList.get(i).getPlayerPosition());
				System.out.println(" ");
				System.out.println("player "+(i+1)+" ,"+playerList.get(i).getPlayerName()+" is rolling the dice...");
				System.out.println("press any key to roll the dice:");
				String c=sc.next();
				
				int random=dice.getRandomDiceNumber();
				System.out.println("Dice number is "+random);
				boolean status=playerList.get(i).getIsAlive();
				if(playerList.get(i).getPlayerPosition()==0)
				{
					//gameView.displayBoard(board,playerList.get(i).getPlayerPosition());
					if(random==1 || random==6 && status==false)
					{
						playerList.get(i).setIsAlive(true);
					}
					else
					{
						playerList.get(i).setIsAlive(false);
					}
				}
				
				if(playerList.get(i).getIsAlive()==true)
				{
					int currentPositon=playerList.get(i).getPlayerPosition();
					int newPosition=currentPositon+random;
					if(newPosition>100)
					{
						newPosition=currentPositon;
					}
					int updatedPosition=checkResult(newPosition,game.getBoard());
					playerList.get(i).setPlayerPosition(updatedPosition);
					System.out.println(" position of "+playerList.get(i).getPlayerName()+" is "+playerList.get(i).getPlayerPosition());
					//gameView.displayBoard(board,i+1,playerList.get(i).getPlayerPosition());
					//System.out.println(" ");
					game.setPlayers(playerList);
					
					gameView.displayBoard2(board,game.getPlayers());
					System.out.println(" ");
				}
			}
		}while(true);
	}
	
	public int checkResult(int position,Board board)
	{
		ArrayList<Snake> snakeList=board.getSnakes();
		ArrayList<Ladder> ladderList=board.getLadders();
		for(int k=0;k<5;k++)
		{
			int snakeHead=snakeList.get(k).getHeadPosition();
			int snakeTail=snakeList.get(k).getTailPosition();
			int ladderBottom=ladderList.get(k).getStartingPoint();
			int ladderTop=ladderList.get(k).getEndPoint();
			if(position==snakeHead)
			{
				System.out.println("......Snake hindered!......");
				position=snakeTail;
			}
			if(position==ladderBottom)
			{
				System.out.println(".....Ladder helped.....");
				position=ladderTop;
			}
			if(position==100)
			{
				System.out.println("win....game over...");
				System.exit(0);
			}
			
		}
		return position;
	}
}