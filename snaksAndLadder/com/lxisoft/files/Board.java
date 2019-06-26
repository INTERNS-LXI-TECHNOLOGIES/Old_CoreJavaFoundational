package com.lxisoft.files;
public class Board
{
	/*private  Cell cells;
	private  Snake snakes;
	private  Ladder ladders;
	public void setCells(Cell cells)
	{
		this.cells=cells;
	}
	public Cell getcells()
	{
		return cells;
	}
	public void setSnakes(Snake snakes)
	{
		this.snakes=snakes;
	}
	public Snake getSnakes()
	{
		return snakes;
	}
	public void setLadders(Ladder ladders)
	{
		this.snakes=snakes;
	}
	public Snake getSnakes()
	{
		return snake;
	}*/
	public void b()
	{  
	int a=100;
	int t = 0;
			for(int i=0;i<10;i++)
			{
				System.out.println("\n");
				System.out.print(a+"\t");
				for(int j=0;j<9;j++)
				{
					if(t%10==1){
						a++;
					}
					else{
						a--;
					}
				  System.out.print(a+"\t");
				}
					a=a-10;
					t=a;
			}
	}
			/*int i=100;
			boolean a = true;
		    while(i>=0)
			{
			
				if(i%10==1&&i%2==1||i%10==0&&i%2==0 && i!=100){
					System.out.print(i+"\t");
					i=i-10;
				}
				System.out.print(i+"\t");
				if(i%10==1){
				a=true;
				}
				if(i%10==0){
				a=false;
				}
				if(a){
					i++;
				}
				else{
					i--;
				}
				
				if(i%20==10||i%20==11){
					System.out.println("\n");
				}
			}*/
}