public class TDD
{
public static void main(String args[])
{
Campus camp=new Campus();


camp.cse=new Dept();

camp.cse.b=new Batch[4];
camp.cse.b[0]=new Batch();


camp.cse.b[0].f=new Faculty();
camp.cse.b[0].f.name="rajani";
camp.cse.b[0].f.address="palakkad";
camp.cse.b[0].f.display();

camp.cse.b[0].s=new Student[100];
camp.cse.b[0].s[0]=new Student();
camp.cse.b[0].s[0].name="siva";
camp.cse.b[0].s[0].address="thrissur";
camp.cse.b[0].s[0].display();
}
}
