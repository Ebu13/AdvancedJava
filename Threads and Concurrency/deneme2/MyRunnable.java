import java.util.List;

public class MyRunnable implements Runnable{
    public final List<Integer> numbers;

    public MyRunnable(List<Integer> numberlist){
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
