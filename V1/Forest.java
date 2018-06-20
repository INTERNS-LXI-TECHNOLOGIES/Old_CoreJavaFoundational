import java.util.Random;

public class Forest {
	
	Animal[][] animalPositions = new Animal[10][10];
	Random rand = new Random();
	Lion[] L= new Lion[4];
	Tiger[] T = new Tiger[4];
	Deer[] D = new Deer[4];
	Zebra[] Z = new Zebra[4];
	Forest(){
		
		L[0] = new Lion(rand.nextInt(10),rand.nextInt(10), 5, rand.nextInt(10),rand.nextInt(10), 'C');
		L[1] = new Lion(rand.nextInt(10),rand.nextInt(10), 5, rand.nextInt(10),rand.nextInt(10), 'C');
		L[2] = new Lion(rand.nextInt(10),rand.nextInt(10), 5, rand.nextInt(10),rand.nextInt(10), 'C');
		L[3] = new Lion(rand.nextInt(10),rand.nextInt(10), 5, rand.nextInt(10),rand.nextInt(10), 'C');
		
		T[0] = new Tiger(rand.nextInt(10),rand.nextInt(10), 5, rand.nextInt(10),rand.nextInt(10), 'C');
		T[1] = new Tiger(rand.nextInt(10),rand.nextInt(10), 5, rand.nextInt(10),rand.nextInt(10), 'C');
		T[2] = new Tiger(rand.nextInt(10),rand.nextInt(10), 5, rand.nextInt(10),rand.nextInt(10), 'C');
		T[3] = new Tiger(rand.nextInt(10),rand.nextInt(10), 5, rand.nextInt(10),rand.nextInt(10), 'C');
		
		D[0] = new Deer(rand.nextInt(10),rand.nextInt(10), 2, rand.nextInt(10),rand.nextInt(10), 'H');
		D[1] = new Deer(rand.nextInt(10),rand.nextInt(10), 2, rand.nextInt(10),rand.nextInt(10), 'H');
		D[2] = new Deer(rand.nextInt(10),rand.nextInt(10), 2, rand.nextInt(10),rand.nextInt(10), 'H');
		D[3] = new Deer(rand.nextInt(10),rand.nextInt(10), 2, rand.nextInt(10),rand.nextInt(10), 'H');
		
		Z[0] = new Zebra(rand.nextInt(10),rand.nextInt(10), 4, rand.nextInt(10),rand.nextInt(10), 'H');
		Z[1] = new Zebra(rand.nextInt(10),rand.nextInt(10), 4, rand.nextInt(10),rand.nextInt(10), 'H');
		Z[2] = new Zebra(rand.nextInt(10),rand.nextInt(10), 4, rand.nextInt(10),rand.nextInt(10), 'H');
		Z[3] = new Zebra(rand.nextInt(10),rand.nextInt(10), 4, rand.nextInt(10),rand.nextInt(10), 'H');
	
		for(int i=0;i<10;i++)
			for(int j=0;j<10;j++)
				animalPositions[i][j]=null;
			
		}
		void AnimalPlacement(Animal a) {
			animalPositions[a.locx][a.locy] = a;
		}
		Animal[][] AnimalPos(){
			for(int i=0;i<4;i++) {
				AnimalPlacement(L[i]);
				AnimalPlacement(D[i]);
				AnimalPlacement(T[i]);
				AnimalPlacement(Z[i]);
			}
			return animalPositions;	
		}

		Animal[][] Fight(Animal[][] a){
			int k,l;
			Animal test,test2 = null;
			for(int i=0;i<10;i++)
				for(int j=0;j<10;j++) {
					if(a[i][j]!=null) {
						test=a[i][j];
						if((test.locx-test.roaming)<0)
							k=0;
						else
							k=test.locx-test.roaming;
						if((test.locy-test.roaming)<0)
							l=0;
						else
							l=test.locy-test.roaming;
						for(;(k<=(test.locx+test.roaming))&&(k<10);k++) {
							for(;(l<=(test.locy+test.roaming))&&(l<10);l++) {
								if(a[k][l]!=null) {
									test2=a[k][l];
								 	
									if((test.hunger>5)&&(test.strength>3)) {
										if((test.strength > test2.strength)&&(test.Type=='C')) {
											a[i][j].hunger--;
											a[k][l]=null;
										}
										else {
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
}