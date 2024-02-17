import java.util.Set;
import java.util.TreeSet;

public class TreeSetUsing <T>{
    /*
    TreeSet: Elemanların sıralı olarak depolandığı bir Set yapısı sağlar.
    Elemanlar doğal sıralama veya bir Comparator kullanılarak sıralanabilir.
     */
    public TreeSet<T> treeSet;

    private long count;
    public TreeSetUsing(){
        treeSet=new TreeSet<>();
    }

    public void yazdir(){
        // TreeSet'teki sayıları yazdıralım
        System.out.println("TreeSet'teki sayılar:");
        for (T number : treeSet) {
            System.out.println(number);
        }
    }
    public long getCount(){
        return count=this.count=treeSet.parallelStream().count();
    }
}
