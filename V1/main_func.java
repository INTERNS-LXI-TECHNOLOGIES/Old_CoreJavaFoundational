public class main_func {
	
	public static void main(String args[]) {
		
		int count=0,i,j;
		Animal[][] Location= new Animal[10][10];
		Forest f = new Forest();
		Location = f.AnimalPos();
		
		//Testing placement of animals
		/*for(i=0;i<10;i++) {
			for(j=0;j<10;j++)
				if(Location[i][j]!=null)
					System.out.print(Location[i][j].name+" ");
				else 
					System.out.print("0 ");
			System.out.println();
		}*/
		Location = f.Fight(Location);
		for(i=0;i<10;i++)
			for(j=0;j<10;j++)
				if(Location[i][j]!=null)
					count++;
		System.out.println("NO.OF ANIMALS SYILL ALIVE = "+count);
		
		//Checking the final result
		/*for(i=0;i<10;i++) {
			for(j=0;j<10;j++)
				if(Location[i][j]!=null)
					System.out.print(Location[i][j].name+" ");
				else 
					System.out.print("0 ");
			System.out.println();
		}*/
	}
}
