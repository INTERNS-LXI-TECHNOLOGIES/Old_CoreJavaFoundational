import java.util.*;
import java.lang.*;
public class Forest
{
	ArrayList <Animal> animals= new ArrayList <Animal>();
	//ArrayList<Animal> fighters=new ArrayList<Animal>();
	
	public void setDetails()
	{
		String r;
		int X,Y,a,b;
		Random rand= new Random();
		String[][] str=new String[10][10];
		

		System.out.println("\n Welcome To Forest \n");
		for(int i=1;i<=rand.nextInt(2)+1;i++)
		{	
			Animal tiger=new Tiger();
			tiger.name ="  Tiger"+i;
			tiger.strengthLevel=rand.nextInt(100);
			animals.add(tiger);
			System.out.println("Name:"+tiger.name+"\t Strength:"+tiger.strengthLevel);
		}	
	  	for(int i=1;i<=rand.nextInt(2)+1;i++)
		{	
			Animal lion=new Lion();
			lion.name="  Lion"+i;
			lion.strengthLevel=rand.nextInt(100);
			animals.add(lion);
			System.out.println("Name:"+lion.name+"\t Strength:"+lion.strengthLevel);
		}	
		for(int i=1;i<=rand.nextInt(2)+1;i++)
		{	
			Animal deer=new Deer();
			deer.name="  Deer"+i;
			deer.strengthLevel=rand.nextInt(100);
			animals.add(deer);
			System.out.println("Name:"+deer.name+"\t Strength:"+deer.strengthLevel);
		}	
		for(int i=1;i<=rand.nextInt(2)+1;i++)
		{	
			Animal rabbit=new Rabbit();
			rabbit.name="  Rabbit"+i;
			rabbit.strengthLevel=rand.nextInt(100);
			animals.add(rabbit);
			System.out.println("Name:"+rabbit.name+"\t Strength:"+rabbit.strengthLevel);
		}	
		int l=10;
		do
		{
		for(int m=0;m<l;m++)
		{
			for(int n=0;n<l;n++)
			{
				str[m][n]="\t";
			}
		}
			
		int i=0;
		while(i<animals.size())
			{
				X=rand.nextInt(10);
				Y=rand.nextInt(10);
				if(str[X][Y]=="\t")
					{
						str[X][Y]=animals.get(i).name;
						animals.get(i).locationX=X;
						animals.get(i).locationY=Y;
						i++;
					}
			
			}
			for(int m=0;m<l;m++)
				{
					for(int n=0;n<l;n++)
						{
							System.out.print(str[m][n]);

						}
					System.out.println("\n");
				}

				for(int m=0;m<animals.size();m++)
				{
					int X1=animals.get(m).locationX;
					int Y1=animals.get(m).locationY;
					for(int n=m+1;n<animals.size();n++)
					{
						int X2=animals.get(n).locationX;
						int Y2=animals.get(n).locationY;
						if((Math.abs(X1-X2)<=1)&&(Math.abs(Y1-Y2)<=1))
						{
							System.out.print("***************************");
							System.out.println("\n"+animals.get(m).name+" V/S "+ animals.get(n).name);
							System.out.print("***************************");
							r=animals.get(m).fight(animals.get(n));
			  				if(r==null){}
				   				else
			   					{
			   						for(int j=0;j<animals.size();j++)
			   						{
			   							if(animals.get(j).name==r)
										animals.remove(j);
			   						}
									
								}
						}
					//	else
					//		System.out.print("Animals are in safe distance");
					}
				}	
					//System.out.println("Animals Are in safe distance");
					System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");	
		}while(animals.size()>1);
		//for(int s=0;s<animals.size();s++)
		//{
			System.out.println("Survivor is "+animals.get(0).name);
		//}
		}
}