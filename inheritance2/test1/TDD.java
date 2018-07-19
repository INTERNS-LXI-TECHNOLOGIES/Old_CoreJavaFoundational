package com.lxisoft.inheritance2.test1;
import com.lxisoft.inheritance2.student.Student;
import com.lxisoft.inheritance2.student.dept.CSE;
import com.lxisoft.inheritance2.student.dept.MECH;

public class TDD
{
public static void main(String args[])
{

CSE c=new CSE();
MECH m=new MECH();


c.show();
m.show();

c.name="Athulya";
c.address="abc";

m.name="arthadh";
m.address="xyz";

c.display1();
m.display1();

}
}