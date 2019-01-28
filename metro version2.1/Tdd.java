import java.util.Scanner;
public class Tdd
{
public static void main(String args[])
{
	 Train[] train  = new Train[2];
	 train[0] = new Train();
			train[0].name = "shatabdi express";
			train[0].number=1234;
			train[0].setTrainDetails();
			
		    train[1]= new Train();
			train[1].name = "sowparnika express";
			train[1].number=9876;
			train[1].setTrainDetails();

}	        
}