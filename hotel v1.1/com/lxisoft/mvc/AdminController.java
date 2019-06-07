package com.lxisoft.mvc;
import com.lxisoft.hotel.*;
import com.lxisoft.mvc.*; 
import java.util.ArrayList;
public class AdminController
{

public AdminModel am=new AdminModel();
public AdminView av=new AdminView();

public void passing (ArrayList<Food> foods)
{
	av.choose(foods);
}
}