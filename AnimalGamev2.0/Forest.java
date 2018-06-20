import java.util.Random;

public class Forest
{
 public static Animals[][] grid= new Animals[6][6];
 public static Lion[] l=new Lion[10];
 public static Tiger[] t=new Tiger[10];
 public static Deer[] d= new Deer[10];
 public static Elephant[] e=new Elephant[10];
 public static int deadCount=0;


 void assign(int lio,int tig,int der,int ele)
 {
  for(int i=0;i<6;i++)
   for(int j=0;j<6;j++)
   {
	Forest.grid[i][j]=null;
   }
   
  for(int i=0;i<lio;i++)
     l[i]= new Lion(i);
    
  for(int i=0;i<tig;i++)
     t[i]= new Tiger(i);
  
  for(int i=0;i<der;i++)
     d[i]= new Deer(i);
 
 for(int i=0;i<ele;i++)
    e[i]= new Elephant(i);

 System.out.println("\nInitial Animal placements : \n");

 for(int i=0;i<6;i++)
  {
   for(int j=0;j<6;j++)
   {
	if(Forest.grid[i][j]!=null)
	  System.out.print("\t"+Forest.grid[i][j].id+"  ");
    else
	  System.out.print("\t0\t");
   }
   System.out.println("\n\n\n");
  } 
  
  
  for(int i=0;i<6;i++)
   for(int j=0;j<6;j++)
   {
    if(Forest.grid[i][j]!=null && Forest.grid[i][j].carnivore)
    {
	 Forest.grid[i][j].canRoam();
	}
   }
 }
}