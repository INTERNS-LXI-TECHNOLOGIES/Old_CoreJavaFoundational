public class Test {
    public static void main(String[] args) {
        
    
    Animal h = new Herbivore();
    ((Herbivore)h).setType(HerbivoreType.DEER);

    Animal i = new Herbivore();
    ((Herbivore)i).setType(HerbivoreType.RABBIT);
    
    Animal c = new Carnivore();
    ((Carnivore)c).setType(CarnivoreType.LION);


    Animal d = new Carnivore();
    ((Carnivore)d).setType(CarnivoreType.TIGER);

    ((Carnivore)c).fight(d);

    ((Carnivore)c).eat(h);
    ((Carnivore)d).eat(h);

    ((Carnivore)c).eat(i);
    ((Carnivore)d).eat(i);


    }
}