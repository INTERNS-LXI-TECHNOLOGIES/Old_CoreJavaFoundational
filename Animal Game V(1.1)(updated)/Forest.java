import java.util.*;
public class Forest{

ArrayList<Animal> animals = new ArrayList<Animal>();

Lion lion = new Lion();
Tiger tiger = new Tiger();
Wolf wolf = new Wolf();
Bear bear = new Bear();

public void forestDetails(){ 

animals.add(lion);
animals.add(tiger);
animals.add(wolf);
animals.add(bear);



for(int i=0;i<animals.size();i++){

    if(animals.get(i) != null){
        animals.get(i).setStrength((int)(Math.random()*100));
        
    }
   
}
System.out.println("Lion"+" "+animals.get(0).getStrength());
System.out.println("Tiger"+" "+animals.get(1).getStrength());
System.out.println("Wolf"+" "+animals.get(2).getStrength());
System.out.println("Bear"+" "+animals.get(3).getStrength());

if(animals.get(1).getStrength()<animals.get(0).getStrength()&&animals.get(2).getStrength()<animals.get(0).getStrength()&&animals.get(3).getStrength()<animals.get(0).getStrength()){
    System.out.println("Game Begins_ _ _");
    System.out.println("\n");
    System.out.println("Lion fights Tiger....");
    System.out.println("Lion wins!!!");
    System.out.println("\n");
    System.out.println("Lion fights Wolf.... ");
    System.out.println("Lion wins!!!");
    System.out.println("\n");
    System.out.println("Lion fights Bear....");
    System.out.println("Lion wins!!!");
    System.out.println("\n");
    System.out.println("Lion_won_the_Game");
}
else if(animals.get(0).getStrength()<animals.get(1).getStrength()&&animals.get(2).getStrength()<animals.get(1).getStrength()&&animals.get(3).getStrength()<animals.get(1).getStrength())
    { 
        System.out.println("Game Begins_ _ _");
        System.out.println("\n");
        System.out.println("Tiger fights Lion....");
        System.out.println("Tiger wins!!!");
        System.out.println("\n");
        System.out.println("Tiger fights Wolf.... ");
        System.out.println("Tiger wins!!!");
        System.out.println("\n");
        System.out.println("Tiger fights Bear....");
        System.out.println("Tiger wins!!!");
        System.out.println("\n");
        System.out.println("Tiger_won_the_Game");
}
else if(animals.get(1).getStrength()<animals.get(2).getStrength()&&animals.get(0).getStrength()<animals.get(2).getStrength()&&animals.get(3).getStrength()<animals.get(2).getStrength()){
    System.out.println("Game Begins_ _ _");
    System.out.println("\n");
    System.out.println("Wolf fights Lion....");
    System.out.println("Wolf wins!!!");
    System.out.println("\n");
    System.out.println("Wolf fights Tiger.... ");
    System.out.println("Wolf wins!!!");
    System.out.println("\n");
    System.out.println("Wolf fights Bear....");
    System.out.println("Wolf wins!!!");
    System.out.println("\n");
    System.out.println("Wolf_won_the_Game");
}
else if(animals.get(1).getStrength()<animals.get(3).getStrength()&&animals.get(2).getStrength()<animals.get(3).getStrength()&&animals.get(0).getStrength()<animals.get(3).getStrength()){
    System.out.println("Game Begins_ _ _");
    System.out.println("\n");
    System.out.println("Bear fights Tiger....");
    System.out.println("Bear wins!!!");
    System.out.println("\n");
    System.out.println("Bear fights Wolf.... ");
    System.out.println("Bear wins!!!");
    System.out.println("\n");
    System.out.println("Bear fights Lion....");
    System.out.println("Bear wins!!!");
    System.out.println("\n");
    System.out.println("Bear_won_the_Game");
}
}
} 