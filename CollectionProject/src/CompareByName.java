/**
*@author AJAY E.S

*Page for Comparator for sorting  using name in Intern
**/	
import java.util.Comparator;
	 
	public class CompareByName implements Comparator<Intern> {
	    @Override
	    public int compare(Intern o1, Intern o2) {
	        return o1.getName().compareTo(o2.getName());
	    }
	}