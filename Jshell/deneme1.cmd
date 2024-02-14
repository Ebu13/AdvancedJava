Microsoft Windows [Version 10.0.19045.4046]
(c) Microsoft Corporation. Tüm hakları saklıdır.

C:\Windows\system32>cd..

C:\Windows>cd..

C:\>cd users

C:\Users>cd ebube

C:\Users\ebube>jshell -v
|  Welcome to JShell -- Version 21.0.2
|  For an introduction type: /help intro

jshell> int[] liste=new int[5];
liste ==> int[5] { 0, 0, 0, 0, 0 }
|  created variable liste : int[]

jshell> liste={0,1,2,3,4};
|  Error:
|  illegal start of expression
|  liste={0,1,2,3,4};
|        ^

jshell> liste[2]=5;
$2 ==> 5
|  created scratch variable $2 : int

jshell> System.out.print(liste);
[I@1e127982
jshell> for(int i=0;i<liste.length;i++){System.out.println(liste[i]);}
0
0
5
0
0

jshell> public static double ortal(int[] dizi){int uzunluk=dizi.length; int toplam=0; for(int i=0;i<dizi.length;i++){toplam+=dizi[i];}return toplam/uzunluk;}
|  created method ortal(int[])

jshell> System.out.print(ortal(liste));
1.0
jshell> liste[0]=25;
$7 ==> 25
|  created scratch variable $7 : int

jshell> public static void yazdir(int[] dizi){for(int i=0;i<liste.length;i++){System.out.println(liste[i]);}}
|  created method yazdir(int[])

jshell> yazdir(liste)
25
0
5
0
0

jshell> liste[1]=16;
$10 ==> 16
|  created scratch variable $10 : int

jshell> liste[3]=60;
$11 ==> 60
|  created scratch variable $11 : int

jshell> liste[4]=2;
$12 ==> 2
|  created scratch variable $12 : int

jshell> yazdir(liste);
25
16
5
60
2

jshell> ortal(liste);
$14 ==> 21.0
|  created scratch variable $14 : double

jshell> /vars
|    int[] liste = int[5] { 25, 16, 5, 60, 2 }
|    int $2 = 5
|    int $7 = 25
|    int $10 = 16
|    int $11 = 60
|    int $12 = 2
|    double $14 = 21.0

jshell> /methods
|    double ortal(int[])
|    void yazdir(int[])

jshell> /list

   1 : int[] liste=new int[5];
   2 : liste[2]=5;
   3 : System.out.print(liste);
   4 : for(int i=0;i<liste.length;i++){System.out.println(liste[i]);}
   5 : public static double ortal(int[] dizi){int uzunluk=dizi.length; int toplam=0; for(int i=0;i<dizi.length;i++){toplam+=dizi[i];}return toplam/uzunluk;}
   6 : System.out.print(ortal(liste));
   7 : liste[0]=25;
   8 : public static void yazdir(int[] dizi){for(int i=0;i<liste.length;i++){System.out.println(liste[i]);}}
   9 : yazdir(liste)
  10 : liste[1]=16;
  11 : liste[3]=60;
  12 : liste[4]=2;
  13 : yazdir(liste);
  14 : ortal(liste);

jshell> /list -all

  s1 : import java.io.*;
  s2 : import java.math.*;
  s3 : import java.net.*;
  s4 : import java.nio.file.*;
  s5 : import java.util.*;
  s6 : import java.util.concurrent.*;
  s7 : import java.util.function.*;
  s8 : import java.util.prefs.*;
  s9 : import java.util.regex.*;
 s10 : import java.util.stream.*;
   1 : int[] liste=new int[5];
  e1 : liste={0,1,2,3,4};
   2 : liste[2]=5;
   3 : System.out.print(liste);
   4 : for(int i=0;i<liste.length;i++){System.out.println(liste[i]);}
   5 : public static double ortal(int[] dizi){int uzunluk=dizi.length; int toplam=0; for(int i=0;i<dizi.length;i++){toplam+=dizi[i];}return toplam/uzunluk;}
   6 : System.out.print(ortal(liste));
   7 : liste[0]=25;
   8 : public static void yazdir(int[] dizi){for(int i=0;i<liste.length;i++){System.out.println(liste[i]);}}
   9 : yazdir(liste)
  10 : liste[1]=16;
  11 : liste[3]=60;
  12 : liste[4]=2;
  13 : yazdir(liste);
  14 : ortal(liste);

jshell> /<Tab>
|  Invalid command: /<Tab>
|  Type /help for help.

jshell> /<Tab>
|  Invalid command: /<Tab>
|  Type /help for help.

jshell> /help
|  Type a Java language expression, statement, or declaration.
|  Or type one of the following commands:
|  /list [<name or id>|-all|-start]
|       list the source you have typed
|  /edit <name or id>
|       edit a source entry
|  /drop <name or id>
|       delete a source entry
|  /save [-all|-history|-start] <file>
|       Save snippet source to a file
|  /open <file>
|       open a file as source input
|  /vars [<name or id>|-all|-start]
|       list the declared variables and their values
|  /methods [<name or id>|-all|-start]
|       list the declared methods and their signatures
|  /types [<name or id>|-all|-start]
|       list the type declarations
|  /imports
|       list the imported items
|  /exit [<integer-expression-snippet>]
|       exit the jshell tool
|  /env [-class-path <path>] [-module-path <path>] [-add-modules <modules>] ...
|       view or change the evaluation context
|  /reset [-class-path <path>] [-module-path <path>] [-add-modules <modules>]...
|       reset the jshell tool
|  /reload [-restore] [-quiet] [-class-path <path>] [-module-path <path>]...
|       reset and replay relevant history -- current or previous (-restore)
|  /history [-all]
|       history of what you have typed
|  /help [<command>|<subject>]
|       get information about using the jshell tool
|  /set editor|start|feedback|mode|prompt|truncation|format ...
|       set configuration information
|  /? [<command>|<subject>]
|       get information about using the jshell tool
|  /!
|       rerun last snippet -- see /help rerun
|  /<id>
|       rerun snippets by ID or ID range -- see /help rerun
|  /-<n>
|       rerun n-th previous snippet -- see /help rerun
|
|  For more information type '/help' followed by the name of a
|  command or a subject.
|  For example '/help /list' or '/help intro'.
|
|  Subjects:
|
|  intro
|       an introduction to the jshell tool
|  keys
|       a description of readline-like input editing
|  id
|       a description of snippet IDs and how use them
|  shortcuts
|       a description of keystrokes for snippet and command completion,
|       information access, and automatic code generation
|  context
|       a description of the evaluation context options for /env /reload and /reset
|  rerun
|       a description of ways to re-evaluate previously entered snippets

jshell> history
|  Error:
|  cannot find symbol
|    symbol:   variable history
|  history
|  ^-----^

jshell> /history

int[] liste=new int[5];
liste={0,1,2,3,4};
liste[2]=5;
System.out.print(liste);
for(int i=0;i<liste.length;i++){System.out.println(liste[i]);}
public static double ortal(int[] dizi){int uzunluk=dizi.length; int toplam=0; for(int i=0;i<dizi.length;i++){toplam+=dizi[i];}return toplam/uzunluk;}
System.out.print(ortal(liste));
liste[0]=25;
public static void yazdir(int[] dizi){for(int i=0;i<liste.length;i++){System.out.println(liste[i]);}}
yazdir(liste)
liste[1]=16;
liste[3]=60;
liste[4]=2;
yazdir(liste);
ortal(liste);
/vars
/methods
/list
/list -all
/<Tab>
/help
history
/history

jshell> list -all
|  Error:
|  cannot find symbol
|    symbol:   variable list
|  list -all
|  ^--^
|  Error:
|  cannot find symbol
|    symbol:   variable all
|  list -all
|        ^-^

jshell> /list -all

  s1 : import java.io.*;
  s2 : import java.math.*;
  s3 : import java.net.*;
  s4 : import java.nio.file.*;
  s5 : import java.util.*;
  s6 : import java.util.concurrent.*;
  s7 : import java.util.function.*;
  s8 : import java.util.prefs.*;
  s9 : import java.util.regex.*;
 s10 : import java.util.stream.*;
   1 : int[] liste=new int[5];
  e1 : liste={0,1,2,3,4};
   2 : liste[2]=5;
   3 : System.out.print(liste);
   4 : for(int i=0;i<liste.length;i++){System.out.println(liste[i]);}
   5 : public static double ortal(int[] dizi){int uzunluk=dizi.length; int toplam=0; for(int i=0;i<dizi.length;i++){toplam+=dizi[i];}return toplam/uzunluk;}
   6 : System.out.print(ortal(liste));
   7 : liste[0]=25;
   8 : public static void yazdir(int[] dizi){for(int i=0;i<liste.length;i++){System.out.println(liste[i]);}}
   9 : yazdir(liste)
  10 : liste[1]=16;
  11 : liste[3]=60;
  12 : liste[4]=2;
  13 : yazdir(liste);
  14 : ortal(liste);
  e2 : history
  e3 : list -all

jshell> /drop 2
|  dropped variable $2

jshell> yazdir(liste);
25
16
5
60
2

jshell> /imports
|    import java.io.*
|    import java.math.*
|    import java.net.*
|    import java.nio.file.*
|    import java.util.*
|    import java.util.concurrent.*
|    import java.util.function.*
|    import java.util.prefs.*
|    import java.util.regex.*
|    import java.util.stream.*

jshell> /?
|  Type a Java language expression, statement, or declaration.
|  Or type one of the following commands:
|  /list [<name or id>|-all|-start]
|       list the source you have typed
|  /edit <name or id>
|       edit a source entry
|  /drop <name or id>
|       delete a source entry
|  /save [-all|-history|-start] <file>
|       Save snippet source to a file
|  /open <file>
|       open a file as source input
|  /vars [<name or id>|-all|-start]
|       list the declared variables and their values
|  /methods [<name or id>|-all|-start]
|       list the declared methods and their signatures
|  /types [<name or id>|-all|-start]
|       list the type declarations
|  /imports
|       list the imported items
|  /exit [<integer-expression-snippet>]
|       exit the jshell tool
|  /env [-class-path <path>] [-module-path <path>] [-add-modules <modules>] ...
|       view or change the evaluation context
|  /reset [-class-path <path>] [-module-path <path>] [-add-modules <modules>]...
|       reset the jshell tool
|  /reload [-restore] [-quiet] [-class-path <path>] [-module-path <path>]...
|       reset and replay relevant history -- current or previous (-restore)
|  /history [-all]
|       history of what you have typed
|  /help [<command>|<subject>]
|       get information about using the jshell tool
|  /set editor|start|feedback|mode|prompt|truncation|format ...
|       set configuration information
|  /? [<command>|<subject>]
|       get information about using the jshell tool
|  /!
|       rerun last snippet -- see /help rerun
|  /<id>
|       rerun snippets by ID or ID range -- see /help rerun
|  /-<n>
|       rerun n-th previous snippet -- see /help rerun
|
|  For more information type '/help' followed by the name of a
|  command or a subject.
|  For example '/help /list' or '/help intro'.
|
|  Subjects:
|
|  intro
|       an introduction to the jshell tool
|  keys
|       a description of readline-like input editing
|  id
|       a description of snippet IDs and how use them
|  shortcuts
|       a description of keystrokes for snippet and command completion,
|       information access, and automatic code generation
|  context
|       a description of the evaluation context options for /env /reload and /reset
|  rerun
|       a description of ways to re-evaluate previously entered snippets

jshell> /env C:\Users\ebube\Masaüstü\Yazılım\Projects\AdvancedJava\generic type\Liste.java
|  Unexpected arguments at end of command: [C:\Users\ebube\Masaüstü\Yazılım\Projects\AdvancedJava\generic, type\Liste.java] -- C:\Users\ebube\Masaüstü\Yazılım\Projects\AdvancedJava\generic type\Liste.java

jshell> /open C:\Users\ebube\Masaüstü\Yazılım\Projects\AdvancedJava\generic type\Liste.java
|  Warning:
|  unchecked cast
|    required: T[]
|    found:    java.lang.Object[]
|          array = (T[]) new Object[size];
|                        ^--------------^
|  Warning:
|  unchecked cast
|    required: T[]
|    found:    java.lang.Object[]
|          T[] temp = (T[]) new Object[size+1];
|                           ^----------------^
|  Warning:
|  unchecked cast
|    required: T[]
|    found:    java.lang.Object[]
|          T[] temp = (T[]) new Object[size-1];
|                           ^----------------^
|  Warning:
|  unchecked cast
|    required: T[]
|    found:    java.lang.Object[]
|          T[] temp = (T[]) new Object[size-1];
|                           ^----------------^

jshell> import java.util.ArrayList;

jshell> import java.util.List;

jshell>

jshell> /open C:\Users\ebube\Masaüstü\Yazılım\Projects\AdvancedJava\generic type\Liste.java
|  Warning:
|  unchecked cast
|    required: T[]
|    found:    java.lang.Object[]
|          array = (T[]) new Object[size];
|                        ^--------------^
|  Warning:
|  unchecked cast
|    required: T[]
|    found:    java.lang.Object[]
|          T[] temp = (T[]) new Object[size+1];
|                           ^----------------^
|  Warning:
|  unchecked cast
|    required: T[]
|    found:    java.lang.Object[]
|          T[] temp = (T[]) new Object[size-1];
|                           ^----------------^
|  Warning:
|  unchecked cast
|    required: T[]
|    found:    java.lang.Object[]
|          T[] temp = (T[]) new Object[size-1];
|                           ^----------------^

jshell> public class Liste<T> {
   ...>         private T[] array;
   ...>
   ...> public class Liste size=0;
   ...>         private T[] array
   ...>         public Liste() {
   ...>         public int size (T[]) new Object[size];
   ...>         }
   ...>         public Liste
   ...>         public void ekle(T elenew) {
   ...>                 T[] temp = (T[]) new Object[size+1];
   ...>                 for (int i=0;i<size;i++){
   ...>         public void ekle(T elemanrray[i];
   ...>                 }   temp = (T[]) new
   ...>                 for (int i=eleman;
   ...>                 array=temp;
   ...>                 size+=1;
   ...>         }
   ...>
   ...>         public void sil(){
   ...>                 T[] temp = (T[]) new Object[size-1];
   ...>                 for (int i=0;i< temp.length;i++){
   ...>         public void sil temp[i]=array[i];
   ...>                 }   temp = (T[]) new
   ...>                 for (int i;
   ...>                 size=array.length;
   ...>         }
   ...>         public void sil(int index){
   ...>                 T[] temp = (T[]) new Object[size-1];
   ...>                 int i=0,j=0;
   ...>                 for (i=0;i< array.length;i++){
   ...>                         if (!(index==i)){
   ...>                                 temp[j]=array[i];



   ...>                                 j++;
   ...>                         }
   ...>                 }
   ...>                 array=temp;
   ...>                 size=array.length;
   ...>         }
   ...>         public T getir(int index) {
   ...>                 return array[index];
   ...>         }
   ...>     }












        }
|  Warning:
|  unchecked cast
|    required: T[]
|    found:    java.lang.Object[]
|                  array = (T[]) new Object[size];
|                                ^--------------^
|  Warning:
|  unchecked cast
|    required: T[]
|    found:    java.lang.Object[]
|                  T[] temp = (T[]) new Object[size+1];
|                                   ^----------------^
|  Warning:
|  unchecked cast
|    required: T[]
|    found:    java.lang.Object[]
|                  T[] temp = (T[]) new Object[size-1];
|                                   ^----------------^
|  Warning:
|  unchecked cast
|    required: T[]
|    found:    java.lang.Object[]
|                  T[] temp = (T[]) new Object[size-1];
|                                   ^----------------^
|  modified class Liste
|    update overwrote class Liste

jshell> public class Liste<T> { private T[] array; public int size=0; public Liste() { array = (T[]) new Object[size];}
public void ekle(T eleman) { T[] temp = (T[]) new Object[size+1]; for (int i=0;i<size;i++){ temp[i]=array[i];} temp[size
]=eleman; array=temp; size+=1;} public void sil(){ T[] temp = (T[]) new Object[size-1]; for (int i=0;i< temp.length;i++)
{ temp[i]=array[i];} array=temp; size=array.length;} public void sil(int index){ T[] temp = (T[]) new Object[size-1]; in
t i=0,j=0; for (i=0;i< array.length;i++){ if (!(index==i)){ temp[j]=array[i]; j++;}} array=temp; size=array.length;} pub
lic T getir(int index) { return array[index];}}
|  Warning:
|  unchecked cast
|    required: T[]
|    found:    java.lang.Object[]
|  public class Liste<T> { private T[] array; public int size=0; public Liste() { array = (T[]) new Object[size];} public void ekle(T eleman) { T[] temp = (T[]) new Object[size+1]; for (int i=0;i<size;i++){ temp[i]=array[i];} temp[size]=eleman; array=temp; size+=1;} public void sil(){ T[] temp = (T[]) new Object[size-1]; for (int i=0;i< temp.length;i++){ temp[i]=array[i];} array=temp; size=array.length;} public void sil(int index){ T[] temp = (T[]) new Object[size-1]; int i=0,j=0; for (i=0;i< array.length;i++){ if (!(index==i)){ temp[j]=array[i]; j++;}} array=temp; size=array.length;} public T getir(int index) { return array[index];}}
|                                                                                               ^--------------^
|  Warning:
|  unchecked cast
|    required: T[]
|    found:    java.lang.Object[]
|  public class Liste<T> { private T[] array; public int size=0; public Liste() { array = (T[]) new Object[size];} public void ekle(T eleman) { T[] temp = (T[]) new Object[size+1]; for (int i=0;i<size;i++){ temp[i]=array[i];} temp[size]=eleman; array=temp; size+=1;} public void sil(){ T[] temp = (T[]) new Object[size-1]; for (int i=0;i< temp.length;i++){ temp[i]=array[i];} array=temp; size=array.length;} public void sil(int index){ T[] temp = (T[]) new Object[size-1]; int i=0,j=0; for (i=0;i< array.length;i++){ if (!(index==i)){ temp[j]=array[i]; j++;}} array=temp; size=array.length;} public T getir(int index) { return array[index];}}
|                                                                                                                                                                ^----------------^
|  Warning:
|  unchecked cast
|    required: T[]
|    found:    java.lang.Object[]
|  public class Liste<T> { private T[] array; public int size=0; public Liste() { array = (T[]) new Object[size];} public void ekle(T eleman) { T[] temp = (T[]) new Object[size+1]; for (int i=0;i<size;i++){ temp[i]=array[i];} temp[size]=eleman; array=temp; size+=1;} public void sil(){ T[] temp = (T[]) new Object[size-1]; for (int i=0;i< temp.length;i++){ temp[i]=array[i];} array=temp; size=array.length;} public void sil(int index){ T[] temp = (T[]) new Object[size-1]; int i=0,j=0; for (i=0;i< array.length;i++){ if (!(index==i)){ temp[j]=array[i]; j++;}} array=temp; size=array.length;} public T getir(int index) { return array[index];}}
|                                                                                                                                                                                                                                                                                                              ^----------------^
|  Warning:
|  unchecked cast
|    required: T[]
|    found:    java.lang.Object[]
|  public class Liste<T> { private T[] array; public int size=0; public Liste() { array = (T[]) new Object[size];} public void ekle(T eleman) { T[] temp = (T[]) new Object[size+1]; for (int i=0;i<size;i++){ temp[i]=array[i];} temp[size]=eleman; array=temp; size+=1;} public void sil(){ T[] temp = (T[]) new Object[size-1]; for (int i=0;i< temp.length;i++){ temp[i]=array[i];} array=temp; size=array.length;} public void sil(int index){ T[] temp = (T[]) new Object[size-1]; int i=0,j=0; for (i=0;i< array.length;i++){ if (!(index==i)){ temp[j]=array[i]; j++;}} array=temp; size=array.length;} public T getir(int index) { return array[index];}}
|                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ^----------------^
|  modified class Liste
|    update overwrote class Liste

jshell> /vars
|    int[] liste = int[5] { 25, 16, 5, 60, 2 }
|    int $7 = 25
|    int $10 = 16
|    int $11 = 60
|    int $12 = 2
|    double $14 = 21.0

jshell> /methods
|    double ortal(int[])
|    void yazdir(int[])

jshell> /class
|  Invalid command: /class
|  Type /help for help.

jshell> history
|  Error:
|  cannot find symbol
|    symbol:   variable history
|  history
|  ^-----^

jshell> /history

int[] liste=new int[5];
liste={0,1,2,3,4};
liste[2]=5;
System.out.print(liste);
for(int i=0;i<liste.length;i++){System.out.println(liste[i]);}
public static double ortal(int[] dizi){int uzunluk=dizi.length; int toplam=0; for(int i=0;i<dizi.length;i++){toplam+=dizi[i];}return toplam/uzunluk;}
System.out.print(ortal(liste));
liste[0]=25;
public static void yazdir(int[] dizi){for(int i=0;i<liste.length;i++){System.out.println(liste[i]);}}
yazdir(liste)
liste[1]=16;
liste[3]=60;
liste[4]=2;
yazdir(liste);
ortal(liste);
/vars
/methods
/list
/list -all
/<Tab>
/help
history
/history
list -all
/list -all
/drop 2
yazdir(liste);
/imports
/?
/env C:\Users\ebube\Masaüstü\Yazılım\Projects\AdvancedJava\generic type\Liste.java
/open C:\Users\ebube\Masaüstü\Yazılım\Projects\AdvancedJava\generic type\Liste.java
import java.util.ArrayList;
import java.util.List;
/open C:\Users\ebube\Masaüstü\Yazılım\Projects\AdvancedJava\generic type\Liste.java
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
public class Liste<T> { private T[] array; public int size=0; public Liste() { array = (T[]) new Object[size];} public void ekle(T eleman) { T[] temp = (T[]) new Object[size+1]; for (int i=0;i<size;i++){ temp[i]=array[i];} temp[size]=eleman; array=temp; size+=1;} public void sil(){ T[] temp = (T[]) new Object[size-1]; for (int i=0;i< temp.length;i++){ temp[i]=array[i];} array=temp; size=array.length;} public void sil(int index){ T[] temp = (T[]) new Object[size-1]; int i=0,j=0; for (i=0;i< array.length;i++){ if (!(index==i)){ temp[j]=array[i]; j++;}} array=temp; size=array.length;} public T getir(int index) { return array[index];}}
/vars
/methods
/class
history
/history

jshell>



- Bu küçük bir örnekti. Ve bu örnekte jshell i denedim.