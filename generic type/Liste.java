public class Liste<T> {
    private T[] array;

    public int size=0;

    public Liste() {
        array = (T[]) new Object[size];
    }

    public void ekle(T eleman) {
        T[] temp = (T[]) new Object[size+1];
        for (int i=0;i<size;i++){
            temp[i]=array[i];
        }
        temp[size]=eleman;
        array=temp;
        size+=1;
    }

    public void sil(){
        T[] temp = (T[]) new Object[size-1];
        for (int i=0;i< temp.length;i++){
            temp[i]=array[i];
        }
        array=temp;
        size=array.length;
    }
    public void sil(int index){
        T[] temp = (T[]) new Object[size-1];
        int i=0,j=0;
        for (i=0;i< array.length;i++){
            if (!(index==i)){
                temp[j]=array[i];
                j++;
            }
        }
        array=temp;
        size=array.length;
    }
    public T getir(int index) {
        return array[index];
    }
}