package com.lxisoft.hotelv1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.util.Comparator;
import java.io.*;
public class Service
{
	public void storeFood(HotelController controller,ArrayList <Food> foods,Service service,Repository repository)throws Exception
	{
		controller.storeFood(controller,foods,service,repository);
	}
	public void display(HotelController controller,ArrayList <Food> foods,Service service,Repository repository)throws Exception
	{
		 //repository=new Repository();
		repository.storeFood(controller,foods,service,repository);
	}
	/*public void printDetails(ArrayList <Food> foods)throws Exception
	{
		Repository repository;
		repository.readFromFile(foods);
	}*/
}