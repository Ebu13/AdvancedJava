## Java'da Set Kullanımı

Java programlama dilinde, bir Set veri yapısı, benzersiz öğelerin bir koleksiyonunu temsil eder. Bu öğelerin her biri sadece bir kez bulunabilir. Setler genellikle koleksiyonlarda tekilleştirme veya öğelerin birbirinden farklı olduğunu kontrol etmek için kullanılır.

### Iterator ile Gezinme
Set içindeki öğeleri gezmek için Iterator kullanılabilir.

```java
import java.util.Iterator;

// Iterator ile gezi
Iterator<String> iterator = mySet.iterator();
while(iterator.hasNext()) {
    String item = iterator.next();
    System.out.println(item);
}

```

Setler, Java'da benzersiz öğelerin yönetimi için güçlü bir araçtır. Koleksiyonlarda tekilleştirme, öğe varlığını kontrol etme veya matematiksel kümeler üzerinde operasyonlar yapma gibi birçok senaryoda kullanılabilirler.

Bu dosyada Collection a dahil olan Set arayüzünü kullanarak denemeler yaptım.
Her arayüz için deneme yapmaya çalıştım ama her arayüzün uygulamasını denemedim.