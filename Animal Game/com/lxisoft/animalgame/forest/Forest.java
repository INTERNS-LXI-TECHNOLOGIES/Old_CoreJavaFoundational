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
		for(Animal test : animal){
			System.out.println(test.getName()+" "+test.getStrength()+" "+test.getX()+" "+test.getY());
		}
		System.out.println("\nFights In Forest\n");
		for(Animal test : animal){
			int randomAnimal = (int)(Math.random()*30);
				if(Math.abs(getAnimal().get(randomAnimal).getX()-test.getX())<10 && Math.abs(test.getY()-getAnimal().get(randomAnimal).getY())<10){
					if(getAnimal().get(randomAnimal) instanceof Herbivores && test instanceof Herbivores){
						if(getAnimal().get(randomAnimal) != test)
						System.out.println(getAnimal().get(randomAnimal).getName()+" And "+test.getName()+" Are Herbivores So They Won't fight");
					}
					else if(getAnimal().get(randomAnimal) instanceof Carnivores && test instanceof Carnivores){
						if(getAnimal().get(randomAnimal) != test)
						if(getAnimal().get(randomAnimal).getStrength()>test.getStrength()){
						System.out.println(getAnimal().get(randomAnimal).getName()+" Defeat "+test.getName());
						}
						else{
						System.out.println(test.getName()+" Defeat "+getAnimal().get(randomAnimal).getName());
						}
					}
					else if(getAnimal().get(randomAnimal) instanceof Carnivores && test instanceof Herbivores){
						if(getAnimal().get(randomAnimal).getStrength()>test.getStrength())
						if(((Herbivores)test).luck()>75 ){
							System.out.println(test.getName()+" Has Luck So Escaped From "+getAnimal().get(randomAnimal).getName());
						}
						else if(getAnimal().get(randomAnimal).getHunger()>50){
							System.out.println(getAnimal().get(randomAnimal).getName()+" Eats "+test.getName());
						}
						else{
						System.out.println(getAnimal().get(randomAnimal).getName()+" chased And Leaves "+test.getName());
						}
					}
					else if(getAnimal().get(randomAnimal) instanceof Herbivores && test instanceof Carnivores){
						if(getAnimal().get(randomAnimal).getStrength()<test.getStrength())
						if(((Herbivores)getAnimal().get(randomAnimal)).luck()>75 ){
							System.out.println(getAnimal().get(randomAnimal).getName()+" Has Luck So Escaped From "+test.getName());
						}
						else if(test.getHunger()>50){
							System.out.println(test.getName()+" Eats "+getAnimal().get(randomAnimal).getName());
						}
						else{
						System.out.println(test.getName()+" chased And Leaves "+getAnimal().get(randomAnimal).getName());
						}
					}
				}
		}
	}
}