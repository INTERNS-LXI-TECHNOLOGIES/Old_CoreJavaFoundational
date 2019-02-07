package com.lxisoft.animalgame.forest;
import com.lxisoft.animalgame.animal.*;
import com.lxisoft.animalgame.animal.carnivores.*;
import com.lxisoft.animalgame.animal.herbivores.*;
import com.lxisoft.animalgame.animal.omnivore.*;
import java.util.ArrayList;
public class Forest{
	private int area = 50;
	private ArrayList<Animal> animals;
	private Hunter hunter
	;
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
	}
	public void startFight(){
			for(Animal test : animals){
				test.setLocationX(area);
				test.setLocationY(area);
				test.setSpeed((int)(Math.random()*10));
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
	}
	public void herbivoreFight(Animal animalOne,Animal animalTwo){
		if(animalOne != animalTwo)
		if(animalOne.getSpeed()<30){
			System.out.println(animalOne.getName()+" Died In Fire");
			animals.remove(animalOne);
		}
		else if(animalTwo.getSpeed()<30){
			System.out.println(animalTwo.getName()+" Died In Fire");
			animals.remove(animalTwo);
		}
		else{
			System.out.println(animalOne.getName()+" And "+animalTwo.getName()+" Won't Fight");
		}				
	}
	public void carnivoreFight(Animal animalOne,Animal animalTwo){
		if(animalOne != animalTwo)
			if(animalTwo.getStrength()>animalTwo.getStrength()){
				System.out.println(animalOne.getName()+((Carnivore)animalOne).kills(animalTwo.getName()));
				//System.out.println(animalOne.sound());
				animals.remove(animalTwo);
			}
			else{
				System.out.println(animalTwo.getName()+((Carnivore)animalTwo).kills(animalOne.getName()));
				//System.out.println(animalTwo.sound());
				animals.remove(animalOne);
			}
	}

	public void carnivoreHerbivoreFight(Animal animalOne,Animal animalTwo){
		if(animalOne.getStrength()>animalTwo.getStrength())
		if(((Herbivore)animalTwo).luck()>75 ){
			System.out.println(animalTwo.getName()+"Escaped From "+animalOne.getName());
			}
		else if(animalTwo.getSpeed()>animalOne.getSpeed()){
			System.out.println(animalTwo.getName()+" Run Away From "+animalOne.getName());
		}
		if(animalOne.getHunger()>50){
			System.out.println(animalOne.getName()+animalOne.eat(animalTwo.getName()));
			//System.out.println(animalOne.sound());
			animals.remove(animalTwo);
		}
		else{
			System.out.println(animalOne.getName()+((Carnivore)animalOne).kills(animalTwo.getName()));
			//System.out.println(animalOne.sound());
			animals.remove(animalTwo);
			}
	}
	public void carnivoreOmnivoreFight(Animal animalOne,Animal animalTwo){
		if(animalOne.getStrength()>90){
			System.out.println(animalOne.getName()+((Carnivore)animalOne).kills(animalTwo.getName()));
			//System.out.println(animalOne.sound());
			animals.remove(animalTwo);
		}
		else if(animalOne.getSpeed()>50){
			System.out.println(animalOne.getName()+" Run Away From "+animalTwo.getName());
		}
		else if(((Hunter)animalTwo).getBullets()!= 0){
			System.out.println(animalTwo.getName()+((Omnivore)animalTwo).hunt(animalOne.getName()));
			((Hunter)animalTwo).setBullets(((Hunter)animalTwo).getBullets()-1);
			//System.out.println(animalTwo.sound());
			animals.remove(animalOne);
		}
		else if(((Hunter)animalTwo).getBullets()== 0){
			if(((Omnivore)animalTwo).luck()>80){
				System.out.println(animalTwo.getName()+" Escaped From "+animalOne.getName());
			}
			else{
				System.out.println(animalOne.getName()+((Carnivore)animalOne).kills(animalTwo.getName()));
				//System.out.println(animalOne.sound());
				animals.remove(animalTwo);
			}
		}
	}
	public void herbivoreOmnivoreFight(Animal animalOne,Animal animalTwo){
		if(((Herbivore)animalOne).luck()>75 ){
			System.out.println(animalOne.getName()+" Escaped From "+animalTwo.getName());
		}
		else if(animalOne.getSpeed()>50){
			System.out.println(animalOne.getName()+" Run Away From "+animalTwo.getName());
		}
		else if(((Hunter)animalTwo).getBullets()!= 0){
			System.out.println(animalTwo.getName()+((Omnivore)animalTwo).hunt(animalOne.getName()));
			((Hunter)animalTwo).setBullets(((Hunter)animalTwo).getBullets()-1);
			//System.out.println(animalTwo.sound());
			animals.remove(animalOne);
		}
		else if(((Hunter)animalTwo).getBullets()== 0){
			System.out.println(animalTwo.getName()+" Leaves "+animalOne.getName());
		}
	}
	public void winner(){
		for(Animal test : animals){
		System.out.println("\n"+"*****"+test.getName()+" Wins*****");
		}
	}
}