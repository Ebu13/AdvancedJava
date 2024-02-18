## List Class

En yaygın kullanılan Java List sınıfları:

- ArrayList: ArrayList, List arabirimini uygulayan ve dinamik olarak boyutlandırılabilen bir dizidir. 
Bellekte arka planda bir dizi olarak tutulur ve dinamik olarak büyütülerek elemanların ekleme ve çıkarma işlemleri desteklenir. 
Genellikle çok kullanılan bir veri yapısıdır çünkü rastgele erişime izin verir ve genellikle vektörlerden daha hızlıdır. 
Ancak, eleman eklemesi veya çıkarması sırasında performansı düşük olabilir çünkü dizinin yeniden boyutlandırılması gerekebilir.

- LinkedList: LinkedList, çift yönlü bağlı liste yapısını kullanan bir sınıftır. Her eleman, kendisinden önceki ve sonraki elemanların referanslarını içerir. Bu, eleman ekleme ve çıkarma işlemlerinin sabit zaman karmaşıklığına sahip olmasını sağlar. 
Ancak, rastgele erişim, ArrayList kadar etkin değildir çünkü belirli bir indekse erişmek için listeden başlayarak gezinmek gerekebilir.

- HashMap: HashMap, Map arabirimini uygulayan bir sınıftır ve anahtar-değer çiftlerini depolar. List arayüzünü doğrudan uygulamaz ancak Map arabirimini kullanır. Anahtarlar benzersiz olmalıdır ve her anahtara karşılık gelen bir değer bulunur. Anahtarlar, hash fonksiyonu kullanılarak saklanır, bu da hızlı arama süreleri sağlar.

- Vector: Vector, dinamik olarak boyutlandırılabilen bir dizi gibi davranan ve List arabirimini uygulayan bir sınıftır. ArrayList'e benzer, ancak senkronize bir yapıya sahiptir, bu da birden çok iş parçacığı tarafından güvenli bir şekilde erişilebilmesini sağlar. Ancak, senkronizasyon nedeniyle performansı daha düşüktür ve genellikle ArrayList yerine tercih edilmez.

- Stack: Stack, List arabirimini uygulayan ve LIFO (Last-In-First-Out) prensibine göre çalışan bir sınıftır. Yığın veri yapısını temsil eder ve genellikle geri alma işlemleri veya derinlik öncelikli arama gibi senaryolarda kullanılır.

- Queue: Queue, List arabirimini uygulayan ve FIFO (First-In-First-Out) prensibine göre çalışan bir sınıftır. Kuyruk veri yapısını temsil eder ve işlem sırasına göre elemanları saklar. Genellikle işlem sırasına göre elemanları işlemek için kullanılır.