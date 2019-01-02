package com.lxisoft.model;

import java.util.List;
import java.util.ArrayList;

public class Board {

	private List<Box> boxes;

	private List<Snake> snakes;

	private List<Ladder> ladders;

	private List<Player> players;

	public Board() {

		this.boxes = new ArrayList<>();
		this.snakes = new ArrayList<>();
		this.ladders = new ArrayList<>();
		this.players = new ArrayList<>();
	}


	// Getters
	
	public List<Snake> getSnakes() {

		return this.snakes;
	}

	public List<Box> getBoxes() {
		
		return this.boxes;
	}

	public List<Ladder> getLadders() {

		return this.ladders;
	}

	public List<Player> getPlayers() {

		return this.players;
	}


	// ADD Board memebers

	public void addSnake(Snake snake) {

		if(this.snakes.contains(snake) == false) {
			
			this.snakes.add(snake);
		}
	}

	public void addBox(Box box) {

		if(this.boxes.contains(box) == false) {

			this.boxes.add(box);
		}	
		
	}

	public void addLadder(Ladder ladder) {
		
		if(this.ladders.contains(ladder) == false) {
		
			this.ladders.add(ladder);
		}
	}

	public void addPlayer(Player player) {
		
		if(this.players.contains(player) == false) {
		
			this.players.add(player);
		}
	}

	// REMOVE Board Memebers

	public void removeSnake(Snake snake) {

		this.snakes.remove(snake);
	}

	public void removeBox(Box box) {

		this.boxes.remove(box);
	}

	public void removeLadder(Ladder ladder) {
	
		this.ladders.remove(ladder);
	}

	public void removePlayer(Player player) {
	
		if(!this.players.remove(player)) {

			System.out.println("Removed");
		}
	}

}
