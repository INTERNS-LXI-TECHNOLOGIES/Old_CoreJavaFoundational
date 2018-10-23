/**
 * Class HunterWorker
 * 
 *  This is a Thread
 *
 */


 
import animal.extras.*;
import animal.exceptions.*;

class HunterWorker extends Thread
{
    Forest forest = null;
    Hunter hunter = null;

    HunterWorker(Hunter h , Forest f)
    {
        this.hunter = h;
        this.forest = f;
    }

    public void run()
    {
        while(true)
        {

            if(this.hunter.getArrows() <= 0 || this.forest.getCurrentAnimalCount() <= 0)
            {
                 Thread.currentThread().stop();
            }

            Animal animal = hunter.closestAnimal(this.forest);  

            hunter.setDestination(animal.getPosX(),animal.getPosY());
            hunter.walk();
            
            Console.log("Hunter At { " , hunter.getPosX() , " " , hunter.getPosY() , " Arrows:" , hunter.getArrows() , " }");
            Console.newLine();

            Console.sleep(1000);

            if(hunter.view(animal))
            {
             
                if(hunter.fireArrow(animal))
                {
                    Console.newLine();
                    Console.log(" [ Killed - > " , animal.toString() , " ]");
                    Console.newLine();
                    this.forest.removeAnimal(animal.getId()); 
                }
                else
                {
                    Console.newLine();
                    Console.log("Striked But Escaped -> " , animal.toString());
                    Console.newLine();
                }
    
            }
    
        }
    }
}
