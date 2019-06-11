import java.util.*;
class T
{
	public static void main(String args[]) 
	{
    	PriorityQueue<Integer> q = new PriorityQueue<Integer>(15);
    	q.offer(4);
    	q.offer(5);
    	q.offer(9);
    	q.offer(6);

    	System.out.println(q);

    	while (!q.isEmpty()) 
    	{
    	Integer i = q.poll();
    	System.out.println("I : "+i);
    	}
	}
}