

//Exercise: Write a program that prints its arguments in random order.
// Do not make a copy of the argument array.
// Demonstrate how to print out the elements using both streams and the traditional enhanced for statement.
// 
// Answer:

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Get and shuffle the list of arguments
        List<String> argList = Arrays.asList(args);
        Collections.shuffle(argList);

        // Print out the elements using JDK 8 Streams
        argList.stream()
                .forEach(e->System.out.format("%s ",e));

        // Print out the elements using for-each
        for (String arg: argList) {
            System.out.format("%s ", arg);
        }

        System.out.println();
    }
}