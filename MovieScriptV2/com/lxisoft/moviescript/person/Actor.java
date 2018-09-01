package com.lxisoft.moviescript.person;
import java.io.*;
public class Actor
{
	private Hero hero;
	private Heroine heroine;
	private Comedian comedian;
	private Villain villain;
	public Actor() throws Exception
	{
		hero=new Hero();
		heroine=new Heroine();
		comedian=new Comedian();
		villain=new Villain();
	}
	public void actorDataView() throws Exception
	{
		hero.heroDataView();
		heroine.heroineDataView();
		comedian.comedianDataView();
		villain.villainDataView();
	}
}