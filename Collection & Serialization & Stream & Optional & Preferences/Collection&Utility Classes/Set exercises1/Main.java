import java.util.List;

public class Main {
    public enum Renkler {
        KIRMIZI, YEŞİL, MAVİ, SARI, BEYAZ , MOR
    }
    public static void main(String[] args) {
        /*
        HashSet için bir sınıf oluşturarak denemeler yaptım.
        HashSetUsing<String> hashSetUsing=new HashSetUsing<>();
        hashSetUsing.set.add("Ebubekir");
        hashSetUsing.set.addAll(List.of("Ebubekir","Fatih","Osman"));
        hashSetUsing.hashlistele();
        int s=hashSetUsing.set.hashCode();
        //Hashcode benzersiz bellekteki tanımlayıcı değeri döndürür.
        //equals metodu aynı değeri görürse true değeri döner.
        System.out.println(s);
        boolean istrue=hashSetUsing.set.contains("fatih");
        boolean isture=hashSetUsing.set.contains("Fatih");
        System.out.println(istrue+" "+isture);
        //Büyük harf küçük harf duyarlılık da var.
        hashSetUsing.set.spliterator();
         */
        /*
        LinkedHashSetUsing linkedHashSetUsing=new LinkedHashSetUsing();
        linkedHashSetUsing.linkedHashSet.addAll(List.of("Ebubekir","Fatih","Osman"));
        int size = linkedHashSetUsing.linkedHashSet.size();
        System.out.println(size);
         */

        //EnumSetUsing enumSetUsing=new EnumSetUsing(Renkler.MOR,Renkler.BEYAZ,Renkler.MAVİ);
        //enumSetUsing.add(Renkler.SARI);
        /*
        TreeSetUsing treeSetUsing=new TreeSetUsing();

        treeSetUsing.treeSet.add(5);
        treeSetUsing.treeSet.add(2);
        treeSetUsing.treeSet.add(8);
        treeSetUsing.treeSet.add(1);
        treeSetUsing.treeSet.add(10);

        treeSetUsing.yazdir();

        //TreeSet her zaman sıralı bir şekilde yazdırır.

        // TreeSet'teki en küçük ve en büyük sayıları yazdıralım
        System.out.println("En küçük sayı: " + treeSetUsing.treeSet.first());
        System.out.println("En büyük sayı: " + treeSetUsing.treeSet.last());

        // Bir sayıyı TreeSet'te arayalım
        int arananSayi = 8;
        if (treeSetUsing.treeSet.contains(arananSayi)) {
            System.out.println(arananSayi + " TreeSet'te bulundu.");
        } else {
            System.out.println(arananSayi + " TreeSet'te bulunamadı.");
        }

        // TreeSet'teki bir sayıyı kaldıralım
        treeSetUsing.treeSet.remove(2);
        System.out.println("2 sayısı kaldırıldı.");
        treeSetUsing.yazdir();*/


        //Mümkün olduğunca tüm sınıfları denedim.
    }
}