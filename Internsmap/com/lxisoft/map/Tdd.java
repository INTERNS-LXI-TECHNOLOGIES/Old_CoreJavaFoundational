package com.lxisoft.map;
import java.util.*;
public class Tdd{

	public static void main(String[] args){

// 		MapRepository<Integer,String> mp=new TreeMapStore<Integer,String>();

// mp.create(4,"riya");
// mp.create(3,"mithya");
// mp.create(2,"ayisha");
// mp.create(1,"priya");
// mp.read();
// mp.update(1,"keerthi");
// mp.delete(4);
// mp.sort();
  		
//   		MapRepository<Integer,Integer> mp=new LinkedHashMapStore<Integer,Integer>();

// mp.create(4,110);
// mp.create(3,100);
// mp.create(2,102);
// mp.create(1,200);
// mp.read();
// mp.update(1,300);
// mp.delete(4);
// mp.sort();
		
		MapRepository<Integer,Intern> mp=new LinkedHashMapStore<Integer,Intern>();

Intern int1 = new Intern("madhu");
Intern int2 = new Intern("arya");
Intern int3 = new Intern("veena");
Intern int4 = new Intern("kiran");
Intern int5 = new Intern("sawthi");
mp.create(4,int1);
mp.create(3,int2);
mp.create(2,int3);
mp.create(1,int4);
mp.read();
mp.update(1,int5);
mp.delete(4);
mp.sort();
}
}