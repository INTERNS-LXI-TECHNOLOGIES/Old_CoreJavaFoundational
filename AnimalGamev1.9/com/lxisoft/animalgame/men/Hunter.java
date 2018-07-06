package com.lxisoft.animalgame.men;
import com.lxisoft.animalgame.interfaces.*;
import com.lxisoft.animalgame.forest.*;
import com.lxisoft.animalgame.animal.*;
import java.util.Random;
public class Hunter extends Animal implements Carnivorus{
	private int noOfarrows;
	
	public Hunter(){
		Random r=new Random();
		setnoOfarrows(r.nextInt(10));
		setName("HUNTER");
		setReach(r.nextInt(3));
		setStrength(r.nextInt(10));
		setHungry(r.nextInt(10));
	}
    public boolean breathlevel(){
		return true;		
	}
	public void eats(Animal f,Animal d){
		
	}
	public void fight(Animal f,Animal c){
			System.out.println(f.getName()+" figths with  "+c.getName());  
		   }
	public void killed(Animal f,Animal c){
		System.out.println(f.getName()+" has been killed by  "+c.getName());
	}
}