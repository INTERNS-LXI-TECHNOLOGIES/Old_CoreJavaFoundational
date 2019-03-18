package com.lxisoft.SnakeNLadder.controller;
import com.lxisoft.SnakeNLadder.model.*;
import java.util.*;
public class PlayerController{
	public static List<PlayerModel> players = new ArrayList<PlayerModel>();
	public void playerCreation(int a){
		for(int i=0;i<a;i++){
			players.add(new PlayerModel());
		}
	}
	public void setPlayerDetails(int pos,String name,String color){
		players.get(pos).setName(name);
		players.get(pos).setColor(color);
	}
	public enum Color{
		RED("\033[31;1m"),GREEN("\033[32;1m"),YELLOW("\033[33;1m"),BLUE("\033[34;1m");
		String colorCode;
		private Color(String colorCode){
			this.colorCode = colorCode;
		}
		public String getColor(){
			return colorCode;
		}
	}
	public final static ArrayList<Color> colors = new ArrayList<Color>(Arrays.asList(Color.values()));
	public static ArrayList<Color> getColors(){
		return colors;
	}
}