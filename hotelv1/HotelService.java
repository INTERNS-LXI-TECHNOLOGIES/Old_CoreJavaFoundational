package com.lxisoft.hotelv1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.util.Comparator;
import java.io.*;
public class HotelService
{
	public void storeDetails(ArrayList <Food> foods)throws Exception
	{
	Repository repository=new Repository();
	repository.writeToFile(foods);
	}
	public void displayDetails(ArrayList <Food> foods)throws Exception
	{
		Repository repository=new Repository();
		repository.readFromFile(foods);
	}
}