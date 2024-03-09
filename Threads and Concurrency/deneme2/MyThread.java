import java.util.List;

public class MyThread extends Thread {
    public final List<Integer> numbers;

    public MyThread(List<Integer> numberlist){
        this.numbers=numberlist;
    }

    @Override
    public void run() {
        try {
            numbers.parallelStream().forEach(System.out::println);
        }catch (Exception exception){
            exception.getMessage();
        }

    }
}