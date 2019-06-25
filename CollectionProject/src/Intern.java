/**
*@author AJAY E.S

*Page for Intern 
**/	
public class Intern implements Comparable<Intern> {
private Integer id;
private String name;
public Intern(Integer id,String name){
	this.id=id;
	this.name=name;
}

public void setName(String name) {
	this.name=name;
}
public String getName() {
	return this.name;
}
public void setId(Integer id) {
	this.id=id;
}
public Integer getId() {
	return this.id;
}
public String toString() {
	return id+"\t"+name;
	
}
public boolean equals(Intern obj) {
	boolean res=false;
	if(this.getId()==obj.getId()) {
		if(this.getName().equals(obj.getName())) {
		res=false;
		}
	}
	return res;
}

public int compareTo(Intern i) {
	 return this.getId()-i.getId();
	
}
public int hashCode() {
	int res=0;
	String S1 =this.getName();
	Character ch=S1.charAt(0);
    Character.toUpperCase(ch);
    res=ch;
	return res;
}


}
