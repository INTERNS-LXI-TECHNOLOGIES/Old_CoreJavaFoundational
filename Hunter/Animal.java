/**
 * Class Animal
 *
 *  -   Animal()  -> Creates an Animal with an id
 *
 *  -   void setStrength(int strength)  -> Sets the strength of animal
 *
 *  -   void setSpeed(int speed)    -> Sets the speed of animal
 *
 *  -   void setType(Animals type)   -. sets the type of animal
 *
 *  -   void setCategory(AnimalCategory category) -> Set category HERBIVORE or CARNIVORE
 * 
 *  -   void setDestination(int posx , int posy)  -> Sets a Destination for animal
 * 
 *  -   void setCoordinates(int posx , int posy) -> Set the current coordinates of animal
 * 
 *  -   void setPosX(int posx)  -> Set the X coordinates position of Animal
 * 
 *  -   void setPosY(int posy)  ->  Set the Y coordinates position of Animal
 *
 *  -   int getId()  -> Returns the id of the animal
 *
 *  -   double getStrength()    -> Returns the strength of animal
 *
 *  -   double getSpeed()   -> Returns animal speed
 * 
 *  -   AnimalCategory getCategory()    -> Returns the Category Of animal
 * 
 *  -   int[] getCoordinates()  -> Returns x/y Coordinates of animal
 *
 *  -   void getPosX(int posx)  -> Returns x coordinate of animal
 *
 *  -   void getPosY(int posy) -> Returns y coordinate of animal
 *
 *  -   Animals getType()    -> Returns Type of animal
 *
 *  -   AnimalCategory getCategory() -> get Animal category HERBIVORE or CARNIVORE
 * 
 *  -   void walk() -> Move Animal from current position todestination point
 * 
 *  -   boolean view(Hunter hunter) -> Checks if the hunter is in view of Animal
 * 
 *  -   void run()  ->  Move Animal from current position todestination point
 * 
 *  -   @Override String toString()
 *
 */

import animal.extras.*;
import animal.exceptions.*;

public class Animal implements LivingThings
{
    private static int id = 1;

    private int an_id = 0;

    private int an_pos_x = 0;
    private int an_pos_y = 0;
    private int an_dpos_x = 0;
    private int an_dpos_y = 0;

    private double an_strength = 0;
    private double an_speed = 0;
    private AnimalTypes an_type = null;

    private AnimalCategory an_category = null;

    public Animal()
    {
            this.an_id = id;
            id++;
    }

    // Setters


    public void setStrength(int strength)
    {
        this.an_strength  = strength;
    }

    public void setSpeed(int speed)
    {
        this.an_speed = speed;
    }

    public void setType(AnimalTypes type)
    {
        this.an_type = type;
    }

    public void setCategory(AnimalCategory category)
    {
        this.an_category = category;
    }

    public void setDestination(int posx , int posy)
    {
        this.an_dpos_x = posx;
        this.an_dpos_y = posy;
    }

    public void setCoordinates(int posx , int posy)
    {
        this.an_pos_x = posx;
        this.an_pos_y = posy;
    }

    public void setPosX(int posx)
    {
        this.an_pos_x = posx;
    }

    public void setPosY(int posy)
    {
        this.an_pos_y = posy;
    }


    // Getters

    public int getId()
    {
        return this.an_id;
    }

    public double getStrength()
    {
        return this.an_strength;
    }

    public double getSpeed()
    {
        return this.an_speed;
    }

    public AnimalTypes getType()
    {
        return this.an_type;
    }

    public int[] getCoordinates()
    {
        return new int[]{ this.getPosX(), this.getPosY() };
    }

    public int getPosX()
    {
        return this.an_pos_x;
    }

    public int getPosY()
    {
        return this.an_pos_y;
    }

    public AnimalCategory getCategory()
    {
            return this.an_category;
    }

    public void walk()
    {

        while(true)
        {
            if(this.an_pos_x > this.an_dpos_x)
            {
                this.an_pos_x--;
            }
            else if(this.an_pos_x < this.an_dpos_x)
            {
                this.an_pos_x++;
            }

            if(this.an_pos_y > this.an_dpos_y)
            {
                this.an_pos_y--;
            }
            else if(this.an_pos_y < this.an_dpos_y)
            {
                this.an_pos_y++;
            }

            if((this.an_pos_x == this.an_dpos_x) && (this.an_pos_y == this.an_dpos_y))
            {
                break;
            }

        }
    }

    public boolean view(Hunter hunter)
    {
        int hview = hunter.getView();

        int distance = Point.getDistance(new int[]{this.getPosX(),hunter.getPosX()} , new int[]{this.getPosY(),hunter.getPosY()});

        try{ Thread.currentThread().sleep(100);}catch(Exception e){}

        if(distance <= hview)
        {
            return true;
        }

        return false;
    }

    public void run()
    {
        this.setCoordinates(this.getPosX()+1, this.getPosY()+1);
        Console.log(" [ Running -> " , this.toString() , " ]");
    }


    @Override
    public String toString()
    {
        String prop = "\nAnimal \n{";
        prop = prop.concat("\n\tid : " + this.an_id);
        prop = prop.concat("\n\tPosition X : " + this.an_pos_x);
        prop = prop.concat("\n\tPosition Y : " + this.an_pos_y);
        prop = prop.concat("\n\tType : " + this.an_type);
        prop = prop.concat("\n\tStrength : " + this.an_strength);
        prop = prop.concat("\n}\n");
        return prop;
    }


}
