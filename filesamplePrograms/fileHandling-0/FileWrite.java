import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

class FileWrite 
{
    public static void main(String[] args) 
	{
        try {
            String contentTobeWritten = "##This is the new content you will see in file\nAdd some data********";
            Files.write(Paths.get("./file.txt"), contentTobeWritten.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            // looks like the file not found with given path
            e.printStackTrace();
        }
    }
}



//write content into a File using getBytes()