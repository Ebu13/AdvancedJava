import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Nesneyi dosyaya yazma
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("example.ser"));
        outputStream.writeObject(new ExampleObject());
        outputStream.close();

        // Nesneyi dosyadan okuma
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("example.ser"));
        ExampleObject object = (ExampleObject) inputStream.readObject();
        inputStream.close();
    }
}