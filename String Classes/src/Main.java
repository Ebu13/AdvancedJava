import java.util.StringJoiner;

public class Main {

    public static void main(String[] args){
        /*
        String ad="Ebubekir";
        StringBuffer stringBuffer=new StringBuffer("Ebubekir");
        stringBuffer.append(" Sıddık Nazlı");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.capacity());
        stringBuffer.insert(15,25);//15. indexten başlayarak 25 yazdı ve devamını ekledi.
        System.out.println(stringBuffer);
        stringBuffer.delete(9,18);
        System.out.println(stringBuffer);
        */
        //StringBuilder stringBuilder=new StringBuilder();
        //stringBuilder.trimToSize();
        StringJoiner joiner = new StringJoiner(", ", "", "");
        joiner.add("Apple").add("Banana").add("Orange");
        String result = joiner.toString();
        System.out.println(result);
    }
}