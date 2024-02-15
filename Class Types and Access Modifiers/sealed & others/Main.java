import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> sekiller=new ArrayList<>();
        sekiller.add(new Daire(5));
        sekiller.add(new Diktorgen(15,25));
        sekiller.add(new Kare(25));
        sekiller.add(new Ucgen(3,4,5));
        System.out.println("Sırası ile alanları");
        for (Shape i:sekiller){
            System.out.println(i.getAlan());
        }
    }
}