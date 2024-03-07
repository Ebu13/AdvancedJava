import java.util.Vector;

public class VectorUsing <T>{
    public Vector<T> vectorList;
    private long boyut;
    public VectorUsing(){
        vectorList=new Vector<>();
    }
    public long getBoyut(){
        return boyut=vectorList.size();
    }
}
