package com.lxisoft.animalgame.forest;
import com.lxisoft.animalgame.animal.*;
import com.lxisoft.animalgame.animal.carnivores.*;
import com.lxisoft.animalgame.animal.herbivores.*;
import com.lxisoft.animalgame.animal.omnivore.*;
import java.util.ArrayList;
import java.io.*;
public class Forest{
	private int area = 40;
	String[][] grid = new String[40][40];
	private ArrayList<Animal> animals;
	private Hunter hunter;
	private int[] pitLocationX = new int[4];
	private int[] pitLocationY = new int[4];
	public void setAnimal(ArrayList<Animal> animals){
		this.animals = animals;
	}
	public ArrayList<Animal> getAnimal(){
		return animals;
	}
	public void setHunter(Hunter hunter){
		this.hunter = hunter;
	}
	public Hunter getHunter(){
		return hunter;
	}
	public Forest(){
		hunter = new Hunter();
		animals = new ArrayList<Animal>();
		for(int i=0;i<((int)(Math.random()*5)+5);i++){
			animals.add(new Tiger());
			animals.get(animals.size()-1).setName("Tiger "+(i+1));
		}
		for(int i=0;i<((int)(Math.random()*5)+5);i++){
			animals.add(new Lion());
			animals.get(animals.size()-1).setName("Lion "+(i+1));
		}
		for(int i=0;i<((int)(Math.random()*5)+5);i++){
			animals.add(new Bear());
			animals.get(animals.size()-1).setName("Bear "+(i+1));
		}
		for(int i=0;i<((int)(Math.random()*5)+5);i++){
			animals.add(new Deer());
			animals.get(animals.size()-1).setName("Deer "+(i+1));
		}
		for(int i=0;i<((int)(Math.random()*5)+5);i++){
			animals.add(new Rabbit());
			animals.get(animals.size()-1).setName("Rabbit "+(i+1));
		}
		for(int i=0;i<((int)(Math.random()*5)+5);i++){
			animals.add(new Zebra());
			animals.get(animals.size()-1).setName("Zebra "+(i+1));
		}
			animals.add(hunter);
			hunter.setName("Hunter");
			hunter.setSpeed(4);
			for(Animal test : animals){
				test.setLocationX((int)(Math.random()*area));
				test.setLocationY((int)(Math.random()*area));
				
				
			}
			for(int i=0;i<4;i++){
				pitLocationX[i] = (int)(Math.random()*50);
				pitLocationY[i] = (int)(Math.random()*50);
			}
			
	}
	public void startFight() throws IOException,InterruptedException{
		/*for(Animal test : animals){
			test.setSpeed((int)(Math.random()*6)+5);
			System.out.println(test.getName()+" "+test.getStrength()+" "+test.getLocationX()+" "+test.getLocationY()+" "+test.getSpeed());	
		}
		for(int i = 0;i<4;i++){
			System.out.println(pitLocationX[i]+" "+pitLocationY[i]);	
		}*/
		for(Animal test : animals){
		grid[test.getLocationX()][test.getLocationY()] = test.getName();
		}
		for(int i=0;i<40;i++){
				for(int j=0;j<40;j++){
					if(grid[i][j] == null){
						grid[i][j] = "   ";
					}
					System.out.print(grid[i][j]);
				}
				System.out.print("\n");
			}
		for(Animal test : animals){
		grid[test.getLocationX()][test.getLocationY()] = "   ";
		}
		for(int i = 0 ;i<animals.size();i++){
			int randomAnimal = (int)(Math.random()*animals.size());
				if(Math.abs(animals.get(randomAnimal).getLocationX()-animals.get(i).getLocationX())<10 && Math.abs(animals.get(i).getLocationY()-animals.get(randomAnimal).getLocationY())<10){
					if(animals.get(randomAnimal) instanceof Herbivore && animals.get(i) instanceof Herbivore){
						herbivoreFight(animals.get(randomAnimal),animals.get(i));
					}
					else if(animals.get(randomAnimal) instanceof Carnivore && animals.get(i) instanceof Carnivore){

						carnivoreFight(animals.get(randomAnimal),animals.get(i));
					}
					else if(animals.get(randomAnimal) instanceof Carnivore && animals.get(i) instanceof Herbivore){
						carnivoreHerbivoreFight(animals.get(randomAnimal),animals.get(i));
					}
					else if(animals.get(randomAnimal) instanceof Herbivore && animals.get(i) instanceof Carnivore){
						carnivoreHerbivoreFight(animals.get(i),animals.get(randomAnimal));
					}
					else if(animals.get(randomAnimal) instanceof Omnivore && animals.get(i) instanceof Carnivore){
						carnivoreOmnivoreFight(animals.get(i),animals.get(randomAnimal));
					}
					else if(animals.get(randomAnimal) instanceof Carnivore && animals.get(i) instanceof Omnivore){
						carnivoreOmnivoreFight(animals.get(randomAnimal),animals.get(i));
					}
					else if(animals.get(randomAnimal) instanceof Omnivore && animals.get(i) instanceof Herbivore){
						herbivoreOmnivoreFight(animals.get(i),animals.get(randomAnimal)); 
					}
					else if(animals.get(randomAnimal) instanceof Herbivore && animals.get(i) instanceof Omnivore){
						herbivoreOmnivoreFight(animals.get(randomAnimal),animals.get(i));
					} 
				}
			}
		if(area>5){
		area = area - 5;
		}
		locationSetter();
		Thread.sleep(1000);
		new ProcessBuilder("cmd ","/c"," cls").inheritIO().start().waitFor();
	}
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
	public void locationSetter(){
		int oldX;
		int newX;
		int oldY;
		int newY;
		for(int a=0;a<animals.size();a++){
		if(animals.get(a).getLocationX()<25){

			oldX = animals.get(a).getLocationX();
			newX = animals.get(a).getLocationX()+animals.get(a).getSpeed();
			animals.get(a).setLocationX(newX);
		}
		else{
			oldX = animals.get(a).getLocationX();
			newX = animals.get(a).getLocationX()-animals.get(a).getSpeed();
			animals.get(a).setLocationX(newX);
		}
		if(animals.get(a).getLocationY()<25){
			oldY = animals.get(a).getLocationY();
			newY = animals.get(a).getLocationY()+animals.get(a).getSpeed();
			animals.get(a).setLocationY(newY);
		}
		else{
			oldY = animals.get(a).getLocationY();
			newY = animals.get(a).getLocationY()-animals.get(a).getSpeed();
			animals.get(a).setLocationY(newY);
		}
		flumesLocater(oldX,oldY,newX,newY,a);
		}	
	}
	public void flumesLocater(int oldX,int oldY,int newX,int newY,int a){
			for(int i=0;i<4;i++){
				if((oldX<pitLocationX[i]&&newX>pitLocationX[i])&&(oldY<pitLocationY[i]&&newY>pitLocationY[i])){
					System.out.println(animals.get(a).getName()+" Died By Falling From Hieght");
					animals.remove(animals.get(a));
				}
			}
	}
	public void herbivoreFight(Animal animalOne,Animal animalTwo){
		
		if(animalOne != animalTwo)
		if(animalOne.getSpeed()<3){
			System.out.println(animalOne.getName()+" Died In Fire");
			animals.remove(animalOne);
		}
		else if(animalTwo.getSpeed()<3){
			System.out.println(animalTwo.getName()+" Died In Fire");
			animals.remove(animalTwo);
		}
		else{
			System.out.println(animalOne.getName()+" And "+animalTwo.getName()+" Won't Fight");
		}
		locationSetter();				
	}
	public void carnivoreFight(Animal animalOne,Animal animalTwo){
		int a=1;
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
				animals.remove(animalTwo);
				animalOne.setStrength(animalOne.getStrength()-5);
				animalOne.setHunger(animalOne.getHunger()+5);
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
				animals.remove(animalOne);
				animalTwo.setStrength(animalTwo.getStrength()-5);
				animalTwo.setHunger(animalTwo.getHunger()+5);
				}
				else{
					System.out.println(animalOne.getName()+" Run Away From "+animalTwo.getName());
					locationSetter(animalOne);
					locationSetter(animalTwo);
				}
			}
			//locationSetter();

	}
	public void carnivoreHerbivoreFight(Animal animalOne,Animal animalTwo){
		int a=1;
		if(((Herbivore)animalTwo).luck()>75 ){
			System.out.println(animalTwo.getName()+" Escaped From "+animalOne.getName());
			}
		//else if(animalTwo.getSpeed()>animalOne.getSpeed()){
		do{
			locationSetter(animalOne);
			locationSetter(animalTwo);
			a++;
		}while(a==5);
		if(animalOne.getLocationX()>=animalTwo.getLocationX()&&animalOne.getLocationY()>=animalTwo.getLocationY()){
			//System.out.println(animalTwo.getName()+" Run Away From "+animalOne.getName());
			if(animalOne.getHunger()>50){
				System.out.println(animalOne.getName()+animalOne.eat(animalTwo.getName()));
				//System.out.println(animalOne.sound());
				animalOne.setLocationX(animalTwo.getLocationX());
				animalOne.setLocationY(animalTwo.getLocationY());
				animals.remove(animalTwo);
				animalOne.setStrength(animalOne.getStrength()+5);
				animalOne.setHunger(animalOne.getHunger()-5);
			}
			else{
				System.out.println(animalOne.getName()+((Carnivore)animalOne).kills(animalTwo.getName()));
				//System.out.println(animalOne.sound());
				animalOne.setLocationX(animalTwo.getLocationX());
				animalOne.setLocationY(animalTwo.getLocationY());
				animals.remove(animalTwo);
				animalOne.setStrength(animalOne.getStrength()-5);
				animalOne.setHunger(animalOne.getHunger()+5);
				}
			}
		else{
			System.out.println(animalTwo.getName()+" Run Away From "+animalOne.getName());
			locationSetter(animalOne);
			locationSetter(animalTwo);
			}
		//locationSetter();
	}
	public void carnivoreOmnivoreFight(Animal animalOne,Animal animalTwo){
		int a=1;
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
			animals.remove(animalTwo);
			animalOne.setStrength(animalOne.getStrength()-5);
			animalOne.setHunger(animalOne.getHunger()+5);
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
			animals.remove(animalOne);
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
				animals.remove(animalTwo);
				animalOne.setStrength(animalOne.getStrength()-5);
				animalOne.setHunger(animalOne.getHunger()+5);
			}
		}
		else{
			System.out.println(animalTwo.getName()+" Run Away From "+animalOne.getName());
			locationSetter(animalOne);
			locationSetter(animalTwo);
		}

	}
		//locationSetter();
	public void herbivoreOmnivoreFight(Animal animalOne,Animal animalTwo){
		
		if(((Herbivore)animalOne).luck()>75 ){
			System.out.println(animalOne.getName()+" Escaped From "+animalTwo.getName());
		}
		else if(((Hunter)animalTwo).getBullets()!= 0){
			System.out.println(animalTwo.getName()+((Omnivore)animalTwo).hunt(animalOne.getName()));
			((Hunter)animalTwo).setBullets(((Hunter)animalTwo).getBullets()-1);
			//System.out.println(animalTwo.sound());
			animalTwo.setLocationX(animalOne.getLocationX());
			animalTwo.setLocationY(animalOne.getLocationY());
			animals.remove(animalOne);
		}
		else if(((Hunter)animalTwo).getBullets()== 0){
			System.out.println(animalTwo.getName()+" Leaves "+animalOne.getName());
		}
		//locationSetter();
	}
	public void winner(){
		for(Animal test : animals){
		System.out.println("\n"+"*****"+test.getName()+" Wins*****");
		}
	}
}