/**
*@author AJAY E.S

*Page for Tdd 
**/	
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tdd {
	private static final Logger log=Logger.getLogger(Tdd.class.getName());
	public Tdd(){
		log.setLevel(Level.WARNING);
	}
public static <T> void main(String[] args) {
	CollectionSelector cs=new CollectionSelector();
	log.info("Going to collectionselector page");
	cs.displayer();
}
}
