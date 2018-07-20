package com.lxisoft.culturalevaluation.question;
import com.lxisoft.culturalevaluation.user.*;
public class Questioncontroler
{
	private Questionmodel quemod;
	private Questionview queview;
	public Questioncontroler()
	{
		quemod.loadqueFile();
		quemod.askQuestion();
		quemod.printResult();
	}
}