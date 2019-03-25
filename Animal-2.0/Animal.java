import java.util.*;
public class Animal
{
	int animal_strength;
	String name,type;
	
  
    void fight()
    {    
    ArrayList <Animal> animals= new ArrayList <Animal> ();
    Tiger tiger =new Tiger();
    tiger.getData();
    animals.add(tiger);
    Lion lion =new Lion();
    lion.getData();
    animals.add(lion);
    Deer deer =new Deer();
    deer.getData();
    animals.add(deer);
    Zebra zebra =new Zebra();
    zebra.getData();
    animals.add(zebra);
  
  
    
   // Collections.shuffle(animallist);
    for(int i=0;i<animals.size();i++){
 System.out.println("Name:"+animals.get(i).name+"\tStrength:"+animals.get(i).animal_strength);}

  while(animals.size()!=1){

      	Collections.shuffle(animals);
      System.out.print("\n"+animals.get(0).name+" Vs "+animals.get(1).name);
       	if(animals.get(0).animal_strength>animals.get(1).animal_strength)
         {
         	System.out.print("\t   Winner:"+animals.get(0).name+"\n");
          if((animals.get(0).type).equals(animals.get(1).type))
          {
            animals.get(0).animal_strength=(animals.get(0).animal_strength)-5;
             animals.get(1).animal_strength=(animals.get(1).animal_strength)-10;
             System.out.print(animals.get(1).name+" runs away.\n");
             if(animals.get(1).animal_strength<=0)
              animals.remove(1);
          }
          else
         	{
             System.out.print(animals.get(1).name+" dead.\n");
            animals.remove(1);
          }
        }
        else
         {
     	 System.out.print(" \t  Winner:"+animals.get(1).name+"\n");
         if((animals.get(0).type).equals(animals.get(1).type))
          {
            animals.get(1).animal_strength=(animals.get(1).animal_strength)-5;
             animals.get(0).animal_strength=(animals.get(0).animal_strength)-10;
             System.out.print(animals.get(0).name+" runs away.\n");
             if(animals.get(0).animal_strength<=0)
              animals.remove(0);
          }
          else
          {
             System.out.print(animals.get(0).name+" dead.\n");
            animals.remove(0);
          }
         
          }
        
       }
    

      System.out.print("\n Final Winner:"+animals.get(0).name);
     }
     

 }