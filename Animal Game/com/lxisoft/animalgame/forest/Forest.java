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
		for(Animal test : animals){
			test.setSpeed((int)(Math.random()*6)+5);
		}
		/*for(Animal test : animals){
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
						Animal a = animals.get(randomAnimal).fight(animals.get(randomAnimal),animals.get(i));
						if(a!= null){
							animals.remove(a);
						}
					}
				}
		locationSetter();
		Thread.sleep(1000);
		new ProcessBuilder("cmd ","/c"," cls").inheritIO().start().waitFor();
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
	
	public void winner(){
		for(Animal test : animals){
		System.out.println("\n"+"*****"+test.getName()+" Wins*****");
		}
	}
}