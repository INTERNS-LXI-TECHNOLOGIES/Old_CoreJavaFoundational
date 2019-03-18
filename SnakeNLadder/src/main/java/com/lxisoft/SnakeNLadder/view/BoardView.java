package com.lxisoft.SnakeNLadder.view;
import com.lxisoft.SnakeNLadder.controller.*;
import com.lxisoft.SnakeNLadder.model.*;
import java.util.*;
public class BoardView{
	PlayerController pc = new PlayerController();
	StartGameController sgc = new StartGameController();
	public void boardView(List<PlayerModel> player){
		int a = 100;
		int b = 1;
		int c = 2;
		/*for(int i=0;i<sgc.snakes.size();i++){
			System.out.print(sgc.snakes.get(i).start+" ");
		}
		System.out.println("");
		for(int i=0;i<sgc.snakes.size();i++){
			System.out.print(sgc.snakes.get(i).end+" ");
		}*/
		for(int i=1;i<=10;i++){
			int x = 0;
			int xsnake = 0;
			int xladder = 0;
			for(int k=0;k<pc.players.size();k++){
				if(pc.players.get(k).getPos()==a){
					for(int o=0;o<sgc.snakes.size();o++){
						if(sgc.snakes.get(o).start==a||sgc.snakes.get(o).end==a){
							System.out.print("	"+pc.players.get(k).getColor()+"{"+a+"}"+(o+1)+" \033[0m");
							x++;
							xsnake++;
						}
					}
					for(int p=0;p<sgc.ladders.size();p++){
						if(sgc.ladders.get(p).start==a||sgc.ladders.get(p).end==a){
							System.out.print("	"+pc.players.get(k).getColor()+"["+a+"]"+(p+1)+" \033[0m");
							x++;
							xladder++;
						}
					}
					if(xsnake==0&&xladder==0){
						System.out.print("	"+pc.players.get(k).getColor()+a+" \033[0m");
						x++;
					}
				}
				else if(k==pc.players.size()-1&&x==0){
					for(int o=0;o<sgc.snakes.size();o++){
						if(sgc.snakes.get(o).start==a||sgc.snakes.get(o).end==a){
							System.out.print("	{"+a+"}"+(o+1));
							xsnake++;
						}
					}
					for(int p=0;p<sgc.ladders.size();p++){
						if(sgc.ladders.get(p).start==a||sgc.ladders.get(p).end==a){
							System.out.print("	["+a+"]"+(p+1));
							xladder++;
						}
					}
					if(xsnake==0&&xladder==0){
						System.out.print("	"+a);
					}
				}
			}
			if(i==b){
				a--;
				b=b+2;
			}
			else if(i==c){
				a++;
				c=c+2;
			}
			for(int j=1;j<=9;j++){
				int y = 0;
				int ysnake = 0;
				int yladder = 0;
				for(int k=0;k<pc.players.size();k++){
				if(pc.players.get(k).getPos()==a){
					for(int o=0;o<sgc.snakes.size();o++){
						if(sgc.snakes.get(o).start==a||sgc.snakes.get(o).end==a){
							System.out.print("	"+pc.players.get(k).getColor()+"{"+a+"}"+(o+1)+" \033[0m");
							y++;
							ysnake++;
						}
					}
					for(int p=0;p<sgc.ladders.size();p++){
						if(sgc.ladders.get(p).start==a||sgc.ladders.get(p).end==a){
							System.out.print("	"+pc.players.get(k).getColor()+"["+a+"]"+(p+1)+" \033[0m");
							y++;
							yladder++;
						}
					}
					if(ysnake==0&&yladder==0){
						System.out.print("	"+pc.players.get(k).getColor()+a+" \033[0m");
						y++;
					}
				}
				else if(k==pc.players.size()-1&&y==0){
					for(int o=0;o<sgc.snakes.size();o++){
						if(sgc.snakes.get(o).start==a||sgc.snakes.get(o).end==a){
							System.out.print("	{"+a+"}"+(o+1));
							ysnake++;
						}
					}
					for(int p=0;p<sgc.ladders.size();p++){
						if(sgc.ladders.get(p).start==a||sgc.ladders.get(p).end==a){
							System.out.print("	["+a+"]"+(p+1));
							yladder++;
						}
					}
					if(ysnake==0&&yladder==0){
						System.out.print("	"+a);
					}
				}
			}
				if(j<9){
					if((i+2)==b){
						a--;
					}
					else if((i+2)==c){
						a++;
					}
				}
			}
			System.out.println("\n\n");
			a=a-10;
		}
	}
	public int rollDiceView(){
		return DiceController.rollDice();
	}
	public void checking(){

	}
}