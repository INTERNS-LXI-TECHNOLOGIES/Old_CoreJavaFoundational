class AnimalCarnivor extends Animal implements Carnivor
{
	public void eat(Animal animal)
	{
	System.out.println("\t"+name+" hunts "+animal.name);
	}
	public void sound()
	{
	String food="roar";
	}
	 public Integer  fight(Animal animal)
    {    
    Integer k=null;
      if((this instanceof Carnivor)&&(animal instanceof Carnivor) )
         {
          k=null;
          //System.out.println("\t  Hunted each other!");
          this.eat(animal);
          strength=strength-20;
          animal.strength=animal.strength-20;
          if(strength<=0)
          	k=0;
          if(animal.strength<=0)
          	k=1;
         }
     else if((this instanceof Herbivor)&&(animal instanceof Herbivor))
         {
          k=null;
          System.out.println("\t  Goes away!");
          strength=strength-10;
          animal.strength=animal.strength-10;
          if(strength<=0)
          	k=0;
          if(animal.strength<=0)
          	k=1;
         }

     else if((this instanceof Herbivor)&&(animal instanceof Carnivor))
     {
         if(strength>animal.strength)
           {
              
              System.out.print("\t "+name+"  Escaped from"+animal.name+"\n");
            strength=strength-5;
          animal.strength=animal.strength-5;
          if(strength<=0)
          	k=0;
          if(animal.strength<=0)
          	k=1;
           }
         else
           {
            k=0;
            System.out.println("\t  Winner:"+animal.name+" killed "+name);
           } 
      }
      else
      {
      if(strength>animal.strength)
           {
              k=1;
            System.out.println("\t  Winner:"+animal.name+" killed "+name);
              
           }
         else
           {
            System.out.print("\t "+animal.name+"  Escaped from"+name+"\n");
            strength=strength-5;
          animal.strength=animal.strength-5;
          if(strength<=0)
          	k=0;
          if(animal.strength<=0)
          	k=1;
           }
      }
      return k;
    
   }  
}










