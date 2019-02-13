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
				animalOne.locationX = animalTwo.locationX;
				animalOne.locationY = animalTwo.locationY;
				animalOne.strength = animalOne.strength-5;
				animalOne.hunger = animalOne.hunger+5;
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
				animalTwo.locationX = animalOne.locationX;
				animalTwo.locationY = animalOne.locationY;
				animalTwo.strength = animalTwo.strength-5;
				animalTwo.hunger = animalTwo.hunger+5;
				return animalOne;
				}
				else{
					System.out.println(animalOne.name+" Run Away From "+animalTwo.name);
					locationSetter(animalOne);
					locationSetter(animalTwo);
				}
			}
			return b;
		}
		else if(animalOne instanceof Carnivore && animalTwo instanceof Herbivore){
			if(((Herbivore)animalTwo).luck()>75 ){
			System.out.println(animalTwo.name+" Escaped From "+animalOne.name);
			}
		//else if(animalTwo.getSpeed()>animalOne.getSpeed()){
		do{
			locationSetter(animalOne);
			locationSetter(animalTwo);
			a++;
		}while(a==5);
		if(animalOne.locationX>=animalTwo.locationX&&animalOne.locationY>=animalTwo.locationY){
			//System.out.println(animalTwo.getName()+" Run Away From "+animalOne.getName());
			if(animalOne.hunger>50){
				System.out.println(animalOne.name+animalOne.eat(animalTwo.name));
				//System.out.println(animalOne.sound());
				animalOne.locationX = animalTwo.locationX;
				animalOne.locationY = animalTwo.locationY;
				animalOne.strength = animalOne.strength+5;
				animalOne.hunger = animalOne.hunger-5;
				return animalTwo;
			}
			else{
				System.out.println(animalOne.name+((Carnivore)animalOne).kills(animalTwo.name));
				//System.out.println(animalOne.sound());
				animalOne.locationX = animalTwo.locationX;
				animalOne.locationY = animalTwo.locationY;
				animalOne.strength = animalOne.strength-5;
				animalOne.hunger = animalOne.hunger+5;
				return animalTwo;
				}
			}
		else{
			System.out.println(animalTwo.name+" Run Away From "+animalOne.name);
			locationSetter(animalOne);
			locationSetter(animalTwo);
			}
			return b;
		}
		else if(animalOne instanceof Herbivore && animalTwo instanceof Carnivore){
			if(((Herbivore)animalOne).luck()>75 ){
			System.out.println(animalOne.name+" Escaped From "+animalTwo.name);
			}
		//else if(animalTwo.getSpeed()>animalOne.getSpeed()){
		do{
			locationSetter(animalTwo);
			locationSetter(animalOne);
			a++;
		}while(a==5);
		if(animalTwo.locationX>=animalOne.locationX&&animalTwo.locationY>=animalOne.locationY){
			//System.out.println(animalTwo.getName()+" Run Away From "+animalOne.getName());
			if(animalTwo.hunger>50){
				System.out.println(animalTwo.name+animalTwo.eat(animalOne.name));
				//System.out.println(animalOne.sound());
				animalTwo.locationX = animalOne.locationX;
				animalTwo.locationY = animalOne.locationY;
				animalTwo.strength = animalTwo.strength+5;
				animalTwo.hunger = animalTwo.hunger-5;
				return animalOne;
			}
			else{
				System.out.println(animalTwo.name+((Carnivore)animalTwo).kills(animalOne.name));
				//System.out.println(animalOne.sound());
				animalTwo.locationX = animalOne.locationX;
				animalTwo.locationY = animalOne.locationY;
				animalTwo.strength = animalTwo.strength+5;
				animalTwo.hunger = animalTwo.hunger-5;
				return animalOne;
				}
			}
		else{
			System.out.println(animalOne.name+" Run Away From "+animalTwo.name);
			locationSetter(animalOne);
			locationSetter(animalTwo);
			}
			return b;
		}
		else if(animalTwo instanceof Omnivore && animalOne instanceof Carnivore){
			if(animalOne.strength>90){
			do{
			locationSetter(animalOne);
			locationSetter(animalTwo);
			a++;
		}while(a==5);
		if(animalOne.locationX>=animalTwo.locationX&&animalOne.locationY>=animalTwo.locationY){
			System.out.println(animalOne.name+((Carnivore)animalOne).kills(animalTwo.name));
			//System.out.println(animalOne.sound());
			animalOne.locationX = animalTwo.locationX;
			animalOne.locationY = animalTwo.locationY;
			animalOne.strength = animalOne.strength-5;
			animalOne.hunger = animalOne.hunger+5;
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
			animalTwo.locationX = animalOne.locationX;
			animalTwo.locationY = animalOne.locationY;
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
				animalOne.locationX = animalTwo.locationX;
				animalOne.locationY = animalTwo.locationY;
				animalOne.strength = animalOne.strength-5;
				animalOne.hunger = animalOne.hunger+5;
				return animalTwo;
			}
		}
		else{
			System.out.println(animalTwo.name+" Run Away From "+animalOne.name);
			locationSetter(animalOne);
			locationSetter(animalTwo);
		}
		return b;

		}
		else if(animalTwo instanceof Carnivore && animalOne instanceof Omnivore){
			if(animalTwo.strength>90){
			do{
			locationSetter(animalTwo);
			locationSetter(animalOne);
			a++;
		}while(a==5);
		if(animalTwo.locationX>=animalOne.locationX&&animalTwo.locationY>=animalOne.locationY){
			System.out.println(animalTwo.name+((Carnivore)animalTwo).kills(animalOne.name));
			//System.out.println(animalOne.sound());
			animalTwo.locationX = animalOne.locationX;
			animalTwo.locationY = animalOne.locationY;
			animalTwo.strength = animalTwo.strength+5;
			animalTwo.hunger = animalTwo.hunger-5;
			return animalOne;
		}
		else{
			System.out.println(animalOne.name+" Run Away From "+animalTwo.name);
			locationSetter(animalOne);
			locationSetter(animalTwo);
		}
		}
		else if(((Hunter)animalOne).getBullets()!= 0){
			System.out.println(animalOne.name+((Omnivore)animalOne).hunt(animalTwo.name));
			((Hunter)animalOne).setBullets(((Hunter)animalOne).getBullets()-1);
			//System.out.println(animalTwo.sound());
			animalOne.locationX = animalTwo.locationX;
			animalOne.locationY = animalTwo.locationY;
			return animalTwo;
		}
		else if(((Hunter)animalOne).getBullets()== 0){
			if(((Omnivore)animalOne).luck()>80){
				System.out.println(animalOne.name+" Escaped From "+animalTwo.name);
			}
				do{
					locationSetter(animalOne);
					locationSetter(animalTwo);
					a++;
				}while(a==5);
				if(animalTwo.locationX>=animalOne.locationX&&animalTwo.locationY>=animalOne.locationY){
				System.out.println(animalTwo.name+((Carnivore)animalTwo).kills(animalOne.name));
				//System.out.println(animalOne.sound());
				animalTwo.locationX = animalOne.locationX;
				animalTwo.locationY = animalOne.locationY;
				animalTwo.strength = animalTwo.strength+5;
				animalTwo.hunger = animalTwo.hunger-5;
				return animalOne;
			}
		}
		else{
			System.out.println(animalOne.name+" Run Away From "+animalTwo.name);
			locationSetter(animalTwo);
			locationSetter(animalOne);
		}
		return b;
		}
		else if(animalTwo instanceof Omnivore && animalOne instanceof Herbivore){
			if(((Herbivore)animalOne).luck()>75 ){
			System.out.println(animalOne.name+" Escaped From "+animalTwo.name);
		}
		else if(((Hunter)animalTwo).getBullets()!= 0){
			System.out.println(animalTwo.name+((Omnivore)animalTwo).hunt(animalOne.name));
			((Hunter)animalTwo).setBullets(((Hunter)animalTwo).getBullets()-1);
			//System.out.println(animalTwo.sound());
			animalTwo.locationX = animalOne.locationX;
			animalTwo.locationY = animalOne.locationY;
			return animalOne;
		}
		else if(((Hunter)animalTwo).getBullets()== 0){
			System.out.println(animalTwo.name+" Leaves "+animalOne.name);
			
		}
		//locationSetter();
		return b;
		}
		else if(animalTwo instanceof Herbivore && animalOne instanceof Omnivore){
			if(((Herbivore)animalTwo).luck()>75 ){
			System.out.println(animalTwo.name+" Escaped From "+animalOne.name);
		}
		else if(((Hunter)animalOne).getBullets()!= 0){
			System.out.println(animalOne.name+((Omnivore)animalOne).hunt(animalTwo.name));
			((Hunter)animalOne).setBullets(((Hunter)animalOne).getBullets()-1);
			//System.out.println(animalTwo.sound());
			animalOne.locationX = animalTwo.locationX;
			animalOne.locationY = animalTwo.locationY;
			return animalTwo;
		}
		else if(((Hunter)animalOne).getBullets()== 0){
			System.out.println(animalTwo.name+" Leaves "+animalOne.name);
			
		}
		//locationSetter();
		}
		return b;
	}
}