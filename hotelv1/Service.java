package com.lxisoft.hotelv1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.util.Comparator;
import java.io.*;
public class Service
{
	Repository repository;
	public void storeFood(HotelController controller,ArrayList <Food> foods,Service service)throws Exception
	{
		controller.storeFood(controller,foods,service);
	}
	public void display(HotelController controller,ArrayList <Food> foods,Service service)throws Exception
	{
		 repository=new Repository();
		repository.storeFood(controller,foods,service);
	}
	/*public void printDetails(ArrayList <Food> foods)throws Exception
	{
		Repository repository;
		repository.readFromFile(foods);
	}*/
}