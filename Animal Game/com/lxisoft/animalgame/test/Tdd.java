package com.lxisoft.animalgame.test;
import com.lxisoft.animalgame.forest.Forest;
public class Tdd{
	public static void main(String[] args){
		Forest forest = new Forest();
		int rounds = 1;
		do{
		System.out.println("\nFights In Forest Round "+rounds+"\n");
		forest.startFight();
		rounds++;
		}while(forest.getAnimal().size()>1);
		forest.winner();	
	}
}