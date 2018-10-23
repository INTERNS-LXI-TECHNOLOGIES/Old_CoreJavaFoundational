/**
 * Enum AnimalCategory
 * 
 * Enum AnimalTypes
 *
 *  -  static AnimalTypes randomType()  -> Randomly return a type
 * 
 *  -  int getStrength()    -> Returns the strength according to type
 * 
 *  -  int getSpeed()   ->  Returns the speed according to type
 * 
 *  -  AnimalCategory getCategory() ->  Returns AnimalCategory ( HERBIVORE , CARNIVORE ) accoording to type
 *
 */


 import animal.extras.*;
 import animal.exceptions.*;

enum AnimalCategory
{
    HERBIVORE , CARNIVORE;
}

public enum AnimalTypes
{
    LION , TIGER , ZEBRA , DEER , RHINO , ELEPHANT;

    public static AnimalTypes randomType()
    {
        int rand = Rand.randNumber(1,5);

        switch(rand)
        {
            case 1: return LION;
            case 2: return TIGER;
            case 3: return ZEBRA;
            case 4: return DEER;
            case 5: return RHINO;
            default: return ELEPHANT;
        }
    }

    public int getStrength()
    {
        switch(this)
        {
            case ELEPHANT : return 100;
            case RHINO : return 50;
            case TIGER : return 30;
            case LION : return 25;
            case ZEBRA : return 20;
            case DEER : return 10;
        }

        return 20;
    }

    public int getSpeed()
    {
        switch(this)
        {
            case ELEPHANT : return 10;
            case RHINO : return 20;
            case TIGER : return 40;
            case LION : return 39;
            case ZEBRA : return 30;
            case DEER : return 50;
        }

        return 20;
    }

    public AnimalCategory getCategory()
    {
        if(this == ELEPHANT || this == RHINO || this == ZEBRA || this == DEER)
        {
            return AnimalCategory.HERBIVORE;
        }
        else
        {
            return AnimalCategory.CARNIVORE;
        }
    }
}
