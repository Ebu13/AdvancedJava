### Java `Queue` Arayüzü Hakkında Kapsamlı Bilgi

Java'da `Queue` arayüzü, FIFO (First-In-First-Out) mantığına dayalı bir veri yapısını temsil eder. Bu arayüz, bir kuyruğun temel davranışlarını tanımlar ve kuyruk yapısında bulunan öğelerin eklenmesi, çıkarılması ve sorgulanması gibi işlevleri sağlar. `Queue` arayüzü, Java Collections Framework'ün bir parçasıdır ve Java'nın standart kütüphanesinde bulunur.

#### `Queue` Arayüzünün Temel Özellikleri:

1. **FIFO Mantığı:** Kuyruk, ilk eklenen öğe ilk çıkarılana kadar sırayla öğeleri saklar.
2. **Öğe Ekleme:** `add(E e)` veya `offer(E e)` yöntemleriyle kuyruğa yeni bir öğe eklenir.
3. **Öğe Çıkarma:** `remove()` veya `poll()` yöntemleriyle kuyruğun başındaki öğe çıkarılır ve döndürülür.
4. **Başlık Öğesini Görüntüleme:** `element()` veya `peek()` yöntemleriyle kuyruğun başındaki öğe görüntülenir ancak çıkarılmaz.
5. **Boşluk Kontrolü:** `isEmpty()` veya `size()` yöntemleriyle kuyruğun boş olup olmadığı kontrol edilir.

#### `Queue` Arayüzünü Uygulayan Temel Sınıflar:

1. **`LinkedList`:** Çift yönlü bağlı listeden türetilmiştir. Kuyruk işlevselliğini sağlamak için kullanılabilir.
2. **`PriorityQueue`:** Öncelikli kuyruğu temsil eder. Öğeler, belirlenen bir öncelik sırasına göre saklanır ve çıkarılır.

#### `Queue` Arayüzünün Temel Kullanımı:

```java
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Kuyruğa öğeler ekleme
        queue.add(1);
        queue.add(2);
        queue.add(3);

        // Kuyruktan öğe çıkarma ve görüntüleme
        System.out.println(queue.poll()); // Çıktı: 1
        System.out.println(queue.peek()); // Çıktı: 2

        // Kuyruğun boş olup olmadığını kontrol etme
        System.out.println(queue.isEmpty()); // Çıktı: false

        // Kuyruğun boyutunu alma
        System.out.println(queue.size()); // Çıktı: 2
    }
}
```

## List, Map ve Set Sınıflarının Farkları

Bu belgede, Java'da yaygın olarak kullanılan List, Map ve Set sınıflarının farkları hakkında bilgi verilmektedir.

- **List (Liste):** Listeler, sıralı koleksiyonlar olarak öğeleri depolar. Listeler, tekrarlanan öğelere izin verir ve genellikle indeks numarasıyla erişilirler. Örnek olarak, `ArrayList` ve `LinkedList` gibi sınıflar verilebilir.

- **Map (Eşleme):** Haritalar, anahtar-değer eşlemesi şeklinde veri saklarlar. Anahtarlar tekrar edilemezken, değerler tekrar edebilir. Anahtarlar kullanılarak hızlı bir şekilde erişim sağlanır. Örnek olarak, `HashMap`, `TreeMap` ve `LinkedHashMap` gibi sınıflar verilebilir.

- **Set (Küme):** Set'ler, tekrarlanan öğelere izin vermez ve genellikle sırasız koleksiyonlardır. Tekrar eden öğeleri saklamak için kullanılmazlar ve hızlı erişim sağlarlar. Örnek olarak, `HashSet` ve `TreeSet` gibi sınıflar verilebilir.

Bu farklar, hangi veri yapısının hangi senaryolarda tercih edileceğine karar vermek için önemlidir. Listeler, öğelerin sırasının önemli olduğu durumlarda kullanılırken, haritalar anahtar-değer çiftlerini saklamak ve hızlı erişim sağlamak için tercih edilir. Set'ler ise tekrarlanan öğeleri saklamak istemediğimiz durumlarda kullanılır.

Bu belge, Java programlamada veri yapılarının seçimi konusunda karar vermenize yardımcı olabilir.

Queue ile ilgili işlem yapma istemedim ama ileride yapmak istersem atarım.