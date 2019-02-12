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
	public Animal b;
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
		if(animal.getLocationX()<25){

			oldX = animal.getLocationX();
			newX = animal.getLocationX()+animal.getSpeed();
			animal.setLocationX(newX);
		}
		else{
			oldX = animal.getLocationX();
			newX = animal.getLocationX()-animal.getSpeed();
			animal.setLocationX(newX);
		}
		if(animal.getLocationY()<25){
			oldY = animal.getLocationY();
			newY = animal.getLocationY()+animal.getSpeed();
			animal.setLocationY(newY);
		}
		else{
			oldY = animal.getLocationY();
			newY = animal.getLocationY()-animal.getSpeed();
			animal.setLocationY(newY);
		}
	}
	public Animal fight(Animal animalOne,Animal animalTwo){
		int a=1;
		if(animalOne instanceof Herbivore && animalTwo instanceof Herbivore){
			if(animalOne != animalTwo)
			if(animalOne.getSpeed()<3){
			System.out.println(animalOne.getName()+" Died In Fire");
			return animalOne;
		}
		else if(animalTwo.getSpeed()<3){
			System.out.println(animalTwo.getName()+" Died In Fire");
			return animalTwo;
		}
		else{
			System.out.println(animalOne.getName()+" And "+animalTwo.getName()+" Won't Fight");
		}
		return b;
		}
		else if(animalOne instanceof Carnivore && animalTwo instanceof Carnivore){
			if(animalOne != animalTwo)
			if(animalOne.getStrength()>animalTwo.getStrength()){
				do{
					locationSetter(animalOne);
					locationSetter(animalTwo);
					a++;
				}while(a==5);
				if(animalOne.getLocationX()>=animalTwo.getLocationX()&&animalOne.getLocationY()>=animalTwo.getLocationY()){
				System.out.println(animalOne.getName()+((Carnivore)animalOne).kills(animalTwo.getName()));
				//System.out.println(animalOne.sound());
				animalOne.setLocationX(animalTwo.getLocationX());
				animalOne.setLocationY(animalTwo.getLocationY());
				animalOne.strength =animalOne.strength-5;
				animalOne.setHunger(animalOne.getHunger()+5);
				return animalTwo;
				}
				else{
					System.out.println(animalTwo.getName()+" Run Away From "+animalOne.getName());
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
				if(animalOne.getLocationX()>=animalTwo.getLocationX()&&animalOne.getLocationY()>=animalTwo.getLocationY()){
				System.out.println(animalOne.getName()+((Carnivore)animalOne).kills(animalTwo.getName()));
				System.out.println(animalTwo.getName()+((Carnivore)animalTwo).kills(animalOne.getName()));
				//System.out.println(animalTwo.sound());
				animalTwo.setLocationX(animalOne.getLocationX());
				animalTwo.setLocationY(animalOne.getLocationY());
				animalTwo.setStrength(animalTwo.getStrength()-5);
				animalTwo.setHunger(animalTwo.getHunger()+5);
				return animalOne;
				}
				else{
					System.out.println(animalOne.getName()+" Run Away From "+animalTwo.getName());
					locationSetter(animalOne);
					locationSetter(animalTwo);
				}
			}
			return b;
		}
		else if(animalOne instanceof Carnivore && animalTwo instanceof Herbivore){
			if(((Herbivore)animalTwo).luck()>75 ){
			System.out.println(animalTwo.getName()+" Escaped From "+animalOne.getName());
			}
		do{
			locationSetter(animalOne);
			locationSetter(animalTwo);
			a++;
		}while(a==5);
		if(animalOne.getLocationX()>=animalTwo.getLocationX()&&animalOne.getLocationY()>=animalTwo.getLocationY()){
			if(animalOne.getHunger()>50){
				System.out.println(animalOne.getName()+animalOne.eat(animalTwo.getName()));
				//System.out.println(animalOne.sound());
				animalOne.setLocationX(animalTwo.getLocationX());
				animalOne.setLocationY(animalTwo.getLocationY());
				animalOne.setStrength(animalOne.getStrength()+5);
				animalOne.setHunger(animalOne.getHunger()-5);
				return animalTwo;
			}
			else{
				System.out.println(animalOne.getName()+((Carnivore)animalOne).kills(animalTwo.getName()));
				//System.out.println(animalOne.sound());
				animalOne.setLocationX(animalTwo.getLocationX());
				animalOne.setLocationY(animalTwo.getLocationY());
				animalOne.setStrength(animalOne.getStrength()-5);
				animalOne.setHunger(animalOne.getHunger()+5);
				return animalTwo;
				}
			}
		else{
			System.out.println(animalTwo.getName()+" Run Away From "+animalOne.getName());
			locationSetter(animalOne);
			locationSetter(animalTwo);
			}
			return b;
		}
		else if(animalOne instanceof Herbivore && animalTwo instanceof Carnivore){
			if(((Herbivore)animalOne).luck()>75 ){
			System.out.println(animalOne.getName()+" Escaped From "+animalTwo.getName());
			}
		do{
			locationSetter(animalTwo);
			locationSetter(animalOne);
			a++;
		}while(a==5);
		if(animalTwo.getLocationX()>=animalOne.getLocationX()&&animalTwo.getLocationY()>=animalOne.getLocationY()){
			if(animalTwo.getHunger()>50){
				System.out.println(animalTwo.getName()+animalTwo.eat(animalOne.getName()));
				//System.out.println(animalOne.sound());
				animalTwo.setLocationX(animalOne.getLocationX());
				animalTwo.setLocationY(animalOne.getLocationY());
				animalTwo.setStrength(animalTwo.getStrength()+5);
				animalTwo.setHunger(animalTwo.getHunger()-5);
				return animalOne;
			}
			else{
				System.out.println(animalTwo.getName()+((Carnivore)animalTwo).kills(animalOne.getName()));
				//System.out.println(animalOne.sound());
				animalTwo.setLocationX(animalOne.getLocationX());
				animalTwo.setLocationY(animalOne.getLocationY());
				animalTwo.setStrength(animalTwo.getStrength()+5);
				animalTwo.setHunger(animalTwo.getHunger()-5);
				return animalOne;
				}
			}
		else{
			System.out.println(animalOne.getName()+" Run Away From "+animalTwo.getName());
			locationSetter(animalOne);
			locationSetter(animalTwo);
			}
			return b;
		}
		else if(animalTwo instanceof Omnivore && animalOne instanceof Carnivore){
			if(animalOne.getStrength()>90){
			do{
			locationSetter(animalOne);
			locationSetter(animalTwo);
			a++;
		}while(a==5);
		if(animalOne.getLocationX()>=animalTwo.getLocationX()&&animalOne.getLocationY()>=animalTwo.getLocationY()){
			System.out.println(animalOne.getName()+((Carnivore)animalOne).kills(animalTwo.getName()));
			//System.out.println(animalOne.sound());
			animalOne.setLocationX(animalTwo.getLocationX());
			animalOne.setLocationY(animalTwo.getLocationY());
			animalOne.setStrength(animalOne.getStrength()-5);
			animalOne.setHunger(animalOne.getHunger()+5);
			return animalTwo;
		}
		else{
			System.out.println(animalTwo.getName()+" Run Away From "+animalOne.getName());
			locationSetter(animalOne);
			locationSetter(animalTwo);
		}
		}
		else if(((Hunter)animalTwo).getBullets()!= 0){
			System.out.println(animalTwo.getName()+((Omnivore)animalTwo).hunt(animalOne.getName()));
			((Hunter)animalTwo).setBullets(((Hunter)animalTwo).getBullets()-1);
			//System.out.println(animalTwo.sound());
			animalTwo.setLocationX(animalOne.getLocationX());
			animalTwo.setLocationY(animalOne.getLocationY());
			return animalOne;
		}
		else if(((Hunter)animalTwo).getBullets()== 0){
			if(((Omnivore)animalTwo).luck()>80){
				System.out.println(animalTwo.getName()+" Escaped From "+animalOne.getName());
			}
				do{
					locationSetter(animalOne);
					locationSetter(animalTwo);
					a++;
				}while(a==5);
				if(animalOne.getLocationX()>=animalTwo.getLocationX()&&animalOne.getLocationY()>=animalTwo.getLocationY()){
				System.out.println(animalOne.getName()+((Carnivore)animalOne).kills(animalTwo.getName()));
				//System.out.println(animalOne.sound());
				animalOne.setLocationX(animalTwo.getLocationX());
				animalOne.setLocationY(animalTwo.getLocationY());
				animalOne.setStrength(animalOne.getStrength()-5);
				animalOne.setHunger(animalOne.getHunger()+5);
				return animalTwo;
			}
		}
		else{
			System.out.println(animalTwo.getName()+" Run Away From "+animalOne.getName());
			locationSetter(animalOne);
			locationSetter(animalTwo);
		}
		return b;

		}
		else if(animalTwo instanceof Carnivore && animalOne instanceof Omnivore){
			if(animalTwo.getStrength()>90){
			do{
			locationSetter(animalTwo);
			locationSetter(animalOne);
			a++;
		}while(a==5);
		if(animalTwo.getLocationX()>=animalOne.getLocationX()&&animalTwo.getLocationY()>=animalOne.getLocationY()){
			System.out.println(animalTwo.getName()+((Carnivore)animalTwo).kills(animalOne.getName()));
			//System.out.println(animalOne.sound());
			animalTwo.setLocationX(animalOne.getLocationX());
			animalTwo.setLocationY(animalOne.getLocationY());
			animalTwo.setStrength(animalTwo.getStrength()-5);
			animalTwo.setHunger(animalTwo.getHunger()+5);
			return animalOne;
		}
		else{
			System.out.println(animalOne.getName()+" Run Away From "+animalTwo.getName());
			locationSetter(animalOne);
			locationSetter(animalTwo);
		}
		}
		else if(((Hunter)animalOne).getBullets()!= 0){
			System.out.println(animalOne.getName()+((Omnivore)animalOne).hunt(animalTwo.getName()));
			((Hunter)animalOne).setBullets(((Hunter)animalOne).getBullets()-1);
			//System.out.println(animalTwo.sound());
			animalOne.setLocationX(animalTwo.getLocationX());
			animalOne.setLocationY(animalTwo.getLocationY());
			return animalTwo;
		}
		else if(((Hunter)animalOne).getBullets()== 0){
			if(((Omnivore)animalOne).luck()>80){
				System.out.println(animalOne.getName()+" Escaped From "+animalTwo.getName());
			}
				do{
					locationSetter(animalOne);
					locationSetter(animalTwo);
					a++;
				}while(a==5);
				if(animalTwo.getLocationX()>=animalOne.getLocationX()&&animalTwo.getLocationY()>=animalOne.getLocationY()){
				System.out.println(animalTwo.getName()+((Carnivore)animalTwo).kills(animalOne.getName()));
				//System.out.println(animalOne.sound());
				animalTwo.setLocationX(animalOne.getLocationX());
				animalTwo.setLocationY(animalOne.getLocationY());
				animalTwo.setStrength(animalTwo.getStrength()-5);
				animalTwo.setHunger(animalTwo.getHunger()+5);
				return animalOne;
			}
		}
		else{
			System.out.println(animalOne.getName()+" Run Away From "+animalTwo.getName());
			locationSetter(animalTwo);
			locationSetter(animalOne);
		}
		return b;
		}
		else if(animalTwo instanceof Omnivore && animalOne instanceof Herbivore){
			if(((Herbivore)animalOne).luck()>75 ){
			System.out.println(animalOne.getName()+" Escaped From "+animalTwo.getName());
		}
		else if(((Hunter)animalTwo).getBullets()!= 0){
			System.out.println(animalTwo.getName()+((Omnivore)animalTwo).hunt(animalOne.getName()));
			((Hunter)animalTwo).setBullets(((Hunter)animalTwo).getBullets()-1);
			//System.out.println(animalTwo.sound());
			animalTwo.setLocationX(animalOne.getLocationX());
			animalTwo.setLocationY(animalOne.getLocationY());
			return animalOne;
		}
		else if(((Hunter)animalTwo).getBullets()== 0){
			System.out.println(animalTwo.getName()+" Leaves "+animalOne.getName());
			
		}
		//locationSetter();
		return b;
		}
		else if(animalTwo instanceof Herbivore && animalOne instanceof Omnivore){
			if(((Herbivore)animalTwo).luck()>75 ){
			System.out.println(animalTwo.getName()+" Escaped From "+animalOne.getName());
		}
		else if(((Hunter)animalOne).getBullets()!= 0){
			System.out.println(animalOne.getName()+((Omnivore)animalOne).hunt(animalTwo.getName()));
			((Hunter)animalOne).setBullets(((Hunter)animalOne).getBullets()-1);
			//System.out.println(animalTwo.sound());
			animalOne.setLocationX(animalTwo.getLocationX());
			animalOne.setLocationY(animalTwo.getLocationY());
			return animalTwo;
		}
		else if(((Hunter)animalTwo).getBullets()== 0){
			System.out.println(animalTwo.getName()+" Leaves "+animalOne.getName());
			
		}
		//locationSetter();
		
		}
		return b;
	}
}