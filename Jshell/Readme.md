# Jshell

## JShell

jshell, Java 9'dan itibaren JDK'ya dahil edilen bir araçtır ve Java dilinde bir shell(kabuk) sağlar. jshell kullanıcıya bir Read-Eval-Print Loop (REPL) (Oku-Değerlendir-Yazdır) ortamı sunar, bu da kullanıcının Java ifadelerini yazmasına, derlemesine ve hemen sonuçlarını görmesine olanak tanır.

Bir geliştirici jshell kullanarak basit ifadeleri, değişken tanımlamalarını, yöntemleri ve hatta sınıf tanımlarını deneyebilir ve hızlı bir şekilde sonuçlarını görebilir. Bu, kod parçacıklarını test etmek, hızlı prototipler oluşturmak veya yeni bir dil özelliğini denemek için oldukça kullanışlıdır. Ide ler ile uğraşmadan hemen sonucu görmek isteyenler (windows kullanıcıları için) arama kısmına jshell veya jshell.exe yazarak genelde C:\Program Files\Common Files\Oracle\Java\javapath_target_718156 yolunda olan jshell i çalıştırabilir.

Jshell i denerken yaptığım ilk komutlar

|  Welcome to JShell -- Version 21.0.2

|  For an introduction type: /help intro

jshell> int a=5,b=6; int c=a+b;

a ==> 5

b ==> 6

c ==> 11

jshell> System.out.println(c+3)

14

### Aynı dosya konumunda bulunan diğer programlar hakkında ufak açıklamalar

- javac.exe: javac, Java programlama dilinde yazılmış kaynak kodlarını derlemek için kullanılan bir araçtır. Java kaynak kodları .java uzantılı dosyalarda bulunur. javac, bu kaynak kodlarını derleyerek platform bağımsız Java byte koduna dönüştürür. Bu byte kodları daha sonra Java Sanal Makinesi (JVM) tarafından yürütülür.

- javaw.exe: javaw, Java uygulamalarını başlatmak için kullanılan bir araçtır, ancak farkı, bir konsol penceresi açmaz. Bu nedenle, genellikle grafiksel kullanıcı arayüzü (GUI) olan uygulamalar için tercih edilir. Konsol penceresi olmadığı için, kullanıcıya herhangi bir çıktı gösterilmez.

- java.exe: java, derlenmiş Java byte kodunu çalıştırmak için kullanılan bir araçtır. Bu byte kodları, platform bağımsızdır ve herhangi bir JVM üzerinde çalışabilir. java komutu genellikle main metodunu içeren bir sınıf adı ile birlikte kullanılır ve bu sınıf başlangıç noktası olarak işlev görür.

Bu dosyalar, Java'nın geliştirme ve çalıştırma süreçlerinde farklı roller üstlenirler. javac kaynak kodlarını derler, java derlenmiş kodları çalıştırır, javaw GUI uygulamalarını başlatırken konsol penceresi olmadan, jshell ise etkileşimli bir shell(kabuk) ortamı sağlar.


Son olarak deneme1.cmd dosyasında biraz daha ileri seviye bir deneme yaparak Jshell in kullanışlılığını denedim.
Yazılan kodları ve tanımlamaları kaydederek main fonksiyonunda yazılmış gibi kabul ederek yanıtlar veriyor.
Eğer fonksiyonu direkt olarak farklı bir class ı tanımlarken değil de normal bir şekilde yazarsak main fonksiyonunda yazılmış gibi kabul eder. Her türlü tanımlamalar sanki normal projede main fonksiyonunda üst kısımdaki satırlara yazılımış gibi çalışır. Java da belirli bir yetkinliğin ve uzmanlığın üstündeki insanlar deneme1.cmd dosyamı inceleyerek tanımlamalarımı daha iyi anlayabilirler.