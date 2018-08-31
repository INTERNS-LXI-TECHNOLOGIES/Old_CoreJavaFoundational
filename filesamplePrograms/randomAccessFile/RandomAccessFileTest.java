import java.io.*;

public class RandomAccessFileTest
{
	public static void main(String args[])
	{
		try{
		// RandomAccessFile created
		RandomAccessFile raf= new RandomAccessFile("./rafile.txt","rw");
		// set the file pointer at 0 position
		raf.seek(0);
		//write data to the RandomAccessFile
		raf.write("Data\n".getBytes());
		raf.write("Entry".getBytes());
		
		// set the file pointer at 0 position
		raf.seek(0);
		//read byte array from RandomAccessFile
		byte[] bytes = new byte[19];
		raf.read(bytes);
		
		//System.out.println(raf.length());
		//append data to the file
		raf.seek(raf.length());
		raf.seek(0);
		raf.write("Completed".getBytes());
		raf.close();				
		System.out.println(new String (bytes));
	}
	catch (IOException ex) {
         ex.printStackTrace();
      }
	}
}