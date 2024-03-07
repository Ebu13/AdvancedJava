import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Main {
    public static void main(String[] args) {
        // Serileştirme
        try {
            Araba araba = new Araba("Toyota", "Corolla", 2020);

            FileOutputStream fileOut = new FileOutputStream("araba.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(araba);
            out.close();
            fileOut.close();
            System.out.println("Araba nesnesi serileştirildi ve araba.ser dosyasına yazıldı.");
        } catch (IOException i) {
            i.printStackTrace();
        }

        // Deserileştirme
        Araba okunanAraba = null;
        try {
            FileInputStream fileIn = new FileInputStream("araba.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            okunanAraba = (Araba) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Araba sınıfı bulunamadı.");
            c.printStackTrace();
            return;
        }

        // Okunan nesnenin özelliklerini ekrana yazdırma
        System.out.println("Okunan Araba: " + okunanAraba);
    }
}
