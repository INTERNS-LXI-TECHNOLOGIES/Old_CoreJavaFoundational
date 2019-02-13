import java.util.*;
public class Forest1{

    ArrayList<Animal> animals = new ArrayList<Animal>();

    Lion lion = new Lion();
    Tiger tiger = new Tiger();
    Wolf wolf = new Wolf();
    Bear bear = new Bear();
    Deer deer = new Deer();
    Buffalo buffalo = new Buffalo();
    Zebra zebra = new Zebra();
    Rabbit rabbit = new Rabbit();
    
    public void forestDetails(){
   
    
       for(int i=0;i<4;i++){
            
            animals.add(lion);
            animals.add(tiger);
            animals.add(wolf);
            animals.add(bear);
            animals.add(deer);
            animals.add(buffalo);
            animals.add(rabbit);
            animals.add(zebra);

            animals.get(0).setName("Lion");
            animals.get(1).setName("Tiger");
            animals.get(2).setName("Wolf");
            animals.get(3).setName("Bear");
            animals.get(4).setName("Rabbit");
            animals.get(5).setName("Deer");
            animals.get(6).setName("Zebra");
            animals.get(7).setName("Buffalo");
            
        

            Random r1 = new Random();
            animals.get(i).setPositionX(r1.nextInt(30));
            animals.get(i).setPositionY(r1.nextInt(30));
            animals.get(i).setStrength(r1.nextInt(100));
            animals.get(i).setHungryLevel(r1.nextInt(100));

               
            
            if(animals.get(i).getPositionX()<=25 && animals.get(i).getPositionY()>=5){
                
                if(animals.get(i).getStrength()>80){

                System.out.println(animals.get(i).getName());
                animals.remove(lion);
                animals.remove(tiger);
                animals.remove(wolf);
                animals.remove(bear);
                }
            }
            
            else if(animals.get(i).getPositionX()<=20 && animals.get(i).getPositionY()>=5){
                    
                if(animals.get(i).getStrength()<80){

                    System.out.println(animals.get(i).getName());
                    animals.remove(lion);
                    animals.remove(tiger);
                    animals.remove(wolf);
                    animals.remove(bear);
                }    
            }
              
        }
                   
    }
}