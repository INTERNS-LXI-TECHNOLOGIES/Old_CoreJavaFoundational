/**
 *  Class TDD [ Main class ]
 */
import animal.extras.*;
import animal.exceptions.*;

import java.util.*;


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

public class TDD
{
  public static void main(String[] args)
  { 
    AnimalGame game = new AnimalGame();
    game.setGameConfigForest(20, 20, 5 , "GIR");
    game.initGame();
    game.startGame();
  }
}
