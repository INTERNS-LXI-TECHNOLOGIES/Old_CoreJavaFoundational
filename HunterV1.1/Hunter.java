/**
 * Class Hunter
 *
 * -  Hunter()
 *
 * -  void setName(String name) -> Sets the name of the hunter
 *
 * -  void setArrow(int arrows) -> Sets the no of arrows
 *
 * -  void setCoordinates(int posx , int posy) -> Sets x and y coordinates for hunter
 * 
 * -  void setDestination(int posx , int posy)  -> Sets a Destination for hunter
 * 
 * -  void setPosX(int posx)   ->  Set the X coordinates position of Animal
 * 
 * -  void setPosY(int posy)    ->  Set the Y coordinates position of Animal
 * 
 * -  void setView(int view)   -> Sets how far can the hunter see
 * 
 * -  void setHitPoint(int point)   -> Sets a hitpoints of the hunter
 * 
 * -  void setKillCount(int kills)  ->  Sets the kill count for hunter
 *
 * -  int getView() ->  Returns How far the hunter can see
 * 
 * -  int getArrows()   -> Returns the number of arrows
 *
 * -  String getName()  -> Returns the name of hunter
 *
 * -  int[] getCoordinates(void) -> Gets x and y coordinates for hunter as Array
 * 
 * -  int getPosX() ->  Returns x coordinate of HUNTER
 * 
 * -  int getPosY() ->  Returns y coordinate of HUNTER
 * 
 * -  int getHitPoint() ->  Returns the hitpoint of hunter
 * 
 * -  int getKillCount() ->  Returns the kill count
 * 
 * -  void walk()   -> Move the hunter from current position to destination point
 * 
 * -  view(Animal animal)   -> See animal is in hunters view
 * 
 * -  Animal closestAnimal(Forest f)   ->  Returns the closest animal
 * 
 * -  boolean fireArrow(Animal animal)  -> Fires the arrow
 * 
 * -  @Override String toString()
 *
 */

 import animal.extras.*;
 import animal.exceptions.*;

public class Hunter implements LivingThings
{
    private static int id = 1;

    private int hn_id = 0;
    private String hn_name = "";
    private int hn_no_of_arrows = 0;
    private int hn_no_of_kills = 0;
    private int hn_pos_x = 0;
    private int hn_pos_y = 0;
    private int hn_dpos_x = 0;
    private int hn_dpos_y = 0;
    private int hn_hitpoints = 0;

    private int hn_max_view = 0;

    Hunter()
    {
        this.hn_id = id;
        id++;
    }

    // Setters

    public void setName(String name)
    {
        this.hn_name = name;
    }

    public void setArrow(int arrows)
    {
        this.hn_no_of_arrows = arrows;
    }

    public void setDestination(int posx , int posy)
    {
        this.hn_dpos_x = posx;
        this.hn_dpos_y = posy;
    }

    public void setCoordinates(int posx , int posy)
    {
        this.hn_pos_x = posx;
        this.hn_pos_y = posy;
    }
    public void setPosX(int posx)
    {
        this.hn_pos_x = posx;
    }

    public void setPosY(int posy)
    {
        this.hn_pos_y = posy;
    }

    public void setView(int view)
    {
        this.hn_max_view = view;
    }

    public void setHitPoint(int point)
    {
        this.hn_hitpoints = point;

    }

    public void setKillCount(int kills)
    {
        this.hn_no_of_kills = kills;
    }

    // Getters

    public int getView()
    {
        return this.hn_max_view;
    }

    public int getArrows()
    {
        return this.hn_no_of_arrows;
    }

    public String getName()
    {
        return this.hn_name;
    }

    public int[] getCoordinates()
    {
        return new int[] { this.hn_pos_x , this.hn_pos_y };
    }

    public int getPosY()
    {
        return this.hn_pos_y;
    }

    public int getPosX()
    {
        return this.hn_pos_x;
    }


    public int getHitPoint()
    {
        return this.hn_hitpoints;
    }

    public int getKillCount()
    {
        return this.hn_no_of_kills;
    }

    
    public void walk()
    {
        this.setCoordinates(this.hn_dpos_x, this.hn_dpos_y);
    }

    public boolean view(Animal animal)
    {
        if(this.hn_max_view <= Point.getDistance(new int[]{animal.getPosX() , this.getPosX()} , new int[]{animal.getPosY() , this.getPosY()}))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public Animal closestAnimal(Forest f)
    {
        int distance = 0 , shortest = 0;

        Animal panimal = null;

        for(Animal animal : f.getAnimals())
        {
                distance = Point.getDistance(new int[]{animal.getPosX() , this.getPosX()} , new int[]{animal.getPosY() , this.getPosY()});

                if(shortest == 0)
                {
                    shortest = distance;
                    panimal = animal;
                }
    
                if(distance < shortest)
                {
                    shortest = distance;
                    panimal = animal;
                }
        }

        return panimal;
    }

    public boolean fireArrow(Animal animal)
    {
        this.hn_no_of_arrows--;
        
        animal.setStrength((int )animal.getStrength() - this.getHitPoint());

        if(animal.getStrength() <= 0)
        {
            this.setHitPoint((int)this.getHitPoint() + 10);
            this.setKillCount(this.getKillCount() + 1);
            return true;
        } 
        else return false;
    }

    public String toString()
    {
        String prop = "\nHunter \n{";
        prop = prop.concat("\n\tid : " + this.hn_id);
        prop = prop.concat("\n\tPosition X : " + this.hn_pos_x);
        prop = prop.concat("\n\tPosition Y : " + this.hn_pos_y);
        prop = prop.concat("\n\tArrows Left : " + this.hn_no_of_arrows);
        prop = prop.concat("\n\tKills : " + this.hn_no_of_kills);
        prop = prop.concat("\n\tPoints : " + this.hn_hitpoints);
        prop = prop.concat("\n}\n");

        return prop;
    }


}
