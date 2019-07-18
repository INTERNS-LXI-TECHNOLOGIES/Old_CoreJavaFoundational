package com.lxisoft.game;
import java.util.*;
import java.util.logging.*;
/**
*This class is used as a class for Board
*
*@author AryaVineesh
*
*@version 1.2
*
*Date Modified:18/07/2019
*/
public class Board
{
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(Board.class.getName());
	
	public Board()
	{
		log.setLevel(Level.WARNING);
	}
	
	/**
	*This is an arraylist of snakes in the board
	*/
	private ArrayList<Snake> snakes;
	
	/**
	*This is an arraylist of ladders in the board
	*/
	private ArrayList<Ladder> ladders;
	
	/**
	*This is an array of cells in the board
	*/
	private Cell[][] cells;
	
	/**
	*This is the size of the board
	*/
	private int sizeOfBoard;
	
	/**
	*This method is used to set an arraylistof snakes in the board
	*
	*@param snakes
	*/
	public void setSnakes(ArrayList<Snake> snakes)
	{
		log.info("Board class...............setSnakes............start");
		this.snakes=snakes;
		log.info("Board class...............setSnakes............end");
	}
	
	/**
	*This method is will return an arraylist of snakes
	*
	*@return snakes
	*/
	public ArrayList<Snake> getSnakes()
	{
		log.info("Board class...............getSnakes............start/end");
		return snakes;
	}
	
	/**
	*This method is used to set an arraylist of ladders on the board
	*
	*@param ladders - the ladders to be set
	*/
	public void setLadders(ArrayList<Ladder> ladders)
	{
		log.info("Board class...............setLadders............start");
		this.ladders=ladders;
		log.info("Board class...............setLadders............end");
	}
	
	/**
	*This method will return an arraylist of ladders
	*
	*@return ladders
	*/
	public ArrayList<Ladder> getLadders()
	{
		log.info("Board class...............getLadders............start/end");
		return ladders;
	}
	
	/**
	*This method is used to set an array of cells on the board
	*
	*@param cells - the cells to be set
	*/
	public void setCells(Cell[][] cells)
	{
		log.info("Board class...............setCells............start");
		this.cells=cells;
		log.info("Board class...............setCells............end");
	}
	
	/**
	*This method will return an array of cells
	*
	*@return cells
	*/
	public Cell[][] getCells()
	{
		log.info("Board class...............getCells............start/end");
		return cells;
	}
	
	/**
	*Tie method is used to set the size of the board
	*
	*@param sizeOfBoard - the size of the board to set
	*/
	public void setSizeOfBoard(int sizeOfBoard)
	{
		log.info("Board class...............setSizeOfBoard............start");
		this.sizeOfBoard=sizeOfBoard;
		log.info("Board class...............setSizeOfBoard............end");
	}
	
	/**
	*This method will return the size of the board
	*
	*@return sizeOfBoard
	*/
	public int getSizeOfBoard()
	{
		log.info("Board class...............getSizeOfBoard............start/end");
		return sizeOfBoard;
	}
	
