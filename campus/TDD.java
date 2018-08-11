public class TDD
{
public static void main(String args[])
{
Campus camp=new Campus();


camp.cse=new Dept();
camp.mech=new Dept();

camp.cse.b=new Batch[4];
camp.mech.b=new Batch[4];

camp.cse.csedept();


camp.cse.b[0]=new Batch();
camp.cse.b[0].f=new Faculty();
camp.cse.b[0].f.name="rajani";
camp.cse.b[0].f.address="palakkad";
camp.cse.b[0].f.display();

camp.mech.b[0]=new Batch();
camp.mech.b[0].s=new Student[100];
camp.mech.b[0].s[0]=new Student();
camp.mech.b[0].s[0].name="siva";
camp.mech.b[0].s[0].address="thrissur";
camp.mech.mechdept();
camp.mech.b[0].s[0].display();
}
}
