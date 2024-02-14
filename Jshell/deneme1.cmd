Microsoft Windows [Version 10.0.19045.4046]
(c) Microsoft Corporation. Tüm hakları saklıdır.

C:\Windows\system32>cd %ebube
Sistem belirtilen yolu bulamıyor.

C:\Windows\system32>cd ..

C:\Windows>cd ..

C:\>cd -l
Sistem belirtilen yolu bulamıyor.

C:\>-l
'-l' is not recognized as an internal or external command,
operable program or batch file.

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
[I@6e06451e
jshell> for(int i=0;i<liste.length;i++){System.out.println(liste[i]);}
0
0
5
0
0

jshell> public static double ortal(int[] dizi){int uzunluk=dizi.length; int toplam=0; for(int i=0;i<dizi.length;i++){top
lam+=dizi[i];}return toplam/uzunluk;}
|  created method ortal(int[])

jshell> System.out.print(ortal(liste));
1.0
jshell> liste[0]=25;
$7 ==> 25
|  created scratch variable $7 : int

jshell> public static void yazdir(int[] dizi){for(int i=0;i<liste.length;i++){System.out.println(liste[i]);}}
|  Error:
|  ',', ')', or '[' expected
|  public static void yazdir(int[] dizifor(int i=0;i<liste.length;i++){System.out.println(liste[i]);}}
|                                         ^

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



- Bu küçük bir örnekti.Ve bu örnekte jshell i denedim.