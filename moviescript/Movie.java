import java.util.*;
import java.io.*;
public class Movie
{
private String name="Lucifer";

Scanner scan=new Scanner(System.in);

Producer producer=new Producer();
ScriptWriter writer=new ScriptWriter();
Director director=new Director();

public void setName(String name)
{
this.name=name;
}
public String getName()
{
return name;
}

public void playMovie()throws Exception
{
System.out.println(" ");
System.out.println("             "+getName()+"             ");
System.out.println(" ");
System.out.println(" Story Writen By :"+writer.getName());
System.out.println(" Produced by     :"+producer.getName());
System.out.println(" Directed by     :"+director.getName());
System.out.println(" ");
writer.script();
}
}
