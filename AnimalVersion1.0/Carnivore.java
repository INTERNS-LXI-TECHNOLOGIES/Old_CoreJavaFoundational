public class Carnivore extends Animal{

    CarnivoreType type;


    Carnivore() {

        
    }

    public void eat(Animal e){
        
        System.out.println(this.getType() + " eats " + ((Herbivore)e).getType());
    }

    public void fight(Animal e){

        System.out.println(this.getType() + " fights " + ((Carnivore)e).getType());
    }

    // Setters and Getters

	public CarnivoreType getType()
	{
		return this.type;
	}

	public void setType(CarnivoreType type)
	{
		this.type = type;
	}

       
       
        
    }


