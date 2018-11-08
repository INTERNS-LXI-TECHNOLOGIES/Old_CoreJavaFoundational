public class Club
{
	private String name;
	private String manager;
	private int won;
	private int lose;
	private int draw;
	private int point_win;
	
	
	
	
	public void setPoint(boolean isDraw)
	{
		if(isDraw)
		{
		this.point_win=this.point_win+1;	
		}
		else
		{
		this.point_win=this.point_win+3;
		}
	}
	public int getPoint()
	{
		return point_win;
		
	}
	public void setDraw()
	{
		this.draw++;
	}
	public int getDraw()
	{
		return draw;
	}
	public void setLose()
	{
		this.lose++;
	}
	public int getLose()
	{
		return lose;
	}
	public void setWon()
	{
		this.won++;
	}
	public int getWon()
	{
		return won;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setManager(String manager)
	{
		this.manager=manager;
	}
	public String getName()
	{
		return name;
	}
	public String getManager()
	{
		return manager;
	}
	
	public void printDetails()
	{
		System.out.println("CLUB:"+this.name);
		System.out.println("MANAGER:"+this.manager);
	}
}