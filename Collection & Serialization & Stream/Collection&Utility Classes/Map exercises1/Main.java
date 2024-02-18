import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

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
    public static List<String> kelimeListe(String[] satirlar){
        List<String> liste=new ArrayList<>();
        for (String i:satirlar){
            String[] kelimeler = i.split("[,.?!\\s]+");
            for (String j:kelimeler){
                liste.add(j);
            }
        }
        liste.remove("\n");
        return liste;
        //Bu fonksiyon paragraftaki tüm kelimeleri String dizisi olarak döner.
    }

    public static Map<String,Integer> kelimeSayisiGet(List<String> liste){
        Map<String,Integer> deger=new HashMap<>();
        //Bu fonksiyon her kelimeden parafrafta kaç adet geçtiğini hesaplar.
        //Her String değerini anahtar olarak değer olarak da kaç adet geçtiğini Integer ile tutuyor.
        for (String i:liste){
            if (deger.containsKey(i)){
                Integer value=deger.get(i);
                deger.put(i,(value+1));
            }else {
                deger.put(i,1);
            }
        }
        return deger;
    }

    public static void main(String[] args){
        //Verilen bir metin içindeki her bir kelimenin kaç kez geçtiğini hesaplayan bir Java programı.
        // Program, bir metin dizisi alacak ve her kelimenin kaç kez tekrarlandığını hesaplayacak ve sonuçları bir Map
        // kullanarak depolayacak.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dosyanın yolunu girin: ");
        //    "src/text.txt" değerini girebilirsiniz.
        Map<String,Integer> liste =kelimeSayisiGet(kelimeListe(dosyaOku(scanner.nextLine())));
        for (Map.Entry<String, Integer> mevcut:liste.entrySet()) {
            System.out.println(mevcut.getKey() + " kelimesi " + mevcut.getValue() + " adet geçiyor.");
        }
    }
}