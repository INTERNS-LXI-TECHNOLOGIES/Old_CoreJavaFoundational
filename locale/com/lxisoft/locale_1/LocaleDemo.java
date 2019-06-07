package com.lxisoft.locale_1;
import java.util.Locale;  
import java.util.ResourceBundle; 
public class LocaleDemo{


public static void main(String[] args){

	//String lang = "ka";
	//String country = "IN";

	Locale l = new Locale("ka","IN");
	ResourceBundle r = ResourceBundle.getBundle("com/lxisoft/locale_1/Bundle_ka_IN");

	String str = r.getString("wish");
	System.out.println(str);
	System.out.println("************");
}

}