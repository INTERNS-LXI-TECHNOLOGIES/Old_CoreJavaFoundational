package com.lxisoft.map;
interface MapRepository<K,V>{
	
public void create(K data,V data1);
public void read();
public void update(K data,V data1);
public void delete(K data);
public void sort();
}