package com.lxisoft.InternsLXI;
import java.util.*;
public class HashSetStore implements CollectionRepository{

Set<Intern> hs = new HashSet<Intern>();

public void create(){
	hs.add(new Intern("abu","q",12));
	hs.add(new Intern("ayan","e",14));
}

}