

//Exercise: Take the FindDups example and modify it to use a SortedSet instead of a Set.
// Specify a Comparator so that case is ignored when sorting and identifying set elements.
// 
// Answer:

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Main {
    static void listTrim(List<String> strings) {
        for (ListIterator<String> lit = strings.listIterator(); lit.hasNext(); ) {
            lit.set(lit.next().trim());
        }
    }

    public static void main(String[] args) {
        List<String> l = Arrays.asList(" red ", " white ", " blue ");
        listTrim(l);
        for (String s : l) {
            System.out.format("\"%s\"%n", s);
        }
    }
}