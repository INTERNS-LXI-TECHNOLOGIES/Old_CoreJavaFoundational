/**
 *  Class TDD [ Main class ]
 */

import animal.extras.*;
import animal.exceptions.*;

import java.util.*;

/*

  Sample class to test equals() method.

  class T
  {
    int id;

    T(int id)
    {
      this.id = id;
    }

    @Override
    public boolean equals(Object obj)
    {
      if(obj == null) 
      {
        return false;
      }
      else
      {
        return true;
      }
    }
  }
*/

public class TDD
{
  public static void main(String[] args)
  { 
    AnimalGame game = new AnimalGame();
    game.setGameConfigForest(20, 20, 6 , "GIR");
    game.setHunterConfig(6 , 20);
    game.initGame();
    game.startGame();
  }
}
