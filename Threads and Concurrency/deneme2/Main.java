import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*
        Thread thread1 = new MyThread(Arrays.asList(1,2,3,4,5,6,7,8,9));
        Thread thread2 = new MyThread(Arrays.asList(10,20,30,40,50,60,70,80,90));
        List<Thread> liste= Arrays.asList(thread1,thread2);
        // Thread'leri başlatma
        liste.parallelStream().forEach(list-> list.start());

         */
        /*
        Thread t1=new Thread(new MyRunnable(Arrays.asList(1,2,3,4,5,6,7,8,9)));
        Thread t2=new Thread(new MyRunnable(Arrays.asList(10,20,30,40,50,60,70,80,90)));
        t1.start();
        t2.start();
        */
        //"İşlemleri direk Thread mi yoksa Runnable ı kullanıp sonra Thread de nesnesini mi oluşturmayı 
        //seçilmeliyiz?" diye düşünmek gerekirse
        //Thread i seçersek Javada her sınıfın sadece bir class ı extends etme hakkı vardır.
        //Bu haktan mahrum kalmamak adına Runnable yi implements edip kullanmamız gerektiğinde Thread e parametre
        //olarak gönderip işlemleri çalıştırmak daha iyidir.
    }
}
