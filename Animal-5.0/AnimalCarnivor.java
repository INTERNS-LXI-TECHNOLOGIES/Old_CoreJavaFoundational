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
	 public String fight(Animal animal)
    {    
    String k="null";
      if((this instanceof Carnivor)&&(animal instanceof Carnivor) )
         {
          
          //System.out.println("\t  Hunted each other!");
          this.eat(animal);
          strength=strength-20;
          animal.strength=animal.strength-20;
          if(strength<=0)
          	k=name;
          if(animal.strength<=0)
          	k=animal.name;
         }
     else if((this instanceof Herbivor)&&(animal instanceof Herbivor))
         {
          
          System.out.println("\t  Goes away!");
          strength=strength-5;
          animal.strength=animal.strength-5;
          if(strength<=0)
          	k=name;
          if(animal.strength<=0)
            k=animal.name;
         }

     else if((this instanceof Herbivor)&&(animal instanceof Carnivor))
     {
         if(strength>animal.strength)
           {
              
              System.out.print("\t "+name+"  Escaped from"+animal.name+"\n");
            strength=strength-10;
          animal.strength=animal.strength-5;
          if(strength<=0)
          	 k=name;
          if(animal.strength<=0)
            k=animal.name;
           }
         else
           {
             k=name;
            System.out.println("\t  Winner:"+animal.name+" killed "+name);
           } 
      }
      else
      {
      if(strength>animal.strength)
           {
             k=animal.name;
            System.out.println("\t  Winner:"+name+" killed "+animal.name);
              
           }
         else
           {
            System.out.print("\t "+animal.name+"  Escaped from "+name+"\n");
            strength=strength-5;
          animal.strength=animal.strength-5;
          if(strength<=0)
          	k=name;
          if(animal.strength<=0)
            k=animal.name;
      }
    }
      return k;
    
   }  
}










