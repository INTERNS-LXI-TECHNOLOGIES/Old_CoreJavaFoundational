import java.io.*;
import java.util.*;
public class Lion extends Animal{
	public Lion(int id){
	name="Lion "+String.valueOf(id);
    Random r=new Random();
	hungry=r.nextInt(10);
	strength=r.nextInt(10);
	reach=r.nextInt(3);
	carnivorus=1;
    findLoc();
    }
	public void check(){
		if((strength>5)&&(hungry>5)){
			fight();
		}
	
	}
}