import java.util.*;


class test
{
	public static void hello(int a)
	{
		System.out.println(a);
	}
	
}

class ttt
{
		
	public static void main(String[] args)
	{
		test t = new test();
		new Random().ints(10,0,20).forEach(t::hello);
	}
}