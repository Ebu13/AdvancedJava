import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args)  {

        List<Integer> liste1= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> liste2= Arrays.asList(10,20,30,40,50,60,70,80,90,100);
        Thread t1=new Thread(()-> liste1.parallelStream().forEach(System.out::println));
        Thread t2=new Thread(()-> liste2.parallelStream().forEach(System.out::println));
        t1.start();
        t2.start();
    }
}