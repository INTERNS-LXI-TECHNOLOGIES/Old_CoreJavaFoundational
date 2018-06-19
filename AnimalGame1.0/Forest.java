import java.io.*;

public class Forest{
	
	public static Animal[][] a=new Animal[7][7];
	public static Zebra[] z=new Zebra[20];
	public static Tiger[] T=new Tiger[20];
	public static Lion[] L=new Lion[20];
	public static Deer[] D=new Deer[20];
	public static Rabbit[] R= new Rabbit[20];
	int f=0,sur=0;
	public Forest(){
	for(int i=0;i<7;i++){
		for(int j=0;j<7;j++){
			a[i][j]=null;
		}
	}
	for(int i=0;i<5;i++){
		z[i]=new Zebra(i);
	}
	
	for(int i=0;i<6;i++)
	    {
		   T[i]=new Tiger(i);
	    }
	
	for(int i=0;i<7;i++)
	    {
		   L[i]=new Lion(i);
	    }
	
	for(int i=0;i<8;i++)
	    {
		   D[i]=new Deer(i);
	    }
	
	
	for(int i=0;i<4;i++)
	    {
		   R[i]=new Rabbit(i);
	    }
		
	outGrid();
		
	for(int i=0;i<6;i++){
		T[i].check();
	}
    for(int i=0;i<7;i++){
		L[i].check();
	}
	}	
		
    
	public void outGrid()
	{   
		for(int i=0;i<7;i++){
			for(int j=0;j<7;j++){
				if(a[i][j]!=null){
					System.out.print("\t"+a[i][j].name+"  ");
					f++;
				}
				else{
					System.out.print("\t0\t");
				}
			}
			System.out.println("\n\n\n");
		}
		
		
	}
	public void finalStatus(){
		sur=Math.abs(30-f);
		System.out.println("TOTAL INITIAL NUMBER OF ANIMALS 30");
		System.out.println("TOTAL NUMBER OF ANIMALS SURVIVED "+sur);
	}
	
}
