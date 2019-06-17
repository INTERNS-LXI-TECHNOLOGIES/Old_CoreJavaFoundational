
public class Intern {
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



}
