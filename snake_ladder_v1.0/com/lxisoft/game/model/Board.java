public class Board
{
	private ArrayList<Snake> snakes;
	private ArrayList<Ladder> ladders;
	private ArrayList<Cell> cells;
	private int sizeOfBoard;
	
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
	
	public void setCells(ArrayList<Cell> cells)
	{
		this.cells=cells;
	}
	
	public ArrayList<Cell> getCells()
	{
		return cells;
	}
	
	public void setSizeOfBoard(int sizeOfBoard)
	{
		this.sizeOfBoard=sizeOfBoard;
	}
	
	public int getSizeOfBoard()
	{
		return sizeOfBoard;
	}
}