import java.util.Random;
public class Playerpool
{
	Player[] players = new Player[30];
	Club[] club = new Club[4];
	int playerCount;
	int clubCount;
	
	public void createClub(String club_name,String manager_name)
	{
		Club temp = new Club();
		temp.setClubName(club_name);
		temp.setManagerName(manager_name);
		
		this.club[clubCount]=temp;
		clubCount++;
		
	}
	public void printClubDetails()
	{
		for(int i=0;i<club.length;i++)
		{
			if(club[i] != null)
			{
				club[i].printClubDetails();
			}
		}
	}
	
	public void createPlayer(String name,String nation,String position,int rating)
	{
		Player temp=new Player();
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
			if(players[i] != null)
			{
				players[i].printDetails();
			}
		}
	}
			public void addPlayertoClub(Club club,Player player,int club_bid)
			{
				System.out.println(club.getClubName()+" won "+player.getName()+"  "+club_bid);
				
				
			}
			
	
	public void bidDetails()
	{
		for(int j=0;j<players.length;j++)
		{
			if(players[j] != null)
			{
				Random r = new Random();

				int high=100;
				int low=10;
				int[] club_bid=new int[4];
				
				club_bid[0]=r.nextInt(high-low)+low;
				club_bid[1]=r.nextInt(high-low)+low;
				club_bid[2]=r.nextInt(high-low)+low;
				club_bid[3]=r.nextInt(high-low)+low;
				
				
				if(club_bid[0]>club_bid[1]&&club_bid[0]>club_bid[2]&&club_bid[0]>club_bid[3])
				{
					this.addPlayertoClub(this.club[0],this.players[j],club_bid[0]);
					
				}
				else if(club_bid[1]>club_bid[0]&&club_bid[1]>club_bid[2]&&club_bid[1]>club_bid[3])
				{
					this.addPlayertoClub(this.club[1],this.players[j],club_bid[1]);
				}
				else if(club_bid[2]>club_bid[0]&&club_bid[2]>club_bid[1]&&club_bid[2]>club_bid[3])
				{
					this.addPlayertoClub(this.club[2],this.players[j],club_bid[2]);
				}
				else
				{
					this.addPlayertoClub(this.club[3],this.players[j],club_bid[3]);
				}
				
			}
		}
	}
	
	
	
}