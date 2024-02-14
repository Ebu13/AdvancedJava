# Jshell

## JShell

jshell, Java 9'dan itibaren JDK'ya dahil edilen bir araçtır ve Java dilinde bir kabuk sağlar. jshell kullanıcıya bir Read-Eval-Print Loop (REPL) (Oku-Değerlendir-Yazdır) ortamı sunar, bu da kullanıcının Java ifadelerini yazmasına, derlemesine ve hemen sonuçlarını görmesine olanak tanır.

Bir geliştirici jshell kullanarak basit ifadeleri, değişken tanımlamalarını, yöntemleri ve hatta sınıf tanımlarını deneyebilir ve hızlı bir şekilde sonuçlarını görebilir. Bu, kod parçacıklarını test etmek, hızlı prototipler oluşturmak veya yeni bir dil özelliğini denemek için oldukça kullanışlıdır. Ide ler ile uğraşmadan hemen sonucu görmek isteyenler (windows kullanıcıları için) arama kısmına jshell veya jshell.exe yazarak genelde C:\Program Files\Common Files\Oracle\Java\javapath_target_718156 yolunda olan jshell i çalıştırabilir.

Örnek bir uygulama

|  Welcome to JShell -- Version 21.0.2

|  For an introduction type: /help intro

jshell> int a=5,b=6; int c=a+b;

a ==> 5

b ==> 6

c ==> 11

jshell> System.out.println(c+3)

14