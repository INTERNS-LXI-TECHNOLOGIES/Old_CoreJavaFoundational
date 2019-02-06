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
		for(int i=0;i<((int)(Math.random()*5)+5);i++){
			animals.add(new Tiger());
		}
		for(int i=0;i<((int)(Math.random()*5)+5);i++){
			animals.add(new Lion());
		}
		for(int i=0;i<((int)(Math.random()*5)+5);i++){
			animals.add(new Bear());
		}
		for(int i=0;i<((int)(Math.random()*5)+5);i++){
			animals.add(new Deer());
		}
		for(int i=0;i<((int)(Math.random()*5)+5);i++){
			animals.add(new Rabbit());
		}
		for(int i=0;i<((int)(Math.random()*5)+5);i++){
			animals.add(new Zebra());
		}	
		int a = 1;
		for(int i = 0 ;i<animals.size();i++){
			if(animals.get(i) instanceof Tiger){
				animals.get(i).setName("Tiger "+a);
				a++;
			}
		}
		int b = 1;
		for(int i = 0 ;i<animals.size();i++){
			if(animals.get(i) instanceof Lion){
				animals.get(i).setName("Lion "+b);
				b++;	
			}
		}
		int c = 1;
		for(int i = 0 ;i<animals.size();i++){
			if(animals.get(i) instanceof Bear){
				animals.get(i).setName("Bear "+c);
				c++;	
			}	
		}
		int d = 1;
		for(int i = 0 ;i<animals.size();i++){
			if(animals.get(i) instanceof Deer){
				animals.get(i).setName("Deer "+d);
				d++;	
			}
		}
		int e = 1;
		for(int i = 0 ;i<animals.size();i++){
			if(animals.get(i) instanceof Rabbit){
				animals.get(i).setName("Rabbit "+e);
				e++;
			}
		}
		int f = 1;
		for(int i = 0 ;i<animals.size();i++){			
			if(animals.get(i) instanceof Zebra){
				animals.get(i).setName("Zebra "+f);
				f++;
			}
		}
			animals.add(hunter);
			hunter.setName("Hunter");
			System.out.println(animals.size());
	}
	public void startFight(){
			for(Animal test : animals){
				test.setLocationX(area);
				test.setLocationY(area);
				test.setSpeed((int)(Math.random()*100));
			}
		for(int i = 0 ;i<animals.size();i++){
			int randomAnimal = (int)(Math.random()*animals.size());
				if(Math.abs(animals.get(randomAnimal).getLocationX()-animals.get(i).getLocationX())<10 && Math.abs(animals.get(i).getLocationY()-animals.get(randomAnimal).getLocationY())<10){
					if(animals.get(randomAnimal) instanceof Herbivore && animals.get(i) instanceof Herbivore){
						if(animals.get(randomAnimal) != animals.get(i)){
							if(animals.get(randomAnimal).getSpeed()<30){
								System.out.println(animals.get(randomAnimal).getName()+" Died In Fire");
								animals.remove(randomAnimal);
							}
							else if(animals.get(i).getSpeed()<30){
								System.out.println(animals.get(i).getName()+" Died In Fire");
								animals.remove(i);
							}
							else{
							System.out.println(animals.get(randomAnimal).getName()+" And "+animals.get(i).getName()+" Won't Fight");
						}
						}
						}
					else if(animals.get(randomAnimal) instanceof Carnivore && animals.get(i) instanceof Carnivore){
						if(animals.get(randomAnimal) != animals.get(i))
						if(animals.get(randomAnimal).getStrength()>animals.get(i).getStrength()){
							System.out.println(animals.get(randomAnimal).getName()+((Carnivore)animals.get(randomAnimal)).kills(animals.get(i).getName()));
							System.out.println(animals.get(randomAnimal).sound());
							animals.remove(i);
						}
						else{
							System.out.println(animals.get(i).getName()+((Carnivore)animals.get(randomAnimal)).kills(animals.get(randomAnimal).getName()));
							System.out.println(animals.get(i).sound());
							animals.remove(animals.get(randomAnimal));
						}
					}
					else if(animals.get(randomAnimal) instanceof Carnivore && animals.get(i) instanceof Herbivore){
						if(animals.get(randomAnimal).getStrength()>animals.get(i).getStrength())
						if(((Herbivore)animals.get(i)).luck()>75 ){
							System.out.println(animals.get(i).getName()+" Has Luck So Escaped From "+animals.get(randomAnimal).getName());
						}
						else if(animals.get(i).getSpeed()>animals.get(randomAnimal).getSpeed()){
							System.out.println(animals.get(i).getName()+" Run Away From "+animals.get(randomAnimal).getName());
						}
						if(animals.get(randomAnimal).getHunger()>50){
							System.out.println(animals.get(randomAnimal).getName()+animals.get(randomAnimal).eat(animals.get(i).getName()));
							System.out.println(animals.get(randomAnimal).sound());
							animals.remove(i);
						}
						else{
							System.out.println(animals.get(randomAnimal).getName()+((Carnivore)animals.get(randomAnimal)).kills(animals.get(i).getName()));
							System.out.println(animals.get(randomAnimal).sound());
							animals.remove(i);
						}
					}
					else if(animals.get(randomAnimal) instanceof Herbivore && animals.get(i) instanceof Carnivore){
						if(animals.get(randomAnimal).getStrength()<animals.get(i).getStrength())
						if(((Herbivore)animals.get(randomAnimal)).luck()>75 ){
							System.out.println(animals.get(randomAnimal).getName()+" Escaped From "+animals.get(i).getName());
						}
						else if(animals.get(randomAnimal).getSpeed()>animals.get(i).getSpeed()){
							System.out.println(animals.get(randomAnimal).getName()+" Run Away From "+animals.get(i).getName());
						}
						if(animals.get(i).getHunger()>50){
							System.out.println(animals.get(i).getName()+animals.get(i).eat(animals.get(randomAnimal).getName()));
							System.out.println(animals.get(i).sound());
							animals.remove(animals.get(randomAnimal));
						}
						else{
						System.out.println(animals.get(i).getName()+((Carnivore)animals.get(i)).kills(animals.get(randomAnimal).getName()));
						System.out.println(animals.get(i).sound());
						animals.remove(animals.get(randomAnimal));
						}
					}
					else if(animals.get(randomAnimal) instanceof Omnivore && animals.get(i) instanceof Carnivore){
						if(animals.get(i).getStrength()>90){
							System.out.println(animals.get(i).getName()+((Carnivore)animals.get(i)).kills(animals.get(randomAnimal).getName()));
							System.out.println(animals.get(i).sound());
							animals.remove(animals.get(randomAnimal));
						}
						else if(animals.get(i).getSpeed()>50){
							System.out.println(animals.get(i).getName()+" Run Away From "+animals.get(randomAnimal).getName());
						}
						else if(((Hunter)animals.get(randomAnimal)).getBullets()!= 0){
							System.out.println(animals.get(randomAnimal).getName()+((Omnivore)animals.get(randomAnimal)).hunt(animals.get(i).getName()));
							((Hunter)animals.get(randomAnimal)).setBullets(((Hunter)animals.get(randomAnimal)).getBullets()-1);
							System.out.println(animals.get(randomAnimal).sound());
							animals.remove(animals.get(i));
						}
						else if(((Hunter)animals.get(randomAnimal)).getBullets()== 0){
							if(((Omnivore)animals.get(randomAnimal)).luck()>80){
								System.out.println(animals.get(randomAnimal).getName()+" Escaped From "+animals.get(i).getName());
							}
							else{
								System.out.println(animals.get(i).getName()+((Carnivore)animals.get(i)).kills(animals.get(randomAnimal).getName()));
								System.out.println(animals.get(i).sound());
								animals.remove(animals.get(randomAnimal));
							}
						}
					}
					else if(animals.get(randomAnimal) instanceof Carnivore && animals.get(i) instanceof Omnivore){
						if(animals.get(randomAnimal).getStrength()>90){
							System.out.println(animals.get(randomAnimal).getName()+((Carnivore)animals.get(randomAnimal)).kills(animals.get(i).getName()));
							System.out.println(animals.get(randomAnimal).sound());
							animals.remove(animals.get(i));
						}
						else if(animals.get(randomAnimal).getSpeed()>50){
							System.out.println(animals.get(randomAnimal).getName()+" Run Away From "+animals.get(i).getName());
						}
						else if(((Hunter)animals.get(i)).getBullets()!= 0){
							System.out.println(animals.get(i).getName()+((Omnivore)animals.get(i)).hunt(animals.get(randomAnimal).getName()));
							((Hunter)animals.get(i)).setBullets(((Hunter)animals.get(i)).getBullets()-1);
							System.out.println(animals.get(i).sound());
							animals.remove(animals.get(randomAnimal));
						}
						else if(((Hunter)animals.get(i)).getBullets()== 0){
							if(((Omnivore)animals.get(i)).luck()>80){
								System.out.println(((Omnivore)animals.get(i)).luck());
								System.out.println(animals.get(i).getName()+" Escaped From "+animals.get(randomAnimal).getName());
							}
							else{
								System.out.println(animals.get(randomAnimal).getName()+((Carnivore)animals.get(randomAnimal)).kills(animals.get(i).getName()));
								System.out.println(animals.get(randomAnimal).sound());
								animals.remove(animals.get(i));
							}
						}
					}
					else if(animals.get(randomAnimal) instanceof Omnivore && animals.get(i) instanceof Herbivore){
						if(((Herbivore)animals.get(i)).luck()>75 ){
							System.out.println(animals.get(i).getName()+" Escaped From "+animals.get(randomAnimal).getName());
						}
						else if(animals.get(i).getSpeed()>50){
							System.out.println(animals.get(i).getName()+" Run Away From "+animals.get(randomAnimal).getName());
						}
						else if(((Hunter)animals.get(randomAnimal)).getBullets()!= 0){
							System.out.println(animals.get(randomAnimal).getName()+((Omnivore)animals.get(randomAnimal)).hunt(animals.get(i).getName()));
							((Hunter)animals.get(randomAnimal)).setBullets(((Hunter)animals.get(randomAnimal)).getBullets()-1);
							System.out.println(animals.get(randomAnimal).sound());
							animals.remove(animals.get(i));
						}
						else if(((Hunter)animals.get(randomAnimal)).getBullets()== 0){
							System.out.println(animals.get(randomAnimal).getName()+" Leaves "+animals.get(i).getName());
						}
					}
					else if(animals.get(randomAnimal) instanceof Herbivore && animals.get(i) instanceof Omnivore){
						if(((Herbivore)animals.get(randomAnimal)).luck()>75 ){
							System.out.println(animals.get(randomAnimal).getName()+" Escaped From "+animals.get(i).getName());
						}
						else if(animals.get(randomAnimal).getSpeed()>50){
							System.out.println(animals.get(randomAnimal).getName()+" Run Away From "+animals.get(i).getName());
						}
						else if(((Hunter)animals.get(i)).getBullets()!= 0){
							System.out.println(animals.get(i).getName()+((Omnivore)animals.get(i)).hunt(animals.get(randomAnimal).getName()));
							((Hunter)animals.get(i)).setBullets(((Hunter)animals.get(i)).getBullets()-1);
							System.out.println(animals.get(i).sound());
							animals.remove(animals.get(randomAnimal));
						}
						else if(((Hunter)animals.get(i)).getBullets()== 0){
							System.out.println(animals.get(i).getName()+" Leaves "+animals.get(randomAnimal).getName());
						}
					}
					}
			}
		if(area>10){
		area = area - 10;
		}
		/*for(Animal test : animals){
		System.out.println(test.getName());
		}*/
	}
	public void winner(){
		for(Animal test : animals){
		System.out.println("\n"+"*****"+test.getName()+" Wins*****");
		}
	}
}