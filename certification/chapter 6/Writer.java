import java.io.*;
class Writer{
	public static void main(String[] args)throws Exception{
	
	boolean newFile=false;
	File file=new File("filewrite.txt");
	FileWriter fw= new FileWriter(file);
	fw.write("howdy");
	fw.close();
	System.out.println(file.exists());

	
	}
}