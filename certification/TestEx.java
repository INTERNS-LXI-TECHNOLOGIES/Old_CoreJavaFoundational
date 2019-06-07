class TestEx {
public static void main (String [] args) {
doStuff();
}
static void doStuff() {
doMoreStuff();
}
static void doMoreStuff() {
	try{
int x = 5/0; // Can't divide by zero!
// ArithmeticException is thrown here
}
catch(ArithmeticException e){}
}
}
