package com.lxisoft.requirements;
import java.util.*;
public class Player
{
private String name;
private int position;

public void setName(String name)
{
this.name=name;
}
public String getName()
{
return name;
}

public void setPosition(int position)
{
this.position=position;
}
public int getPosition()
{
return position;
}
public String toString(){
return name;
}


}