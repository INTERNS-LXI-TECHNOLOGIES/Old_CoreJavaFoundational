package com.lxisoft.moviescript.person;
import java.io.*;
public class NonActor
{
	Director director;
	Producer producer;
	Cameraman cameraman;
	ScriptWriter scriptwriter;
	public NonActor() throws Exception
	{
		director=new Director();
		producer=new Producer();
		cameraman=new Cameraman();
		scriptwriter=new ScriptWriter();
	}
	public void nonactorDataView() throws Exception
	{
		director.directorDataView();
		producer.producerDataView();
		cameraman.cameramanDataView();
		scriptwriter.scriptwriterDataView();
	}
	
}