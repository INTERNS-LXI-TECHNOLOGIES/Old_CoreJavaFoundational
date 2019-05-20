package com.lxisoft.eg;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Sort implements Comparator<Eg>
{
	public int compare(Eg e1,Eg e2)
	{
		return e1.brand.compareTo(e2.brand);
	}
}