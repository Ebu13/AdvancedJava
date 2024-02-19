import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static String[] dosyaOku(String dosyaAdi) {

        //Bu fonksiyon dosya yolu verilen bir txt dosyasındaki tüm verileri satır satır String dizisi olarak döner.
        List<String> satirlar = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(dosyaAdi))) {
            String satir;
            while ((satir = br.readLine()) != null) {
                satirlar.add(satir);
            }
        } catch (IOException e) {
            throw new RuntimeException("Dosya okuma hatasi: " + e.getMessage(), e);
        }

        return satirlar.toArray(new String[satirlar.size()]);
    }

    public static void main(String[] args){
        /*String i=null;
        try {
            System.out.println(i.length());
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        */
        /*
        int a=10;
        try {
            System.out.println(a/0);
        }catch (ArithmeticException arithmeticException){
            System.out.println(arithmeticException.getMessage());
        }
         */
    }
}