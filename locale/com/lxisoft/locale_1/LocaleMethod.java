package com.lxisoft.locale_1;
import java.util.*;

public class LocaleMethod{


public static void main(String[] args){

	Locale l1=Locale.getDefault();
	System.out.println(l1.getDefault().getDisplayCountry()+" "+l1.getDefault().getDisplayLanguage());

	Locale l2=new Locale("en","IN");
	Locale.setDefault(l2);
	System.out.println(Locale.getDefault().getDisplayCountry()+" "+Locale.getDefault().getDisplayLanguage());
}
}  