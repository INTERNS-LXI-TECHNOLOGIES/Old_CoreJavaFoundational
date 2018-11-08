import java.util.Random;
public class Match
{
	Club[] clubs = new Club[10];
	
	public void setClub(Club[] club)
	{
		this.clubs=club;
	}
	
	
	public Club[] getClub()
	{
		return clubs;
	}
	
	public void gamePlays()
	{
		for(int i=0;i<clubs.length;i++)
		{
		
			if(clubs[i] != null)
			{
				for(int j=0;j<clubs.length;j++)
				{
					if(clubs[j]!=null)
					{
						if(clubs[i].getName()!=clubs[j].getName())
						{
							Random r = new Random();
							int low = 1;
							int high = 5;
							int[] club_win = new int[10];
							
							
							club_win[0] = r.nextInt(high-low)+low;
							club_win[1] = r.nextInt(high-low)+low;
							
							System.out.print(clubs[i].getName()+" vs "+clubs[j].getName());
							System.out.println("(" + club_win[0]+":"+club_win[1]+")");
							
							
							
							if(club_win[0]>club_win[1])
							{
								System.out.println(clubs[i].getName()+" won ");
								clubs[i].setWon();
								clubs[i].setPoint(false);
								clubs[j].setLose();
							}	
							else if(club_win[0]<club_win[1])
							{
								System.out.println(clubs[j].getName()+" won ");
								clubs[j].setWon();
								clubs[j].setPoint(false);
								clubs[i].setLose();
							}
							else
							{
								System.out.println("Draw");
								clubs[i].setDraw();
								clubs[j].setDraw();
								clubs[i].setPoint(true);
								clubs[j].setPoint(true);
							}
							
							
							
								
						}
					}
				}
				
			}
			
		}
	}
	
	
	public void matchTable()
	{
		System.out.println("CLUB "+"W "+"D "+"L "+"PTS");
		for(int k=0;k<clubs.length;k++)
		{
			if(clubs[k]!=null)
			{
				
				System.out.print(clubs[k].getName()+"  "+clubs[k].getWon()+" "+clubs[k].getDraw()+" ");
				System.out.println(clubs[k].getLose()+" "+clubs[k].getPoint());
				
				
			}
			
		}
	}
	
	public void winner()
	{
		Club winner_club=clubs[0];
		int winner_point=this.clubs[0].getPoint();
		for(int i=1;i<clubs.length;i++)
		{
			if(clubs[i]!=null)
			{
				if(winner_point<clubs[i].getPoint())
				{
					winner_club=clubs[i];
					winner_point=clubs[i].getPoint();
				}
			}	
		}
			System.out.println(winner_club.getName()+" won title");
			
		
		
	}
}