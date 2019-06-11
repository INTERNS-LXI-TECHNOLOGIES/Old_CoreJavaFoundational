import java.util.*;
class T
{
	public static void main(String args[]) 
	{
    	PriorityQueue<Integer> q = new PriorityQueue<Integer>(10);
    	q.offer(9);
    	q.offer(2);
    	q.offer(8);
    	q.offer(6);

    	System.out.print(q);
	}
}