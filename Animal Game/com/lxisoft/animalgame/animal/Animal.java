package com.lxisoft.animalgame.animal;
import com.lxisoft.animalgame.animal.carnivores.*;
import com.lxisoft.animalgame.animal.herbivores.*;
import com.lxisoft.animalgame.animal.omnivore.*;
public abstract class Animal{
	private int hunger = (int)(Math.random()*100);
	private int strength = (int)(Math.random()*100);
	private String name;
	private int locationX;
	private int locationY;
	private int speed;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setHunger(int hunger){
		this.hunger = hunger;
	}
	public int getHunger(){
		return hunger;
	}
	public void setLocationX(int locationX){
		this.locationX = locationX;
	}
	public int getLocationX(){
		return locationX;
	}
	public void setLocationY(int locationY){
		this.locationY = locationY;
	}
	public int getLocationY(){
		return locationY;
	}
	public void setStrength(int strength){
		this.strength = strength;
	}
	public int getStrength(){
		return strength;
	}
	public void setSpeed(int speed){
		this.speed = speed;
	}
	public int getSpeed(){
		return speed;
	}
	public abstract String eat(String animal);
	public abstract String sound();
	public void locationSetter(Animal animal){
		int oldX;
		int newX;
		int oldY;
		int newY;
		if(animal.locationX<25){

			oldX = animal.locationX;
			newX = animal.locationX+animal.speed;
			animal.locationX = newX;
		}
		else{
			oldX = animal.locationX;
			newX = animal.locationX-animal.speed;
			animal.locationX = newX;
		}
		if(animal.locationY<25){
			oldY = animal.locationY;
			newY = animal.locationY+animal.speed;
			animal.locationY = newY;
		}
		else{
			oldY = animal.locationY;
			newY = animal.locationY-animal.speed;
			animal.locationY = newY;
		}
	}
	public Animal fight(Animal animalOne,Animal animalTwo){
		Animal b = null;
		int a=1;
		if(animalOne instanceof Herbivore && animalTwo instanceof Herbivore){
		if(animalOne != animalTwo)
			if(animalOne.speed<3){
			System.out.println(animalOne.name+" Died In Fire");
			return animalOne;
		}
		else if(animalTwo.speed<3){
			System.out.println(animalTwo.name+" Died In Fire");
			return animalTwo;
		}
		else{
			System.out.println(animalOne.name+" And "+animalTwo.name+" Won't Fight");
		}
		}
		else if(animalOne instanceof Carnivore && animalTwo instanceof Carnivore){
			if(animalOne != animalTwo)
			if(animalOne.strength>animalTwo.strength){
				do{
					locationSetter(animalOne);
					locationSetter(animalTwo);
					a++;
				}while(a==5);
				if(animalOne.locationX>=animalTwo.locationX&&animalOne.locationY>=animalTwo.locationY){
				System.out.println(animalOne.name+((Carnivore)animalOne).kills(animalTwo.name));
				//System.out.println(animalOne.sound());
				locationChanger(animalOne,animalTwo);
				strengthChanger(animalOne);
				return animalTwo;
				}
				else{
					System.out.println(animalTwo.name+" Run Away From "+animalOne.name);
					locationSetter(animalOne);
					locationSetter(animalTwo);
				}
			}
			else{
				do{
					locationSetter(animalOne);
					locationSetter(animalTwo);
					a++;
				}while(a==5);
				if(animalOne.locationX>=animalTwo.locationX&&animalOne.locationY>=animalTwo.locationY){
				System.out.println(animalOne.name+((Carnivore)animalOne).kills(animalTwo.name));
				//System.out.println(animalTwo.sound());
				locationChanger(animalTwo,animalOne);
				strengthChanger(animalTwo);
				return animalOne;
				}
				else{
					System.out.println(animalOne.name+" Run Away From "+animalTwo.name);
					locationSetter(animalOne);
					locationSetter(animalTwo);
				}
			}
		}
		else if((animalOne instanceof Carnivore && animalTwo instanceof Herbivore)||(animalOne instanceof Herbivore && animalTwo instanceof Carnivore)){
			if(animalOne instanceof Herbivore && animalTwo instanceof Carnivore){
				Animal temp = animalOne;
				animalOne = animalTwo;
				animalTwo = temp;
			}
			if(((Herbivore)animalTwo).luck()>75 ){
			System.out.println(animalTwo.name+" Escaped From "+animalOne.name);
			}
		do{
			locationSetter(animalOne);
			locationSetter(animalTwo);
			a++;
		}while(a==5);
		if(animalOne.locationX>=animalTwo.locationX&&animalOne.locationY>=animalTwo.locationY){
			if(animalOne.hunger>50){
				System.out.println(animalOne.name+animalOne.eat(animalTwo.name));
				//System.out.println(animalOne.sound());
				locationChanger(animalOne,animalTwo);
				strengthChanger(animalOne);
				return animalTwo;
			}
			else{
				System.out.println(animalOne.name+((Carnivore)animalOne).kills(animalTwo.name));
				//System.out.println(animalOne.sound());
				locationChanger(animalOne,animalTwo);
				strengthChanger(animalOne);
				return animalTwo;
				}
			}
		else{
			System.out.println(animalTwo.name+" Run Away From "+animalOne.name);
			locationSetter(animalOne);
			locationSetter(animalTwo);
			}
		}
		else if((animalTwo instanceof Omnivore && animalOne instanceof Carnivore)||(animalTwo instanceof Carnivore && animalOne instanceof Omnivore)){
			if(animalTwo instanceof Carnivore && animalOne instanceof Omnivore){
				Animal temp = animalOne;
				animalOne = animalTwo;
				animalTwo = temp;
			}
			if(animalOne.strength>90){
			do{
			locationSetter(animalOne);
			locationSetter(animalTwo);
			a++;
		}while(a==5);
		if(animalOne.locationX>=animalTwo.locationX&&animalOne.locationY>=animalTwo.locationY){
			System.out.println(animalOne.name+((Carnivore)animalOne).kills(animalTwo.name));
			//System.out.println(animalOne.sound());
			locationChanger(animalTwo,animalOne);
			strengthChanger(animalTwo);
			return animalTwo;
		}
		else{
			System.out.println(animalTwo.name+" Run Away From "+animalOne.name);
			locationSetter(animalOne);
			locationSetter(animalTwo);
		}
		}
		else if(((Hunter)animalTwo).getBullets()!= 0){
			System.out.println(animalTwo.name+((Omnivore)animalTwo).hunt(animalOne.name));
			((Hunter)animalTwo).setBullets(((Hunter)animalTwo).getBullets()-1);
			//System.out.println(animalTwo.sound());
			locationChanger(animalTwo,animalOne);
			return animalOne;
		}
		else if(((Hunter)animalTwo).getBullets()== 0){
			if(((Omnivore)animalTwo).luck()>80){
				System.out.println(animalTwo.name+" Escaped From "+animalOne.name);
			}
				do{
					locationSetter(animalOne);
					locationSetter(animalTwo);
					a++;
				}while(a==5);
				if(animalOne.locationX>=animalTwo.locationX&&animalOne.locationY>=animalTwo.locationY){
				System.out.println(animalOne.name+((Carnivore)animalOne).kills(animalTwo.name));
				//System.out.println(animalOne.sound());
				locationChanger(animalOne,animalTwo);
				strengthChanger(animalOne);
				return animalTwo;
			}
		}
		else{
			System.out.println(animalTwo.name+" Run Away From "+animalOne.name);
			locationSetter(animalOne);
			locationSetter(animalTwo);
		}
		}
		else if((animalTwo instanceof Omnivore && animalOne instanceof Herbivore)||(animalTwo instanceof Herbivore && animalOne instanceof Omnivore)){
			if(animalTwo instanceof Herbivore && animalOne instanceof Omnivore){
				Animal temp = animalOne;
				animalOne = animalTwo;
				animalTwo = temp;
			}
			if(((Herbivore)animalOne).luck()>75 ){
			System.out.println(animalOne.name+" Escaped From "+animalTwo.name);
		}
		else if(((Hunter)animalTwo).getBullets()!= 0){
			System.out.println(animalTwo.name+((Omnivore)animalTwo).hunt(animalOne.name));
			((Hunter)animalTwo).setBullets(((Hunter)animalTwo).getBullets()-1);
			//System.out.println(animalTwo.sound());
			locationChanger(animalTwo,animalOne);
			return animalOne;
		}
		else if(((Hunter)animalTwo).getBullets()== 0){
			System.out.println(animalTwo.name+" Leaves "+animalOne.name);
			
		}
		}
		return b;
	}
	public void strengthChanger(Animal animal){
		animal.strength = animal.strength+5;
		animal.hunger = animal.hunger-5;
	}
	public void locationChanger(Animal animalOne,Animal animalTwo){
		animalOne.locationX = animalTwo.locationX;
		animalOne.locationY = animalTwo.locationY;
	}
}