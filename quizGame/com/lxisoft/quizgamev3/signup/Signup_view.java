package com.lxisoft.quizgamev2.signup;
import com.lxisoft.quizgamev2.security.*;
import java.util.*;
public class Signup_view
{
	public  Signup_model newreg=new Signup_model();
	public Signup_controller regsetter=new Signup_controller();
	public Scanner st=new Scanner(System.in);
	public void regNew()throws Exception
	{
		
		System.out.println("\t\t\t\t\t::Registration portal::\n\n");
		System.out.print("\n\t\t\t\t\t[ID] : ");newreg.setUserid(st.nextLine());
		System.out.print("\n\t\t\t\t\t[USERNAME] : ");newreg.setUsername(st.nextLine());
		System.out.print("\n\t\t\t\t\t[PASSWORD] : ");newreg.setUserpass(st.nextLine());
		System.out.println("\n\n\n------------ "+newreg.getUsername()+" data Entered Successfuly---------------\n\n");
	regsetter.registrationSetter(newreg.getUserid(),newreg.getUsername(),newreg.getUserpass());//System.out.println("error");}
	}
}