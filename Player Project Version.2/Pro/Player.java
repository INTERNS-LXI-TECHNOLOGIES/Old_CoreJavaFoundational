public class Player
{
	private String name;
	private String nation;
	private String position;
	private int rating;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setNation(String nation)
	{
		this.nation=nation;
	}
	public void setPosition(String position)
	{
		this.position=position;
	}
	public void setRating(int rating)
	{
		this.rating=rating;
	}
	public String getName()
	{
		return name; 
	}
	public String getNation()
	{
		return nation;
	}
	public String getPosition()
	{
		return position;
	}
	public int getRating()
	{
		return rating;
	}
	public void printPlayerDetails()
	{
		System.out.println("NAME:"+this.name);
		System.out.println("NATION:"+this.nation);
		System.out.println("POSITION:"+this.position);
		System.out.println("RATING:"+this.rating);
	}
}