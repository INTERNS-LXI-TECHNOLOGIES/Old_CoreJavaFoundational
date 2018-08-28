package com.lxisoft.moviescript.cast;


public class SupportingActor extends Cast
{
	public SupportingActor()
	{
		String[] db={"heroic","comic","villanious"};
		int[] size={25,18,9};
		int rand=(int)Math.random()*2;
		setTableName(db[rand]);
		setTableSize(size[rand]);
	}
}