
public class Main {
    public static void main(String[] args) {
        Liste<Integer> integerListe=new Liste<>();
        integerListe.ekle(15);
        integerListe.ekle(20);
        integerListe.ekle(31);
        integerListe.ekle(27);

        for (int i=0;i<integerListe.size;i++){
            System.out.println(integerListe.getir(i));
        }

        integerListe.sil();
        System.out.println("\n\n");

        for (int i=0;i<integerListe.size;i++){
            System.out.println(integerListe.getir(i));
        }
        integerListe.sil(0);
        System.out.println("\n\n");
        for (int i=0;i<integerListe.size;i++){
            System.out.println(integerListe.getir(i));
        }
    }
}