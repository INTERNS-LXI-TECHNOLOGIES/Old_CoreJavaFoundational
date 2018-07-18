public class TDD
{
public static void main(String args[])
{
Campus c=new Campus();

c.CSE=new Department();
c.IT=new Department();

c.CSE.c1=new Classroom();
c.IT.c1=new Classroom();

c.CSE.c1.s=new Student[100];
c.CSE.c1.s[0]=new Student();
c.CSE.c1.s[0].name="student athulya";

c.CSE.c1.f=new Faculty();

c.CSE.c1.f.name="faculty manoj";

c.print();
c.CSE.show1();
c.IT.show2();


c.CSE.

c.CSE.c1.f.print1();

c.CSE.c1.s[0].print1();

}
}