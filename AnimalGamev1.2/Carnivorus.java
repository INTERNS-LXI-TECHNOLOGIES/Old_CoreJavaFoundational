import java.io.*;
import java.util.*;
public interface Carnivorus{
	public void fight(Animal f,Animal d);
	public void eats(Animal f,Animal d);
	public void killed(Animal f,Animal d);
}