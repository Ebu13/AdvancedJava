import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;

public class HashSetUsing<T>{
    /*
    HashSet: Elemanların sırasız olarak depolandığı ve erişildiği bir Set yapısı sağlar.
    Hızlı ekleme, silme ve arama işlemleri için uygundur.
     */
    public HashSet<T> set;
    Iterator<T> iterator;

    Spliterator<T> spliterator;
    public HashSetUsing(){
        set=new HashSet<>();
    }
    public void iterator(){
        iterator=set.stream().iterator();
        //ama
        spliterator=set.stream().spliterator();
    }
    public void iteratordondur(){
        while(this.iterator.hasNext()) {
            T item = iterator.next();
            System.out.println(item);
        }
    }
    public void hashlistele(){
        for (T i:this.set){
            System.out.println(i);
        }
    }
}
