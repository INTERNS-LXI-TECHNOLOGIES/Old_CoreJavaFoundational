package com.lxisoft.SnakeNLadder;
/**
*This model class is used for players
*
*@author AJAY .E.S
*
*@version 1.0

*/

public class Player {
private int pos;
private String name;
public String state;
public void setPos(int pos) {
	this.pos=pos;
}
public void setName(String name) {
	this.name=name;
}
public int getPos() {
return this.pos;
}
public String getName() {
return this.name;
}
}
