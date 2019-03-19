import java.util.Random;
public class Forest
{

 Random rand=new Random();
 Lion lion= new Lion();
 Tiger tiger=new Tiger();
 Snake snake=new Snake();
 Rabbit rabbit=new Rabbit();
 Eagle eagle=new Eagle();

int lio = rand.nextInt(60);
int tig = rand.nextInt(40);
int sna = rand.nextInt(30);
int rabbi=rand.nextInt(15);
int eagi= rand.nextInt(30);
 
 	/*lion.setStrengthLevel(lio);
 	tiger.setStrengthLevel(tig);
 	snake.setStrengthLevel(sna);
    rabbit.setStrengthLevel(rabbi);
    eagle.setStrengthLevel(eagi);*/
public void forestDisplay()
{
	System.out.print("Fight BEGINS...");
    if(lio>tig&&lio>sna&&lio>rabbi&&lio>eagi)
    {
    	System.out.println("\nLion Wins !");
    } 
      else if(tig>lio&&tig>sna&&tig>rabbi&&tig>eagi)
      {
      	System.out.println("\nTiger Wins!");
      }
      else if(sna>lio&&sna>tig&&tig>rabbi&&sna>eagi)
      {
      	System.out.println("\nSnake Wins!");
      }
      else if(eagi>lio&&eagi>tig&&eagi>sna&&eagi>rabbi)
      {
      	System.out.println("\nEagle Wins!");
      }
      
 



} 
}