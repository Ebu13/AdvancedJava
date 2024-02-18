# Java da String Sınıfları

### String
- Java'da metinlerin temel temsilini sağlayan bir sınıftır. Bir kez oluşturulduktan sonra değiştirilemez (immutable) özellik gösterir, yani bir kez oluşturulduktan sonra içeriği değiştirilemez. Metinler üzerinde çeşitli işlemler yapmak için bir dizi yöntem sağlar.


```java
String str = "Merhaba";
```

### StringBuffer
- Değiştirilebilir (mutable) karakter dizileri oluşturmak için kullanılır. Yani, içeriği değiştirilebilir. Bu nedenle, metin üzerinde sık sık değişiklik yapılacaksa, StringBuffer kullanmak performans açısından daha iyidir.

```java
StringBuffer buffer = new StringBuffer("Hello");
buffer.append(" World");
```

### StringBuilder
- StringBuffer'a benzer, ancak senkronize edilmediği için StringBuffer'dan daha hızlıdır. Yani, eşzamanlı işlemleri desteklemez, bu yüzden tek bir iş parçasında kullanıldığında daha etkilidir.

```java
StringBuilder builder = new StringBuilder("Hello");
builder.append(" World");
```

### StringJoiner
- Belirli bir ayraçla ayrılmış bir dizi metni birleştirmek için kullanılır. Özellikle koleksiyonların elemanlarını birleştirmek için yaygın olarak kullanılır.

```java
StringJoiner joiner = new StringJoiner(", ", "[", "]");
joiner.add("Apple").add("Banana").add("Orange");
String result = joiner.toString(); // "[Apple, Banana, Orange]"
```
