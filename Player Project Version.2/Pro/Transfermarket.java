import java.util.Random;
public class Transfermarket
{
	Player[] players= new Player[20];
	Club[] clubs = new Club[5];
	int clubCount=0;
	int playerCount=0;
	
	public void createPlayer(String name,String nation,String position,int rating)
	{
		Player temp = new Player();
		temp.setName(name);
		temp.setNation(nation);
		temp.setPosition(position);
		temp.setRating(rating);
		
		this.players[playerCount]=temp;
		playerCount++;
	
	}
	public void printPlayerDetails()
	{
		for(int i=0;i<players.length;i++)
		{
			if(players[i]!=null)
			{
				players[i].printPlayerDetails();
			}
		}
	}
	
	public void createClub(String club_name,String man_name)
	{
		Club temp = new Club();
		temp.setClubName(club_name);
		temp.setManagerName(man_name);
		
		this.clubs[clubCount]=temp;
		clubCount++;
		
	}
	public void printClubDetails()
	{
		for(int i=0;i<clubs.length;i++)
		{
			if(clubs[i]!=null)
			{
				clubs[i].printClubDetails();
			}
		}
	}
	
	public void addPlayertoClub(Club club,Player player)
	{
		System.out.println(club.getClubName()+" won "+player.getName());
	}
	
	public void bidDetails()
	{
		for(int i=0;i<players.length;i++)
		{
			if(players[i]!=null)
			{
				Random r = new Random();
				
				int low =10000;
				int high=100000;
				int[] club_bid=new int[4];
				
				club_bid[0]=r.nextInt(high-low)+low;
				club_bid[1]=r.nextInt(high-low)+low;
				club_bid[2]=r.nextInt(high-low)+low;
				club_bid[3]=r.nextInt(high-low)+low;
				
				if(club_bid[0]>club_bid[1]&&club_bid[0]>club_bid[2]&&club_bid[0]>club_bid[3])
				{
				this.addPlayertoClub(clubs[0],players[i]);	
				}
				else if(club_bid[1]>club_bid[0]&&club_bid[1]>club_bid[2]&&club_bid[1]>club_bid[3])
				{
				this.addPlayertoClub(clubs[1],players[i]);		
				}
				else if(club_bid[2]>club_bid[0]&&club_bid[2]>club_bid[1]&&club_bid[2]>club_bid[3])
				{
					this.addPlayertoClub(clubs[2],players[i]);	
				
				}
				else
				{
					this.addPlayertoClub(clubs[3],players[i]);	
				
				}
				
			}
		}	
	}
}