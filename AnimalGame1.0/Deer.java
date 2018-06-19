import java.io.*;
import java.util.*;
public class Deer extends Animal{
public Deer(int id){
	name="Deer "+String.valueOf(id);
    Random r=new Random();
	hungry=r.nextInt(10);
	strength=r.nextInt(10);
	reach=r.nextInt(4);
	carnivorus=0;
    findLoc();
}
public void check(){
		if((strength>5)&&(hungry>5)){
			fight();
		}
	
	}
}