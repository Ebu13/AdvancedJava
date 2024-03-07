import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//ObjectInputFilter sınıfı, ObjectInputStream nesnesinin giriş filtresini sağlar. 
//Bu, serileştirilmiş nesnelerin güvenliğini artırmak için kullanılabilir.

public class Main {
    public static void main(String[] args) {
        List<User> liste= Arrays.asList(new User("Ebubekir",20),
                new User("Ceren",20),
                new User("Erva",20));
        System.out.println("İlk Liste");
        for (User u: liste)
            System.out.println(u.Name+" "+u.age+" yaşındadır.");

        List<User> ebaslayan=new ArrayList<>();
        liste.stream()
                .filter(
                        user -> user.Name.startsWith("E"))
                .forEach(
                        user -> {System.out.println(user.Name+" "+user.age+" yaşındadır.");
                        ebaslayan.add(user);});

        List<User> yeniListe=ebaslayan.stream().map(user -> new User(user.Name, user.age+1)).collect(Collectors.toList());
        System.out.println("Yeni Hal:");
        for (User u: yeniListe.reversed())
            System.out.println(u.Name+" "+u.age+" yaşındadır.");
        boolean anyMatch=yeniListe.stream().anyMatch(user -> user.age==21);
        if (anyMatch)
            System.out.println("21 yasinda insanlar var");
    }
}
