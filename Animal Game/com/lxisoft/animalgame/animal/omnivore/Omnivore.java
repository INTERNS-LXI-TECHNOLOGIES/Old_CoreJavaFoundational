package com.lxisoft.animalgame.animal.omnivore;
public interface Omnivore{
	public String hunt(String animalOne,String animalTwo);
	public int luck();
	public void setBullets(int bullets);
	public int getBullets();
}