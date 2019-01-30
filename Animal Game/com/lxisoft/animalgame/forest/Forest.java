package com.lxisoft.animalgame.forest;
import com.lxisoft.animalgame.animal.*;
import com.lxisoft.animalgame.animal.carnivores.*;
import com.lxisoft.animalgame.animal.herbivores.*;
import java.util.ArrayList;
public class Forest{
	private ArrayList<Animal> animal;
	private Animal tiger;
	private Animal lion;
	public void setAnimal(ArrayList<Animal> animal){
		this.animal = animal;
	}
	public ArrayList<Animal> getAnimal(){
		return animal;
	}
	public Forest(){
		setAnimal(new ArrayList<Animal>());
		for(int i=0;i<30;i++){
			if(i<5){
			getAnimal().add(new Tiger());
			getAnimal().get(i).setName("Tiger "+(i+1));
			}
			else if(i>4&&i<10){
			getAnimal().add(new Lion());
			getAnimal().get(i).setName("Lion "+((i-5)+1));
			}
			else if(i>9&&i<15){
			getAnimal().add(new Bear());
			getAnimal().get(i).setName("Bear "+((i-10)+1));
			}
			else if(i>14&&i<20){
			getAnimal().add(new Deer());
			getAnimal().get(i).setName("Deer "+((i-15)+1));
			}
			else if(i>19&&i<25){
			getAnimal().add(new Rabbit());
			getAnimal().get(i).setName("Rabbit "+((i-20)+1));
			}
			else if(i>24&&i<30){
			getAnimal().add(new Zebra());
			getAnimal().get(i).setName("Zebra "+((i-25)+1));
			}
		}
	}
	public void fight(){
		int randomAnimalOne = (int)(Math.random()*30);
		int randomAnimalTwo = (int)(Math.random()*30);
		int animalOne = getAnimal().get(randomAnimalOne).strength();
		int animalTwo = getAnimal().get(randomAnimalTwo).strength();
		int animalOneXLocation = getAnimal().get(randomAnimalOne).x();
		int animalOneYLocation = getAnimal().get(randomAnimalOne).y();
		int animalTwoXLocation = getAnimal().get(randomAnimalTwo).x();
		int animalTwoYLocation = getAnimal().get(randomAnimalTwo).y();
		if(Math.abs(animalOneXLocation - animalTwoXLocation) <10 && Math.abs(animalOneYLocation - animalTwoYLocation) <10){
		System.out.println(getAnimal().get(randomAnimalOne).getName()+" : "+animalOne+" X : "+animalOneXLocation+" Y : "+animalOneYLocation);
		System.out.println(getAnimal().get(randomAnimalTwo).getName()+" : "+animalTwo+" X : "+animalTwoXLocation+" Y : "+animalTwoYLocation);
		if(getAnimal().get(randomAnimalOne) instanceof Herbivores && getAnimal().get(randomAnimalTwo) instanceof Herbivores){
			System.out.println(getAnimal().get(randomAnimalOne).getName()+" And "+getAnimal().get(randomAnimalTwo).getName()+" Are Herbivores So They Won't fight");
		}

		if(getAnimal().get(randomAnimalOne) instanceof Carnivores && getAnimal().get(randomAnimalTwo) instanceof Carnivores){
		if(animalOne>animalTwo){
			System.out.println(getAnimal().get(randomAnimalOne).getName()+" Wins");
		}
		else if(animalOne<animalTwo){
			System.out.println(getAnimal().get(randomAnimalTwo).getName()+" Wins");
		}
		}
		if(getAnimal().get(randomAnimalOne) instanceof Carnivores && getAnimal().get(randomAnimalTwo) instanceof Herbivores){
		if(((Herbivores)getAnimal().get(randomAnimalTwo)).luck()>75 ){
			System.out.println(getAnimal().get(randomAnimalTwo).getName()+" Has Luck");
		}
		else if(getAnimal().get(randomAnimalOne).getHunger()>50){
			System.out.println(getAnimal().get(randomAnimalOne).getName()+" Eats "+getAnimal().get(randomAnimalTwo).getName());
		}
		else{
			System.out.println(getAnimal().get(randomAnimalOne).getName()+" chased And Leaves "+getAnimal().get(randomAnimalTwo).getName());
		}
		}
		if(getAnimal().get(randomAnimalTwo) instanceof Carnivores && getAnimal().get(randomAnimalOne) instanceof Herbivores){
		if(((Herbivores)getAnimal().get(randomAnimalOne)).luck()>75 ){
			System.out.println(getAnimal().get(randomAnimalOne).getName()+" Has Luck");
		}
		else if(getAnimal().get(randomAnimalTwo).getHunger()>50){
			System.out.println(getAnimal().get(randomAnimalTwo).getName()+" Eats "+getAnimal().get(randomAnimalOne).getName());
		}
		else{
			System.out.println(getAnimal().get(randomAnimalTwo).getName()+" chased And Leaves "+getAnimal().get(randomAnimalOne).getName());
		}
		}
		}
		else {
			System.out.println("No Nearby Animals");
		}
	}
}