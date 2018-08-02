package com.lxisoft.metrov2.test;
import com.lxisoft.metrov2.metro.Metro;
public class Tdd
{
	public static void main(String args[])
	{
		Metro st=new Metro();
		Metro board=new Metro();
		Metro dest=new Metro();
		st.station();
		board.boarding();
		dest.destination();
	}
}