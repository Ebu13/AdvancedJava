//import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        List<Shape> sekiller=new ArrayList<>();
        sekiller.add(new Daire(5));
        sekiller.add(new Diktorgen(15,25));
        sekiller.add(new Kare(25));
        sekiller.add(new Ucgen(3,4,5));
        */
        List<Shape> sekiller=List.of(new Daire(5),
                new Diktorgen(15,25),
                new Kare(25),
                new Ucgen(3,4,5));

        System.out.println("Sırası ile alanları");
        for (Shape i:sekiller){
            System.out.println(i.getAlan());
        }
    }
    /*
    Java dilinde native kelimesi, Java Sanal Makinesi (JVM) dışında, 
    yani Java dili dışındaki bir yerde, genellikle C veya C++ gibi düşük seviyeli dillerde yazılmış bir fonksiyonu 
    ifade eder. Bu fonksiyonlar "native method" olarak adlandırılır ve native anahtar kelimesiyle tanımlanırlar.

    Örneğin,
    private static native void registerNatives(); 
    ifadesi, bu metodun Java dilinde tanımlı olmadığını, 
    bunun yerine JVM'nin bulunduğu platformun doğrudan bellek adreslerine erişmek için 
    C veya C++ gibi bir dilde yazılmış bir fonksiyon olduğunu belirtir.

    Bir native metodu kullanarak, Java programcıları Java dilinin kapsamını aşabilir 
    ve sistem kaynaklarına doğrudan erişim sağlayabilirler. 
    Ancak, native metodların kullanımı genellikle Java kodunun taşınabilirliğini azaltır 
    ve güvenlik sorunlarına yol açabilir, bu yüzden native metodların dikkatli bir şekilde kullanılması önerilir.
     */
}