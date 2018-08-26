package com.lxisoft.movieScript.movieScript;

import com.lxisoft.movieScript.actors.*;
import java.util.*;

public class MovieScript{
	private static final ArrayList<Hero> actors = new ArrayList<Hero>();
	private static final ArrayList<Heroin> actress = new ArrayList<Heroin>();
	private static final ArrayList<Comedian> comedy = new ArrayList<Comedian>();
	
    public void addHero(Hero obj){
		 actors.add(obj);
	}
	
	public void addHeroin(Heroin obj){
		actress.add(obj);
	}
	
	public void addComedian(Comedian obj){
		comedy.add(obj);
	}
	
	public void check(int num1,int num2,int num3){
		System.out.println("\n\n-----Details of heros------\n\n");
		    for(int i=0;i<num1;i++){
		   System.out.println(actors.get(i).getHeroName()+"\n"); 
			}
		System.out.println("\n\n-----Details of heroins------\n\n");
		    for(int i=0;i<num2;i++){
		System.out.println(actress.get(i).getHeroinName()+"\n"); 
			}
		System.out.println("\n\n-----Details of Comedians------\n\n");
		    for(int i=0;i<num3;i++){
		System.out.println(comedy.get(i).getComedianName()+"\n"); 
			}
	}
}