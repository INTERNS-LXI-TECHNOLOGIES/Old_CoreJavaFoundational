package com.lxisoft.quize.Quize;
import com.lxisoft.quize.User.*;
import java.io.*;
import java.util.*;

public class Questions{
public 	String que,option1,option2,option3,option4;
	public Questions(String[] str){
	int len=0;																																																																																																																																																																																																																																																																																																							;
    len=str.length;
	for(int i=0;i<len;i++){
		switch(i){
			case 0: que = str[i];break;
			case 1: option1 = str[i];break;
			case 2: option2 = str[i];break;
			case 3: option3 = str[i];break;
			case 4: option4 = str[i];break;
	}
	}
	}
}