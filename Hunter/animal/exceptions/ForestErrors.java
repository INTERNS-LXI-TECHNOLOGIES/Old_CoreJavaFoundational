/**
 * Class Errors
 *  
 *
 */

 package animal.exceptions;

public final class ForestErrors
{
    private ForestErrors(){}

    public static final String ERR_NAME_NOT_SET = "Name not set For Forest";
    public static final String ERR_ID_NOT_SET = "Id Not set for Forest";

    public static final String ERR_COORDINATE_Y = "Y coordinate not set For Forest";
    public static final String ERR_COORDINATE_X = "X coordinate not set For Forest";
    public static final String ERR_COORDINATES = "Either x or y coordinates are set to zero for Forest";
    public static final String ERR_MAX_SUPPORTS = "Animal count exceeded maximum number of supported animals in forest";
    public static final String ERR_MAX_SUPPORTS_NOT_SET = "Animals array in Forest not initialized call setMaxNoAnimals";

    public static final String ERR_ANIMAL_NOT_FOUND = "Animals not Found";
    public static final String ERR_ANIMAL_ALREADY_IN_FOREST = "Animals is already Added in the forest";

}
