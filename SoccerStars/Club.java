public class Club
{
	private String name;
	private String country;
	
	private Player[] players = new Player[11];
	int seat=0;
	public void setName(String name)
	{
		this.name=name;
	}
	public void setCountry(String country)
	{
		this.country=country;
	}
	public String getName()
	{
		return name;
	}
	public String getCountry()
	{
		return country;
	}
	public void clubPlayers()
	{
		for(int i=0;i<players.length;i++)
		{
			if(players[i] != null)
			{
				System.out.println("");
				System.out.println("Entered");
				System.out.println("");
				players[i].printDetails();
			}
		}
	}
	public void addPlayer(Player player)
	{
		if(seat<11)
		{	
		this.players[seat] = player;
		seat++;
		}
	}
	
}