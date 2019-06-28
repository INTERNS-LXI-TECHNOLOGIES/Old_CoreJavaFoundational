package com.lxisoft.Snakeladder;
//import com.lxisoft.Snakeladder.model.*;
import java.util.*;

public class GameController
{
	//PlayerModel playerModel=new PlayerModel();
	// PlayerController pController=new PlayerController();
	// //Board board=new Board();
	// pController.createPlayer();
	 DieceController dController=new DieceController();
	// Player player=new Player();

	BoardController bController=new BoardController();

	Scanner scan=new Scanner(System.in);

	public void startGame()
	{
		bController.createBoard();
		int nwPos=0;
		System.out.println("Press 1 to Start Game");
		{
			if(scan.nextInt()==1)
			{
				System.out.println("Enter I loop");
				
				 System.out.println("No of players: "+bController.pController.players.size());
				for(int i=0;i<bController.pController.players.size();i++)
				{
					do{
					System.out.println("Enter II loop");
					//System.out.println("Diece Value:"+dController.rollDiece());

					if(bController.pController.players.get(i).getPos()==0)
					{
						System.out.println("Enter loop for diece throw");
						if(dController.rollDiece()==1)
						{
							System.out.println("Execute after dice throw equal 1");
							nwPos=bController.pController.players.get(i).getPos()+1;
							System.out.println("1 Psition:"+nwPos);
							bController.pController.players.get(i).setPos(nwPos);
							//System.out.println(bController.pController.players.get(i).getPos());
						}
					}
					else if(bController.pController.players.get(i).getPos() >0)
					{
						nwPos=bController.pController.players.get(i).getPos()+dController.rollDiece();
						System.out.println("Next Position:"+nwPos);
						bController.pController.players.get(i).setPos(nwPos);
						//System.out.println("Next in brd: "+bController.pController.players.get(i).getPos());
					}
				}while(i<bController.pController.players.size());
				
				}
			}
		}
	}
}
/*	DieceController dieceController=new DieceController();
	public void posMov()
	{
		for(int i=0;i<100;i++)
		{
		int rnd=dieceController.rollDiece();
		System.out.println("Diece value:"+rnd);
		if(rnd==6)

		{
		pos=pos+rnd;
		for(int j=0;j<10;j++)
		{
			int rnd1=dieceController.rollDiece();
			pos=pos+rnd1;
		System.out.println("Position "+pos);
		}}
		else{}
		}
	}*/