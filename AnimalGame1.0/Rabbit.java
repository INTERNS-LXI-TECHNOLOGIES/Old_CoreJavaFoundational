import java.io.*;
import java.util.*;
public class Rabbit extends Animal{
	public Rabbit(int id){
	name="Rabbit "+String.valueOf(id);
    Random r=new Random();
	strength=r.nextInt(10);
	reach=r.nextInt(4);
	hungry=r.nextInt(10);
	carnivorus=0;
    findLoc();
}
public void check(){
		if((strength>5)&&(hungry>5)){
			fight();
		}
	
	}
}