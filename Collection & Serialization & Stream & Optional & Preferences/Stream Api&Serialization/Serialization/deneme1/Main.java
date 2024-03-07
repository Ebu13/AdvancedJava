import java.io.*;

// Serileştirilecek sınıf


public class Main {
    public static void main(String[] args) {
        // Nesne oluşturma
        Ogrenci ogrenci = new Ogrenci("Ali", 20, 75.5);

        // Nesneyi dosyaya serileştirme
        try {
            /*
            `.ser` dosyası, Java'da serileştirilmiş nesnelerin saklandığı bir dosya türüdür.
            Java'da nesnelerin serileştirilmesi işlemi, `ObjectOutputStream` sınıfıyla yapıldığında,
            `.ser` uzantılı dosya oluşturulur.
            Bu dosya, serileştirilmiş nesnenin tamamını veya akışta belirli bir konumdan itibaren seri haldeki veriyi içerir.
            Serileştirilmiş bir nesne, nesnenin alanlarının değerlerinin bir araya getirilmesi
            ve belirli bir biçime dönüştürülmesi ile oluşturulur.
            `.ser` dosyaları genellikle ağ üzerinden iletilen
            veya kalıcı depolama için kullanılan serileştirilmiş nesneleri temsil eder.
            Bu dosyaları tekrar kullanmak veya okumak için `ObjectInputStream` sınıfı kullanılabilir.
            İlla .ser dosya uzantısına gerek yoktur, başka bir dosya uzantısı türü de kullanılabilir.
             */
            FileOutputStream fileOut = new FileOutputStream("ogrenci.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(ogrenci);
            out.close();
            fileOut.close();
            System.out.println("Ogrenci nesnesi serileştirildi ve ogrenci.ser dosyasına yazıldı.");
        } catch (IOException i) {
            i.printStackTrace();
        }
        // Serileştirilmiş nesneyi dosyadan okuma
        Ogrenci okunanOgrenci = null;
        try {
            FileInputStream fileIn = new FileInputStream("ogrenci.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            okunanOgrenci = (Ogrenci) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Ogrenci sınıfı bulunamadı.");
            c.printStackTrace();
            return;
        }

        // Okunan nesnenin özelliklerini ekrana yazdırma
        System.out.println("Okunan Ogrenci: ");
        System.out.println("Ad: " + okunanOgrenci.ad);
        System.out.println("Yaş: " + okunanOgrenci.yas);
        System.out.println("Not Ortalaması: " + okunanOgrenci.notOrtalamasi);
    }
}
