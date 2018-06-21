import java.util.Random;
import java.util.ArrayList;

public class Forest {
	
	int m;
	private Animal[][] animalPositions = new Animal[10][10];
	Random rand = new Random();
	private ArrayList<Lion> L = new ArrayList<Lion>();
	private ArrayList<Tiger> T = new ArrayList<Tiger>();
	private ArrayList<Deer> D = new ArrayList<Deer>();
	private ArrayList<Zebra> Z = new ArrayList<Zebra>();
	Forest(int i,int j,int k,int l){
		
		for(m=0; m<l; m++)
		{
			L.add(new Lion(rand.nextInt(10),rand.nextInt(10), 5, rand.nextInt(10),rand.nextInt(10),'C'));
		}
		
		for(m=0; m<j; m++)
		{
			T.add(new Tiger(rand.nextInt(10),rand.nextInt(10), 5, rand.nextInt(10),rand.nextInt(10), 'C'));
		}
		
		for(m=0; m<k; m++)
		{
			D.add(new Deer(rand.nextInt(10),rand.nextInt(10), 5, rand.nextInt(10),rand.nextInt(10), 'C'));
		}
		
		for(m=0; m<l; m++)
		{
			Z.add(new Zebra(rand.nextInt(10),rand.nextInt(10), 5, rand.nextInt(10),rand.nextInt(10), 'C'));
		}
	
		for(i=0;i<10;i++)
			for(j=0;j<10;j++)
				animalPositions[i][j]=null;
			
	}
	void AnimalPlacement(Animal a) {
		animalPositions[a.getLocationX()][a.getLocationY()] = a;
		//System.out.println(a.Fname +"\n");
	}
	Animal[][] AnimalPos(){
		for(m=1;m<L.size();m++) 
			AnimalPlacement(L.get(m));
		for(m=1;m<D.size();m++) 
			AnimalPlacement(D.get(m));
		for(m=1;m<T.size();m++) 
			AnimalPlacement(T.get(m));
		for(m=1;m<Z.size();m++) 
			AnimalPlacement(Z.get(m));
		return animalPositions;	
	}
		
	//hunger
	boolean isHungry(Animal a)
	{
		if(a.getHunger()>5)
			return true;
		else 
			return false;
	}
	//if the animal can walk
	boolean isStrong(Animal a)
	{
		if(a.getStrength()<3)
			return true;
		else
			return false;
	}
	//finding the stronger
	boolean battle(Animal a,Animal b)
	{
		if((a.getStrength() > b.getStrength()))
			return true;
		else
			return false;
	}
	
	//X limit check
	boolean checkXLimit(Animal a)
	{
		if((a.getLocationX()-a.getRoaming())<0)
			return true;
		else 
			return false;
	}	
	boolean checkYLimit(Animal a)
	{
		if((a.getLocationY()-a.getRoaming())<0)
			return true;
		else 
			return false;
	}	
	//set value for k
	int setK(Animal a)
	{
		if(checkXLimit(a))
			return 0;
		else
			return (a.getLocationX()-a.getRoaming());
	}
	// set value for l
	int setL(Animal a)
	{
		if(checkYLimit(a))
			return 0;
		else
			return (a.getLocationY()-a.getRoaming());
	}
	//boolean inRange()
	Animal[][] Fight(Animal[][] a)
	{
		int k,l;
		Animal test,test2 = null;
		for(int i=0;i<10;i++)
			for(int j=0;j<10;j++) 
			{
				if(a[i][j]!=null) 
				{
					test=a[i][j];
					k=setK(test);
					l=setL(test);
					for(;(k<=(test.getLocationX()+test.getRoaming()))&&(k<10);k++) 
					{
						for(;(l<=(test.getLocationY()+test.getRoaming()))&&(l<10);l++) 
						{
							if(a[k][l]!=null) 
							{
								test2=a[k][l];							 	
								if(isHungry(test) && isStrong(test)) 
								{
									if(battle(test,test2)&&(test.getType()=='C')) 
									{
										a[i][j].setHunger((a[i][j].getHunger()-1));
										a[k][l]=null;
									}
									else 
									{
										a[i][j]=null;
									}
								}		
							}
						}
					}
				}		
			}
		return a;
	}
	void AnimalPresence(Animal[][] Location)
	{
		for(int i=0;i<10;i++) 
		{
			for(int j=0;j<10;j++)
				if(Location[i][j]!=null)
					System.out.print(Location[i][j].name+" ");
				else 
					System.out.print("0 ");
			System.out.println();
		}
	}
}