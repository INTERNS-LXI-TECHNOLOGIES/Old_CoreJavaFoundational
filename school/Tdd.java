public class Tdd
{
	public static void main( String args[])
	{
		School s1= new School();
		s1.name= "knmvhss";
		s1.ID= 12;
		s1.c.div="A";
		s1.c.std= 7;
		
		s1.c.t1.ID= 32;
		s1.c.t1.name= "mandhippp";
		
		s1.c.t1.st.ID=35;
		s1.c.t1.st.name= "kokkachi";
		
		System.out.println(" \nschool -- "+ s1.name +" \n school ID--" + s1.ID +" \n STD --"+s1.c.std +"\n DIV--"+s1.c.div +"\n Teacher in charge--"+s1.c.t1.name+"\n Student in present--"+s1.c.t1.st.name);
	}
}