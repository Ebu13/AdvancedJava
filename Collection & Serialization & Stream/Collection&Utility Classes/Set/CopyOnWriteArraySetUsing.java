public class CopyOnWriteArraySetUsing {
    /*
    CopyOnWriteArraySet: Concurrent koleksiyonların bir türüdür.
    İçindeki elemanlar üzerinde güvenli bir şekilde eşzamanlı işlemler gerçekleştirilmesini sağlar.


    CopyOnWriteArraySet, adından da anlaşılacağı gibi,
    "yazma işlemi yapılınca kopyala" (copy-on-write) yöntemini kullanır.
    Bu yöntem, herhangi bir değişiklik yapılırken mevcut koleksiyonun bir kopyasını oluşturur
    ve bu kopya üzerinde değişiklik yapar.
    Böylece, okuma işlemleri esnasında hiçbir senkronizasyon veya kilitleme gerektirmez,
    bu da okuma işlemlerinin hızlı ve etkili olmasını sağlar.

    Özetle, CopyOnWriteArraySet şu özelliklere sahiptir:

    Eşzamanlı okuma işlemleri çok hızlıdır.
    Yazma işlemleri nispeten yavaşdır, çünkü bir kopya oluşturulması gerekmektedir.
    İçeriği değişmeyen veya nadiren değişen setler için uygundur.
    Eşzamanlılık ve thread güvenliği sağlar.
    Ancak, bu sınıfın dezavantajı, koleksiyonun kopyalanması gerektiğinden yazma işlemlerinin maliyetli olmasıdır.
    Bu nedenle, koleksiyonun sık sık değiştiği ve büyük boyutlarda olduğu durumlarda performansı etkileyebilir.

     */

}
