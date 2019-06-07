import java.io.*;
class Cat implements Serializable { } // 1
public class SerializeCat {
public static void main(String[] args) {
Cat c = new Cat(); // 2
try {
FileOutputStream fs = new FileOutputStream("testSer.ser");
ObjectOutputStream os = new ObjectOutputStream(fs);
os.writeObject(c); // 3
os.close();
} catch (Exception e) { e.printStackTrace(); }
try {
FileInputStream fis = new FileInputStream("testSer.ser");
ObjectInputStream ois = new ObjectInputStream(fis);
c = (Cat) ois.readObject(); // 4
ois.close();
} catch (Exception e) { e.printStackTrace(); }
}
}