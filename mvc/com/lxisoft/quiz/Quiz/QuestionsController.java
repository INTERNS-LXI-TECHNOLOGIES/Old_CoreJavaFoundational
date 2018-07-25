package com.lxisoft.quiz.Quiz;

import com.lxisoft.quiz.User.*;
import com.lxisoft.quiz.Quiz.*;
import java.io.*;
import java.util.*;

public class QuestionsController{
	public String que,option1,option2,option3,option4;
	public QuestionsController(String[] str){
		
		QuestionsModel qm = new QuestionsModel();
		int len=0;																																																																																																																																																																																																																																																																																																							;
        len=str.length;
		for(int i=0;i<len;i++){
		switch(i){
			case 0: qm.setque(str[i]);
			        que = qm.getque();
					break;
			case 1: qm.setoption1(str[i]);
			        option1 = qm.getoption1();
					break;
			case 2: qm.setoption2(str[i]);
			        option2 = qm.getoption2();
					break;
			case 3: qm.setoption3(str[i]);
			        option3 = qm.getoption3();
					break;
			case 4: qm.setoption4(str[i]);
			        option4 = qm.getoption4();
					break;
	}
	}
	}
}