	public void createBoard(SnakeNLadder game,Board board)
	{
		
		Snake snake=new Snake();
		placeCells(board);
		placeSnakes(board);
		game.setBoard(board);
		
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
	
	public ArrayList<Integer> getListOfRandomNumbers()
	{
		ArrayList<Integer> numberList=new ArrayList<Integer>();
		int i=0;
		 do
		 {
			 int random=(int)(Math.random()*100);
			 if(!numberList.contains(random))
			 {
				if(random==0)
				{
					random=random+1;
				}
				numberList.add(random);
				i++;
			 }
		 }while(i<20);
		 return numberList;
	}
	
	public void showBoard(Board board,ArrayList<Player> playerList)
	{
		Cell[][] cellArray=board.getCells();
		ArrayList<Snake> snakeList=board.getSnakes();
		ArrayList<Ladder> ladderList=board.getLadders();
		for(int i=0;i<10;i++)
		{
			if(i%2==0)
			{
				for(int j=0;j<10;j++)
				{
					int cellNum=cellArray[i][j].getCellNumber();
					int p=checkPlayer(board,cellNum,playerList);
					int st=checkSnakeTail(board,cellNum);
					int sh=checkSnakeHead(board,cellNum);
					int lb=checkLadderBottom(board,cellNum);
					int lt=checkLadderTop(board,cellNum);
					if(p!=0)
					{
						
						System.out.print(" ");
						System.out.print("\t@P"+p);
					}
					
					else if(sh!=0)
					{
						System.out.print(" ");
						System.out.print("\t{SH"+sh+"}");
					}
					
					else if(st!=0)
					{
						System.out.print(" ");
						System.out.print("\t{ST"+st+"}");
					}
					
					else if(lb!=0)
					{
						System.out.print(" ");
						System.out.print("\t|LB"+lb+"|");
					}
					
					else if(lt!=0)
					{
						System.out.print(" ");
						System.out.print("\t|LT"+lt+"|");
					}
					else
					{
						System.out.print(" ");
						System.out.print("\t"+cellNum);
					}
				}
				System.out.println(" ");
				System.out.println(" ");
			}
			else
			{
				for(int j=0;j<10;j++)
				{
					int cellNum=cellArray[i][j].getCellNumber();
					int p=checkPlayer(board,cellNum,playerList);
					int sh=checkSnakeHead(board,cellNum);
					int st=checkSnakeTail(board,cellNum);
					int lb=checkLadderBottom(board,cellNum);
					int lt=checkLadderTop(board,cellNum);
					if(p!=0)
					{
						System.out.print(" ");
						System.out.print("\t@P"+p);
					}
					
					else if(sh!=0)
					{
						System.out.print(" ");
						System.out.print("\t{SH"+sh+"}");
					}
					
					else if(st!=0)
					{
						System.out.print(" ");
						System.out.print("\t{ST"+st+"}");
					}
					
					else if(lb!=0)
					{
						System.out.print(" ");
						System.out.print("\t|LB"+lb+"|");
					}
					
					else if(lt!=0)
					{
						System.out.print(" ");
						System.out.print("\t|LT"+lt+"|");
					}
					else
					{
						System.out.print(" ");
						System.out.print("\t"+cellNum);
					}
				}
				System.out.println(" ");
				System.out.println(" ");
			}
		}
	}
	
	public int checkLadderTop(Board board,int cellNum)
	{
		ArrayList<Ladder> ladderList=board.getLadders();
		for(int d=0;d<ladderList.size();d++)
		{
			int ladderTop=ladderList.get(d).getEndPoint();
			if(cellNum==ladderTop)
			{
				return (d+1);		
			}
		}
		return 0;
	}
	
	public int checkLadderBottom(Board board,int cellNum)
	{
		ArrayList<Ladder> ladderList=board.getLadders();
		for(int d=0;d<ladderList.size();d++)
		{
			int ladderBottom=ladderList.get(d).getStartingPoint();
			if(cellNum==ladderBottom)
			{
				return (d+1);
			}
		}
		return 0;
	}
	
	public int checkSnakeHead(Board board,int cellNum)
	{
		ArrayList<Snake> snakeList=board.getSnakes();
		for(int a=0;a<snakeList.size();a++)
		{
			int snakeHead=snakeList.get(a).getHeadPosition();
			if(cellNum==snakeHead)
			{
				return (a+1);	
			}
		}
		return 0;
	}
	
	public int checkSnakeTail(Board board,int cellNum)
	{
		ArrayList<Snake> snakeList=board.getSnakes();
		for(int a=0;a<snakeList.size();a++)
		{
			int snakeTail=snakeList.get(a).getTailPosition();
			if(cellNum==snakeTail)
			{
				return (a+1);	
			}
		}
		return 0;
	}
	
	public int checkPlayer(Board board,int cellNum,ArrayList<Player> playerList)
	{
		for(int n=0;n<playerList.size();n++)
		{
			int position=playerList.get(n).getPlayerPosition();						
			if(cellNum==position)
			{
				return (n+1);	
			}		
		}
		return 0;
	}
}