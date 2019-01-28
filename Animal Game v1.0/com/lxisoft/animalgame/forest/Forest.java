package com.lxisoft.animalgame.forest;
import com.lxisoft.animalgame.animal.*;
import java.util.ArrayList;
public class Forest{
	private ArrayList<Animal> tiger;
	private ArrayList<Animal> lion;
	public void setTiger(ArrayList<Animal> tiger){
		this.tiger = tiger;
	}
	public ArrayList<Animal> getTiger(){
		return tiger;
	}
	public void setLion(ArrayList<Animal> lion){
		this.lion = lion;
	}
	public ArrayList<Animal> getLion(){
		return lion;
	}
	public Forest(){
		setTiger(new ArrayList<Animal>());
		setLion(new ArrayList<Animal>());
		for(int i=0;i<5;i++){
			getTiger().add(new Animal());
			getLion().add(new Animal());
			getTiger().get(i).setName("Tiger "+(i+1));
			getLion().get(i).setName("Lion "+(i+1));
		}
	}
	public void fight(){
		int randomAnimalOne = (int)(Math.random()*5);
		int randomAnimalTwo = (int)(Math.random()*5);
		int tigerStength = getTiger().get(randomAnimalOne).strength();
		int lionStrength = getLion().get(randomAnimalTwo).strength();
		System.out.println(getTiger().get(randomAnimalOne).getName()+" : "+tigerStength);
		System.out.println(getLion().get(randomAnimalTwo).getName()+" : "+lionStrength);
		if(tigerStength>lionStrength){
			System.out.println(getTiger().get(randomAnimalOne).getName()+" Wins");
		}
		else if(tigerStength<lionStrength){
			System.out.println(getLion().get(randomAnimalTwo).getName()+" Wins");
		}
	}
}