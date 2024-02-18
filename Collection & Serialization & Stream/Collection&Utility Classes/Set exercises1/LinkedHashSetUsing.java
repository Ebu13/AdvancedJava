import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetUsing <T>{
    /*
    LinkedHashSet: Elemanların eklenme sırasına göre sıralandığı bir Set yapısıdır.
    Eklenme sırasının korunması gerektiği durumlarda kullanışlıdır.
     */
    public LinkedHashSet<T> linkedHashSet;

    private long count;
    public LinkedHashSetUsing(){
        linkedHashSet=new LinkedHashSet<>();
    }
    public void yazdir(){
        for (T i:linkedHashSet){
            System.out.println(i);
        }
    }
    public long getCount(){
        return count=linkedHashSet.stream().count();
    }

}
