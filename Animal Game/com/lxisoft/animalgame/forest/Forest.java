package com.lxisoft.animalgame.forest;
import com.lxisoft.animalgame.hunter.Hunter;
import com.lxisoft.animalgame.animal.*;
import com.lxisoft.animalgame.animal.carnivores.*;
import com.lxisoft.animalgame.animal.herbivores.*;
import java.util.ArrayList;
public class Forest{
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
		setHunter(new Hunter());
		setAnimal(new ArrayList<Animal>());
		int a=0;
		for(int i=1;i<6;i++){
			getAnimal().add(new Tiger());
			getAnimal().get(a).setName("Tiger "+i);
			getAnimal().add(new Lion());
			getAnimal().get(a+1).setName("Lion "+i);
			getAnimal().add(new Bear());
			getAnimal().get(a+2).setName("Bear "+i);
			getAnimal().add(new Deer());
			getAnimal().get(a+3).setName("Deer "+i);
			getAnimal().add(new Rabbit());
			getAnimal().get(a+4).setName("Rabbit "+i);
			getAnimal().add(new Zebra());
			getAnimal().get(a+5).setName("Zebra "+i);
			a=a+6;
		}
	}
	public void fight(){
		for(Animal test : animals){
			System.out.println(test.getName()+" "+test.getStrength()+" "+test.getLocationX()+" "+test.getLocationY());
		}
		System.out.println("\nFights In Forest\n");
		for(Animal test : animals){
			int randomAnimal = (int)(Math.random()*30);
				if(Math.abs(getAnimal().get(randomAnimal).getLocationX()-test.getLocationX())<10 && Math.abs(test.getLocationY()-getAnimal().get(randomAnimal).getLocationY())<10){
					if(getAnimal().get(randomAnimal) instanceof Herbivores && test instanceof Herbivores){
						if(getAnimal().get(randomAnimal) != test)
						System.out.println(getAnimal().get(randomAnimal).getName()+" And "+test.getName()+" Are Herbivores So They Won't fight");
					}
					else if(getAnimal().get(randomAnimal) instanceof Carnivores && test instanceof Carnivores){
						if(getAnimal().get(randomAnimal) != test)
						if(getAnimal().get(randomAnimal).getStrength()>test.getStrength()){
						System.out.println(((Carnivores)getAnimal().get(randomAnimal)).kills(getAnimal().get(randomAnimal).getName(),test.getName()));
						}
						else{
						System.out.println(((Carnivores)getAnimal().get(randomAnimal)).kills(test.getName(),getAnimal().get(randomAnimal).getName()));
						}
					}
					else if(getAnimal().get(randomAnimal) instanceof Carnivores && test instanceof Herbivores){
						if(getAnimal().get(randomAnimal).getStrength()>test.getStrength())
						if(((Herbivores)test).luck()>75 ){
							System.out.println(test.getName()+" Has Luck So Escaped From "+getAnimal().get(randomAnimal).getName());
						}
						else if(getAnimal().get(randomAnimal).getHunger()>50){
							System.out.println(getAnimal().get(randomAnimal).eat(getAnimal().get(randomAnimal).getName(),test.getName()));
						}
						else{
						System.out.println(((Carnivores)getAnimal().get(randomAnimal)).hunt(getAnimal().get(randomAnimal).getName(),test.getName()));
						}
					}
					else if(getAnimal().get(randomAnimal) instanceof Herbivores && test instanceof Carnivores){
						if(getAnimal().get(randomAnimal).getStrength()<test.getStrength())
						if(((Herbivores)getAnimal().get(randomAnimal)).luck()>75 ){
							System.out.println(getAnimal().get(randomAnimal).getName()+" Has Luck So Escaped From "+test.getName());
						}
						else if(test.getHunger()>50){
							System.out.println(test.eat(getAnimal().get(randomAnimal).getName(),test.getName()));
						}
						else{
						System.out.println(((Carnivores)test).hunt(test.getName(),getAnimal().get(randomAnimal).getName()));
						}
					}
				}
		}
	}
}