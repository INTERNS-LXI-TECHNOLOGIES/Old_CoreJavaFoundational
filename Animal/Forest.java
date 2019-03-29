import java.util.*;
public class Forest
{
	ArrayList <Animal> animals= new ArrayList <Animal>();
	
	public void setDetails()
	{
		Integer r;
		int j,x,y;
		Random rand= new Random();
		String[][] str=new String[10][10];

		System.out.println("\n Welcome To Forest \n");
		for(int i=1;i<=rand.nextInt(4)+1;i++)
		{	
			Animal tiger=new Tiger();
			tiger.name ="Tiger";
			tiger.strengthLevel=rand.nextInt(100);
			animals.add(tiger);
			System.out.println("Name:"+tiger.name+i+"\t Strength:"+tiger.strengthLevel);

		//}	
		//for(int i=1;i<=rand.nextInt(3)+1;i++)
		//{	
			Animal lion=new Lion();
			lion.name="Lion";
			lion.strengthLevel=rand.nextInt(100);
			animals.add(lion);
			System.out.println("Name:"+lion.name+i+"\t Strength:"+lion.strengthLevel);
		//}	
		//for(int i=1;i<=rand.nextInt(3)+1;i++)
		//{	
			Animal deer=new Deer();
			deer.name="Deer";
			deer.strengthLevel=rand.nextInt(100);
			animals.add(deer);
			System.out.println("Name:"+deer.name+i+"\t Strength:"+deer.strengthLevel);
		//}	
		//for(int i=1;i<=rand.nextInt(3)+1;i++)
		//{	
			Animal rabbit=new Rabbit();
			rabbit.name="Rabbit";
			rabbit.strengthLevel=rand.nextInt(100);
			animals.add(rabbit);
			System.out.println("Name:"+rabbit.name+i+"\t Strength:"+rabbit.strengthLevel);
		}	
			
		int l=10,i=0;
		//for(i=0;i<animals.size();i++)
		if(i<animals.size())
		{
		 for(int m=0;m<l;m++)
			{
			for(int n=0;n<l;n++)
			{
				str[m][n]="\t";
				x=rand.nextInt(10);
				y=rand.nextInt(10);
				if((n==y)&&(m==x))
					{
						str[m][n]=animals.get(i).name;
						//System.out.print(str[m][n]);
					}
				
				System.out.print(str[m][n]);
			}
			System.out.println("\n");
		}i++;
		}



		while(animals.size()>1)
			{
				Collections.shuffle(animals);
				System.out.println("\n"+animals.get(0).name +" V/S "+ animals.get(1).name);
				r=animals.get(0).fight(animals.get(1));

			   if(r==null){}
			   	else
			   	{
			   	int m=(Integer)r;
				animals.remove(m);}
				for(j=0;j<animals.size();j++)
					{
						System.out.println("Name:"+animals.get(j).name);
					}

			}
			System.out.println("Survivor is "+animals.get(0).name);
			
	}
}