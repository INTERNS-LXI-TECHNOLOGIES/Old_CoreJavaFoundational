package com.lxisoft.movieScript.dialoguemaker;
import java.util.*;
public class DialogueMaker_view{
	Scanner sc,sc2;
	DialogueMaker_controller controller;
	public DialogueMaker_view()throws Exception
	{	controller=new DialogueMaker_controller();
		sc=new Scanner(System.in);sc2=new Scanner(System.in);
		do{System.out.println("Enter the type of genre from the list:");
		System.out.println("|1.hero|\t\t|2.heroine|\t\t|3.villain|\t\t|4.comdeian|\t\t|0.exit|");
		System.out.println("Enter name of person(press enter to dialogue)");
		controller.dialogueMaker(sc.nextInt(),sc2.nextLine());
		}
		while(true);
		}

	}