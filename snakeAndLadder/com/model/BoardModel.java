package com.model;

import java.util.ArrayList;

public class BoardModel
{

private ArrayList<Cell> cells;
private ArrayList<SnakeModel>snakes;
private ArrayList <Ladder>ladders;
private ArrayList<Player>players;
private ArrayList<Dice>dice;

public ArrayList<SnakeModel> getSnakes() {
	return snakes;
}
public void setSnakes(ArrayList<SnakeModel>snakes) {
	this.snakes = snakes;
}
public ArrayList<Cell> getCells() {
	return cells;
}
public void setCells(ArrayList<Cell> cells) {
	this.cells = cells;
}
public ArrayList <Ladder> getLadders() {
	return ladders;
}
public void setLadders(ArrayList <Ladder> ladders) {
	this.ladders = ladders;
}

public ArrayList<Player> getPlayers() {
	return players;
}
public void setPlayers(ArrayList<Player> players) {
	this.players = players;
}
public ArrayList<Dice> getDice() {
	return dice;
}
public void setDice(ArrayList<Dice> dice) {
	this.dice = dice;
}

}
