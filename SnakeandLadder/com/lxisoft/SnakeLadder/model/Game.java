package com.lxisoft.SnakeLadder.model;
import java.util.*;
public class Game{

private ArrayList<Token> token;
private ArrayList<Player> player;
private Board board;
private Diece diece;
	
	
	public ArrayList<Player> getPlayer() {
		return player;
	}
	public ArrayList<Token> getToken(){
		return token;
	}
	public Board getBoard(){
		return board;
	}
	public Diece getDiece(){
		return diece;
	}
	public void setBoard(Board board){
		this.board=board;
	}
	public void setDiece(Diece diece){
		this.diece=diece;
	}
	public void setPlayer(ArrayList<Player> player){
		this.player=player;
	}
	public void setToken(ArrayList<Token> token){
		this.token=token;
	}

}