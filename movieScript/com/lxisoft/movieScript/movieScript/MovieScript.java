package com.lxisoft.movieScript.movieScript;

import com.lxisoft.movieScript.actors.*;
import java.util.*;

public class MovieScript{
	ArrayList<Hero> actors;
	
	public MovieScript(){
	actors = new ArrayList<Hero>();
	}
	
    public void add(Hero obj){
		 actors.add(obj);
	}
	
	public void check(){
		    for(int i=0;i<2;i++){
				System.out.println("\n");
			System.out.println(actors.get(i).getHeroName());
	}
	}
}