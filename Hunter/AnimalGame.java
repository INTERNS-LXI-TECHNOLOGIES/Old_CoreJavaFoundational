/**
 * Class AnimalGame
 *
 *  -  void initGame()  -> init the resources needed for the game
 *
 *  -  void setGameConfigForest(int px , int py , int pmax_no_animals , String pforest_name)
 * 
 *  -  void startGame()
 *
 */

 import animal.extras.*;
 import animal.exceptions.*;

class AnimalGame
{
    private Forest forest = null;

    private Hunter hunter;

    private int posx, posy;
    private int max_no_animals;
    private String forest_name;


    public void setGameConfigForest(int px , int py , int pmax_no_animals , String pforest_name)
    {
        this.posx = px;
        this.posy = py;
        this.max_no_animals = pmax_no_animals;
        this.forest_name = pforest_name;
    }

    public void initGame()
    {
        try
        {

             this.forest = new Forest(1);
             this.forest.setName(this.forest_name);
             this.forest.setPos(this.posx , this.posy);
             this.forest.setMaxNoAnimals(this.max_no_animals);

             this.hunter = new Hunter();
             this.hunter.setName("jishnu");
             this.hunter.setCoordinates(this.posx , this.posy);
             this.hunter.setArrow(3);
             this.hunter.setView(30);
             this.hunter.setCoordinates(28,96);
             this.hunter.setHitPoint(20);


             for(int i = 0; i < this.max_no_animals;i++)
             {
                Animal animal = new Animal();
                AnimalTypes Atype = AnimalTypes.randomType();

                animal.setType(Atype);
                animal.setStrength(Atype.getStrength());
                animal.setSpeed(Atype.getSpeed());
                animal.setPosX(Rand.randNumber(1 , this.posx));
                animal.setPosY(Rand.randNumber(1 , this.posy));

                this.forest.insertAnimal(animal);
            }

        }
        catch(Exception e)
        {
            Console.log(e.getMessage());
        }


    }

    public void startGame()
    {
        try
        {
            AnimalWorker animalWorker = new AnimalWorker(this.hunter , this.forest);
            animalWorker.start();

            HunterWorker hunterWorker = new HunterWorker(this.hunter , this.forest);
            hunterWorker.start();



            Runnable cleanUP = ()->{

                while(true)
                {
                    if(animalWorker.isAlive() == false && hunterWorker.isAlive() == false)
                    {
                        Console.newLine();
                        Console.log("-----------------------STATUS----------------------");
                        Console.newLine();
                        Console.newLine();
            
                        Animal[] animals = this.forest.getAnimals();
            
                        for(Animal a : animals)
                        {
                            if(a != null)
                            {
                                Console.log(a.getId(),":" , a.getType() ,": Strength ->" , a.getStrength() ,  "  (" , a.getCoordinates() , ")}");
                                Console.newLine();    
                            }
                        }

                        Console.log(this.hunter.toString());
                        Console.newLine();
                        Console.newLine();
            
                        Console.printType("Hunter's Arrows Are All Over............");
                        Console.newLine();
                        Console.exit(0);
            
                    }
                }
            };

            Thread cleaner = new Thread(cleanUP);
            cleaner.start();

            hunterWorker.join();
            animalWorker.join();
            cleaner.join();
              

        }
        catch(Exception e)
        {
            Console.log(e.getMessage());
        }
    }

}
