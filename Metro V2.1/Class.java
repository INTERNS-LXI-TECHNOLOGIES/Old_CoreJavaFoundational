public class Class{
	String name;
	int price;
	String classOneA = "1A (AC First Class)";
	String classtwoA = "2A (AC 2-Tier)";
	String classthreeA = "3A (Ac 3-Tier)";
	String classFC = "FC (First Class)";
	String classCC = "CC (AC Chair Car)";
	String classSL = "SL (Sleeper)";
	String classTwoS = "2S (Second Sitting)";
public String selectClass(int selectClass){
			switch(selectClass){
				case 1:
				name = classOneA;
				price = 1210;
				break;
				case 2:
				name = classtwoA;
				price = 1010;
				break;
				case 3:
				name = classthreeA;
				price = 835;
				break;
				case 4:
				name = classFC;
				price = 630;
				break;
				case 5:
				name = classCC;
				price = 470;
				break;
				case 6:
				name = classSL;
				price = 195;
				break;
				case 7:
				name = classTwoS;
				price = 0;
				break;
			}
			return name;
}
public int setClassPrice(){
	return price;
}
}