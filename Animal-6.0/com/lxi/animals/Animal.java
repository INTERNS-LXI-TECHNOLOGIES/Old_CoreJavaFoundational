package com.lxi.animals;
import java.util.*;
import com.lxi.types.*;

public abstract class Animal 
{
	public int strength;
	public String name;
	public int locationX,locationY;
    public abstract String fight(Animal animal);

 }