package com.lxisoft.Snakeladder;
import java.util.*;
import java.lang.*;
import java.io.IOException;

public class GameController
{
	
	DieceController dcr=new DieceController();
	
	BoardController bcr=new BoardController();

	Scanner scan=new Scanner(System.in);

	public void startGame()
	{
		bcr.initiateBoard();
		bcr.refreshBoard();
		int nwPos=0;
		int d;
		int q;
		try
		{
			System.out.println("Press 1 to Start Game");
			if(scan.nextInt()==1)
			{
				do
				{
					for(int i=0;i<bcr.pcr.players.size();i++)
					{					
						if(bcr.pcr.players.get(i).getPos()==0)
						{
							System.out.print("Chance for "+bcr.pcr.players.get(i).getName()+"  Press 1 for dice throw: ");
							if(scan.nextInt()==1)
							{
								if(dcr.rollDiece()==1)
								{
									System.out.println("!! Player "+bcr.pcr.players.get(i).getName()+" get in Board !!");
									d=1;
									bcr.moovePlayer(i,d);
								}
							}
						}
						else if(bcr.pcr.players.get(i).getPos() >0)
						{
							int z;
							System.out.print("Chance for "+bcr.pcr.players.get(i).getName()+"  Press 1 for dice throw: ");
							if(scan.nextInt()==1)
							{
								do
								{	
									z=0;
									d=dcr.rollDiece();
									System.out.println("Dice after roll :"+d);
									if((bcr.pcr.players.get(i).getPos()+d)<100)
									{
										bcr.moovePlayer(i,d);
									}
									else if((bcr.pcr.players.get(i).getPos()+d)>100)
										{}
										else
										{
											bcr.moovePlayer(i,d);
											System.out.println("Winner is "+bcr.pcr.players.get(i).getName());
											System.exit(0);
										}
										if(d==6)
										{
											System.out.println("!!!! You have an another chance !!!!");
											System.out.print("PRESS 1 FOR DICE THROW : ");
											z=scan.nextInt();
										}
								}while(z==1);
							}
						}	
					}
					System.out.print("Press 1 for next round: ");
					q=scan.nextInt();
					// try
					// {
					// 	clearScreen();
					// }
					// catch(Exception e){}
				}while(q==1);
			}
			else
			{
				throw new NotValidSelectionException("Wrong selection");
			}
		}
		catch(NotValidSelectionException ex)
		{
			//System.out.println("You entered "+ex.getMessage());
			ex.printStackTrace();
		}
	}
	public static void clearScreen() throws IOException, InterruptedException
	{  
    	new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	} 
}