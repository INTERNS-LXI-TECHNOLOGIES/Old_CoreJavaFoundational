import java.io.*;
import java.util.*;
public class Zebra extends Animal{
	public Zebra(int id){
		   name="Zebra "+String.valueOf(id);
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