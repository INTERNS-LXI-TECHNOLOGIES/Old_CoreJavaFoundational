/*
 * Class Forest
 *
 *  -  Forest(int id)   -> Creates a Forest with fr_id = id
 *
 *  -  void setId(int id)  -> Sets the fr_id of Forest
 *
 *  -  void setName(String name) -> Sets the fr_name of Forest
 *
 *  -  void setPos(int x , int y)  -> Sets fr_x and fr_y position of forest
 *
 *  -  void setPosY(int y)  -> Sets the fr_y position of Forest
 *
 *  -  void setPosX(int x)  -> Sets the fr_x position of Forest
 *
 *  -  void setMaxNoAnimals(int no) -> Sets Maximun number of animal in forest
 *
 *
 *  -  int insertAnimal(Animal m)   -> Insert a animal into fr_animals | returns 1 on success and 0 on failiure
 *
 *  -  Animal removeAnimal(int id)  -> Removes the animal with an_id = id   | Returns the removed animal
 *
 *  -  Animal removeAnimal(Animal animal)   -> Removes animal from forest   | Returns the removed animal
 *
 *
 *  -  int getid(void)  -> Returns the fr_id of forest
 *
 *  -  String getName(void) -> Returns the fr_name of Forest
 *
 *  -  int[] getPos(void)    -> returns the fr_x and fr_y as array
 *
 *  -  int getPosX(void)    -> Returns the fr_x of Forest
 *
 *  -  int getPosY(void)    -> Returns the fr_y of Forest
 *
 *  -  int getCurrentAnimalCount(void) -> Returns the current animal count
 *
 *  -  Animal getAnimal(int id) -> Returns animal with an_id = id
 *
 *  -  Animal[] getAnimals() -> Returns all animals
 *
 *
 */

 import animal.extras.*;
 import animal.exceptions.*;

public class Forest
{
    private int fr_id = 0;
    private String fr_name = null;

    private int fr_x = 0;
    private int fr_y = 0;


    private Animal[] fr_animals = null;
    private int fr_no_animals = 0;
    private int fr_animal_count = 0;

    public Forest(){}

    public Forest(int id)
    {
        this.fr_id = id;
    }

    // Setters

    public void setId(int id)
    {
        this.fr_id = id;
    }

    public void setName(String name)
    {
        this.fr_name = name;
    }

    public void setPos(int x , int y)
    {
        this.fr_x = x;
        this.fr_y = y;
    }

    public void setPosY(int y)
    {
        this.fr_y = y;
    }

    public void setPosX(int x)
    {
        this.fr_x = x;
    }

    public void setMaxNoAnimals(int no)
    {
        try
        {
            if(no > 10000)
            {
                    throw new ForestException(ForestErrors.ERR_MAX_SUPPORTS);
            }

            this.fr_no_animals =  no;
            this.fr_animals = new Animal[this.fr_no_animals];
        }
        catch(ForestException e)
        {
            Console.log(e.getMessage());
        }
    }

    public int insertAnimal(Animal animal)
    {
        try
        {
            if(this.fr_no_animals <= 0)
            {
                throw new ForestException(ForestErrors.ERR_MAX_SUPPORTS_NOT_SET);
            }

            if(this.getCurrentAnimalCount() >= this.fr_no_animals)
            {
                throw new ForestException(ForestErrors.ERR_MAX_SUPPORTS);
            }
            if(this.getAnimal(animal.getId()) != null)
            {
                throw new ForestException(ForestErrors.ERR_ANIMAL_ALREADY_IN_FOREST);
            }

            this.fr_animals[this.getCurrentAnimalCount()] = animal;
            this.fr_animal_count++;

            return 1;

        }
        catch(ForestException e)
        {
            Console.log(e.getMessage());
        }

        return 0;
    }

    // Getters

    public int getId()
    {
        try
        {
            if(this.fr_id <= 0)
            {
                throw new ForestException(ForestErrors.ERR_ID_NOT_SET);
            }
        }
        catch(ForestException e)
        {
            Console.log(e.getMessage());
        }

        return this.fr_id;
    }

    public String getName()
    {
        try
        {
            if(this.fr_name == null)
            {
                throw new ForestException(ForestErrors.ERR_NAME_NOT_SET);
            }
        }
        catch(ForestException e)
        {
            Console.log(e.getMessage());
        }

        return this.fr_name;
    }

    public int[] getCoordinates()
    {
        try
        {
            if(this.fr_x == 0 || this.fr_y == 0)
            {
                throw new ForestException(ForestErrors.ERR_COORDINATES);
            }
        }
        catch(ForestException e)
        {
            Console.log(e.getMessage());
        }
        return new int[] { this.fr_x , this.fr_y};
    }

    public int getPosY()
    {
        try
        {
            if(this.fr_y == 0)
            {
                throw new ForestException(ForestErrors.ERR_COORDINATE_Y);
            }
        }
        catch(ForestException e)
        {
            Console.log(e.getMessage());
        }
        return this.fr_y;
    }

    public int getPosX()
    {
        try
        {
            if(this.fr_x == 0)
            {
                throw new ForestException(ForestErrors.ERR_COORDINATE_X);
            }
        }
        catch(ForestException e)
        {
            Console.log(e.getMessage());
        }
        return this.fr_x;
    }

    public int getCurrentAnimalCount()
    {
        return this.fr_animal_count;
    }

    public Animal getAnimal(int id)
    {
        for(Animal animal:this.fr_animals)
        {
            if(animal != null)
            {
                if(id == animal.getId())
                {
                    return animal;
                }
            }
        }

        return null;
    }

    public Animal[] getAnimals()
    {
        return this.fr_animals;
    }

    public Animal removeAnimal(int id)
    {
        try
        {
            Animal kill = null;

            if(this.getAnimal(id) != null)
            {
                for(int i = 0;i < this.getCurrentAnimalCount();i++)
                {
                    if(this.fr_animals[i] != null)
                    {
                        if(this.fr_animals[i].getId() == id)
                        {
                            kill = this.fr_animals[i];
                            this.fr_animals[i] = null;
                            this.fr_animal_count--;
                        }
                    }
                }

                return kill;

            }
            else
            {
                throw new ForestException(ForestErrors.ERR_ANIMAL_NOT_FOUND + " " + id);
            }
        }
        catch(ForestException e)
        {
                Console.log(e.getMessage());
        }

        return null;
    }

    public Animal removeAnimal(Animal animal)
    {
        try
        {
            Animal kill = null;

            if(this.getAnimal(animal.getId()) != null)
            {
                for(int i = 0;i < this.getCurrentAnimalCount();i++)
                {
                    if(this.fr_animals[i] != null)
                    {
                        if(this.fr_animals[i].getId() == animal.getId())
                        {
                            kill = this.fr_animals[i];
                            this.fr_animals[i] = null;
                            this.fr_animal_count--;
                        }
                    }
                }

                return kill;

            }
            else
            {
                throw new ForestException(ForestErrors.ERR_ANIMAL_NOT_FOUND + " " + animal.getId());
            }
        }
        catch(ForestException e)
        {
                Console.log(e.getMessage());
        }

        return null;
    }

    public void printDetails()
    {
        for(Animal animal :this.fr_animals)
        {
            if(animal != null)
            {

                Console.log(animal.getId() , ":" , animal.getType());
            }
        }
    }


}
