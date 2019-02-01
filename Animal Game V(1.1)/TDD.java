import java.util.*;
class TDD{
 
    public static void main(String[] args) {
        
    
    ArrayList<Animal> animals = new ArrayList<Animal>();

        /*Forest f = new Forest(); 

        f.setAnimals(animals);*/
    
    Lion lion = new Lion();
   
    Tiger tiger = new Tiger();

    
    tiger.setStrength((int)(Math.random()*100));
    lion.setStrength((int)(Math.random()*100));
    
    
    animals.add(lion);
    animals.add(tiger); 

    

    System.out.println("Tiger"+" "+tiger.getStrength());
    System.out.println("Lion"+" "+lion.getStrength());

    if(tiger.getStrength()<=lion.getStrength()){
        System.out.println("Tiger"+" fights "+"Lion");
    }
    else{
        System.out.println("Lion"+" fights "+"Tiger");
    }
}
}