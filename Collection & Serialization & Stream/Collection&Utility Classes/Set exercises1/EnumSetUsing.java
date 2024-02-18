import java.util.EnumSet;
import java.util.Set;

public class EnumSetUsing <T>{
    /*
    EnumSet: Elemanların belirli bir enum tipi içinden seçilmesine izin veren bir Set yapısıdır.
    Sadece enum türlerini içerebilir.
     */

    EnumSet<Main.Renkler> enumset;
    int count;
    public EnumSetUsing(Main.Renkler...renkler){
        for (Main.Renkler renk:renkler){
            enumset.add(renk);
        }
    }
    public void add(Main.Renkler renk){
        enumset.add(renk);
    }
    public int getCount(){
        count=enumset.size();
        return count;
    }
    public void yazdir(){
        System.out.println("EnumSet'teki renkler:");
        for (Main.Renkler renk : enumset) {
            System.out.println(renk);
        }
    }
}
