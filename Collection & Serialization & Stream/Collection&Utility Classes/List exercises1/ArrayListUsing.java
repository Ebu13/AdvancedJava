import java.util.ArrayList;
import java.util.List;

public class ArrayListUsing<T> {

    //ArrayList, List arabirimini uygulayan ve dinamik olarak boyutlandırılabilen bir dizidir.
    // Bellekte arka planda bir dizi olarak tutulur ve dinamik olarak büyütülerek elemanların ekleme
    // ve çıkarma işlemleri yapılır. Genellikle çok kullanılan bir veri yapısıdır
    // çünkü rastgele erişime izin verir ve genellikle vektörlerden daha hızlıdır.
    // Ancak, eleman eklemesi veya çıkarması sırasında performansı düşük olabilir
    // çünkü dizinin yeniden boyutlandırılması gerekebilir.
    public ArrayList<T> arrayList;
    public ArrayListUsing(){
        arrayList=new ArrayList<>();
    }
    public void yazdir(){
        for (T i:arrayList){
            System.out.println(i);
        }
    }
}
