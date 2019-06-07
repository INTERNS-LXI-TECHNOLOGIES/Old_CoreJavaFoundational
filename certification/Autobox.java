class Autobox{

public static void main(String[] args){	
int x=128;
Integer i=new Integer(x);
//autoboxing
Integer y=127;
Integer y1=127;
//new Integer(1000);object is created automatically.
//unboxing
int x1=new Integer(128);;
if(x.equals(x1))
{
	System.out.println("equal");
}
else   
{
	System.out.println("not equal");
}
}
}