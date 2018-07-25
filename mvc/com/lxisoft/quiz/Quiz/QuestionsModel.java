package com.lxisoft.quiz.Quiz;
public class QuestionsModel{
	private String que,option1,option2,option3,option4;
	public void setque(String s){
		que = s;
	}
	public void setoption1(String s){
		option1 =s;
	}
	public void setoption2(String s){
		option2 =s;
	}
	public void setoption3(String s){
		option3 =s;
	}
	public void setoption4(String s){
		option4 =s;
	}
	public String getque(){
		return que;
	}
	public String getoption1(){
		return option1;
	}
	public String getoption2(){
		return option2;
	}
	public String getoption3(){
		return option3;
	}
	public String getoption4(){
		return option4;
	}
}