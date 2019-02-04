package com.lxisoft.animalgame.forest;
import com.lxisoft.animalgame.animal.omnivore.Hunter;
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
		int a=0;
		for(int i=1;i<6;i++){
			animals.add(new Tiger());
			animals.get(a).setName("Tiger "+i);
			animals.add(new Lion());
			animals.get(a+1).setName("Lion "+i);
			animals.add(new Bear());
			animals.get(a+2).setName("Bear "+i);
			animals.add(new Deer());
			animals.get(a+3).setName("Deer "+i);
			animals.add(new Rabbit());
			animals.get(a+4).setName("Rabbit "+i);
			animals.add(new Zebra());
			animals.get(a+5).setName("Zebra "+i);
			a=a+6;
		}
			animals.add(hunter);
			hunter.setName("Hunter");

	}
	public void startFight(){
			for(Animal test : animals){
				test.setLocationX(area);
				test.setLocationY(area);
			}
		for(int i = 0 ;i< animals.size();i++){
			int randomAnimal = (int)(Math.random()*animals.size());
				if(Math.abs(animals.get(randomAnimal).getLocationX()-animals.get(i).getLocationX())<10 && Math.abs(animals.get(i).getLocationY()-animals.get(randomAnimal).getLocationY())<10){
					if(animals.get(randomAnimal) instanceof Herbivore && animals.get(i) instanceof Herbivore){
						if(animals.get(randomAnimal) != animals.get(i)){
							System.out.println(animals.get(randomAnimal).getName()+" And "+animals.get(i).getName()+" Won't Fight");
						}
						}
					else if(animals.get(randomAnimal) instanceof Carnivore && animals.get(i) instanceof Carnivore){
						if(animals.get(randomAnimal) != animals.get(i))
						if(animals.get(randomAnimal).getStrength()>animals.get(i).getStrength()){
							System.out.println(((Carnivore)animals.get(randomAnimal)).kills(animals.get(randomAnimal).getName(),animals.get(i).getName()));
							animals.remove(i);
						}
						else{
							System.out.println(((Carnivore)animals.get(randomAnimal)).kills(animals.get(i).getName(),animals.get(randomAnimal).getName()));
							animals.remove(animals.get(randomAnimal));
						}
					}
					else if(animals.get(randomAnimal) instanceof Carnivore && animals.get(i) instanceof Herbivore){
						if(animals.get(randomAnimal).getStrength()>animals.get(i).getStrength())
						if(((Herbivore)animals.get(i)).luck()>75 ){
							System.out.println(animals.get(i).getName()+" Has Luck So Escaped From "+animals.get(randomAnimal).getName());
						}
						if(animals.get(randomAnimal).getHunger()>50){
							System.out.println(animals.get(randomAnimal).eat(animals.get(randomAnimal).getName(),animals.get(i).getName()));
							animals.remove(i);
						}
						else{
							System.out.println(((Carnivore)animals.get(randomAnimal)).kills(animals.get(randomAnimal).getName(),animals.get(i).getName()));
							animals.remove(i);
						}
					}
					else if(animals.get(randomAnimal) instanceof Herbivore && animals.get(i) instanceof Carnivore){
						if(animals.get(randomAnimal).getStrength()<animals.get(i).getStrength())
						if(((Herbivore)animals.get(randomAnimal)).luck()>75 ){
							System.out.println(animals.get(randomAnimal).getName()+" Escaped From "+animals.get(i).getName());
						}
						if(animals.get(i).getHunger()>50){
							System.out.println(animals.get(i).eat(animals.get(i).getName(),animals.get(randomAnimal).getName()));
							animals.remove(animals.get(randomAnimal));
						}
						else{
						System.out.println(((Carnivore)animals.get(i)).kills(animals.get(i).getName(),animals.get(randomAnimal).getName()));
						animals.remove(animals.get(randomAnimal));
						}
					}
					else if(animals.get(randomAnimal) instanceof Omnivore && animals.get(i) instanceof Carnivore){
						if(animals.get(i).getStrength()>90){
							System.out.println(((Carnivore)animals.get(i)).kills(animals.get(i).getName(),animals.get(randomAnimal).getName()));
							animals.remove(animals.get(randomAnimal));
						}
						else if(((Omnivore)animals.get(randomAnimal)).getBullets()!= 0){
							System.out.println(((Omnivore)animals.get(randomAnimal)).hunt(animals.get(randomAnimal).getName(),animals.get(i).getName()));
							((Omnivore)animals.get(randomAnimal)).setBullets(((Omnivore)animals.get(randomAnimal)).getBullets()-1);
							animals.remove(animals.get(i));
						}
						else if(((Omnivore)animals.get(randomAnimal)).getBullets()== 0){
							if(((Omnivore)animals.get(randomAnimal)).luck()>80){
								System.out.println(animals.get(randomAnimal).getName()+" Escaped From "+animals.get(i).getName());
							}
							else{
								System.out.println(((Carnivore)animals.get(i)).kills(animals.get(i).getName(),animals.get(randomAnimal).getName()));
								animals.remove(animals.get(randomAnimal));
							}
						}
					}
					else if(animals.get(randomAnimal) instanceof Carnivore && animals.get(i) instanceof Omnivore){
						if(animals.get(randomAnimal).getStrength()>90){
							System.out.println(((Carnivore)animals.get(randomAnimal)).kills(animals.get(randomAnimal).getName(),animals.get(i).getName()));
							animals.remove(animals.get(i));
						}
						else if(((Omnivore)animals.get(i)).getBullets()!= 0){
							System.out.println(((Omnivore)animals.get(i)).hunt(animals.get(i).getName(),animals.get(randomAnimal).getName()));
							((Omnivore)animals.get(i)).setBullets(((Omnivore)animals.get(i)).getBullets()-1);
							animals.remove(animals.get(randomAnimal));
						}
						else if(((Omnivore)animals.get(i)).getBullets()== 0){
							if(((Omnivore)animals.get(i)).luck()>80){
								System.out.println(((Omnivore)animals.get(i)).luck());
								System.out.println(animals.get(i).getName()+" Escaped From "+animals.get(randomAnimal).getName());
							}
							else{
								System.out.println(((Carnivore)animals.get(randomAnimal)).kills(animals.get(randomAnimal).getName(),animals.get(i).getName()));
								animals.remove(animals.get(i));
							}
						}
					}
					else if(animals.get(randomAnimal) instanceof Omnivore && animals.get(i) instanceof Herbivore){
						if(((Herbivore)animals.get(i)).luck()>75 ){
							System.out.println(animals.get(i).getName()+" Escaped From "+animals.get(randomAnimal).getName());
						}
						else if(((Omnivore)animals.get(randomAnimal)).getBullets()!= 0){
							System.out.println(((Omnivore)animals.get(randomAnimal)).hunt(animals.get(randomAnimal).getName(),animals.get(i).getName()));
							((Omnivore)animals.get(randomAnimal)).setBullets(((Omnivore)animals.get(randomAnimal)).getBullets()-1);
							animals.remove(animals.get(i));
						}
						else if(((Omnivore)animals.get(randomAnimal)).getBullets()== 0){
							System.out.println(animals.get(randomAnimal).getName()+" Leaves "+animals.get(i).getName());
						}
					}
					else if(animals.get(randomAnimal) instanceof Herbivore && animals.get(i) instanceof Omnivore){
						if(((Herbivore)animals.get(randomAnimal)).luck()>75 ){
							System.out.println(animals.get(randomAnimal).getName()+" Escaped From "+animals.get(i).getName());
						}
						else if(((Omnivore)animals.get(i)).getBullets()!= 0){
							System.out.println(((Omnivore)animals.get(i)).hunt(animals.get(i).getName(),animals.get(randomAnimal).getName()));
							((Omnivore)animals.get(i)).setBullets(((Omnivore)animals.get(i)).getBullets()-1);
							animals.remove(animals.get(randomAnimal));
						}
						else if(((Omnivore)animals.get(i)).getBullets()== 0){
							System.out.println(animals.get(i).getName()+" Leaves "+animals.get(randomAnimal).getName());
						}
					}
					}
			}
		if(area>10){
		area = area - 10;
		}
	}
	public void winner(){
		for(Animal test : animals){
		System.out.println("\n"+"*****"+test.getName()+" Wins*****");
		}
	}
}