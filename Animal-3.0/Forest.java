import java.util.*;
public class Forest
{
	ArrayList <Animal> animals= new ArrayList <Animal> ();
	void Inside()
	{
	 System.out.println("-------------------Welcome to Forest!----------------------");
	 Random rand=new Random();	
     for(int i=1;i<=3;i++)
       {
       	Animal tiger =new Tiger();
       tiger.name="Tiger "+i;
       tiger.strength=rand.nextInt(100);
       animals.add(tiger);
       } 

       for(int i=1;i<=3;i++)
       {
       	 Animal lion =new Lion();
     lion.name="Lion "+i;
     lion.strength=rand.nextInt(100);
     animals.add(lion);
       } 

      for(int i=1;i<=3;i++)
       {
       	Animal deer =new Deer();
     deer.name="Deer "+i;
     deer.strength=rand.nextInt(100); 
     animals.add(deer);
       } 

        for(int i=1;i<=3;i++)
       {
       	Animal zebra =new Zebra();
     zebra.name="Zebra "+i;
     zebra.strength=rand.nextInt(100);
     animals.add(zebra);
       } 

     
    
for(int i=0;i<animals.size();i++){
 System.out.println("Name:"+animals.get(i).name+"\tStrength:"+animals.get(i).strength);}
 System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
while(animals.size()!=1)
{
	Collections.shuffle(animals);
System.out.print("\n"+animals.get(0).name+"("+animals.get(0).strength+") Vs "+animals.get(1).name+"("+animals.get(1).strength+")");
Integer k=(animals.get(0)).fight(animals.get(1));
Integer b=null;
if (k==b) {
	
}
else{

int m=(Integer)k;
animals.remove(m);
}
//System.out.print("**"+animals.size());
}

System.out.print("\nFinal Surviver:"+animals.get(0).name);





	}
}