import java.io.*;
import com.fasterxml.jackson.databind.ObjectMapper;
/*

1. IntelliJ IDEA'yi açın ve "File" menüsünden "Project Structure" seçeneğini seçin.
4. Açılan pencerede, sol tarafta "Project Settings" altında "Libraries" seçeneğini bulun.
5. Sağ üst köşedeki artı (+) simgesine tıklayın ve "From Maven..." seçeneğini seçin.
6. Açılan pencerede, "Search" kutusuna "jackson-databind" yazın ve Enter tuşuna basın. uygun sürümü yükleyin
7. Jackson Databind kütüphanesini seçin ve "OK" düğmesine tıklayarak ekleyin.
8. Ayarları kapatmak için "OK" düğmesine tekrar tıklayın.

Bu işlem, Maven merkez deposundan Jackson Databind kütüphanesini projenize ekleyecektir.
Daha sonra `import com.fasterxml.jackson.databind.ObjectMapper;`
satırı kodunuzda kullanılabilir olacaktır. Artık Jackson kütüphanesini projenizde kullanabilirsiniz.


iml dosyası şöyledir:

<?xml version="1.0" encoding="UTF-8"?>
<module type="JAVA_MODULE" version="4">
  <component name="NewModuleRootManager" inherit-compiler-output="true">
    <exclude-output />
    <content url="file://$MODULE_DIR$">
      <sourceFolder url="file://$MODULE_DIR$/src" isTestSource="false" />
    </content>
    <orderEntry type="inheritedJdk" />
    <orderEntry type="sourceFolder" forTests="false" />
    <orderEntry type="library" name="fasterxml.jackson.core.databind" level="project" />
  </component>
</module>
 */

public class Main {

    public static void main(String[] args) {
        // Nesneyi oluştur
        Configuration config = new Configuration("John", 30);

        // Nesneyi JSON dosyasına serileştirme
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(new File("config.json"), config);
            System.out.println("Nesne serileştirildi ve config.json dosyasına yazıldı.");
            // {"name":"John","age":30}  görünümünde bir config.json oluştu.
        } catch (IOException e) {
            e.printStackTrace();
        }

        // JSON dosyasını oku ve nesneyi deserialleştirme
        try {
            ObjectMapper mapper = new ObjectMapper();
            Configuration readConfig = mapper.readValue(new File("config.json"), Configuration.class);
            System.out.println("Okunan Nesne: " + readConfig.getName() + ", " + readConfig.getAge());
        } catch (IOException e) {
            e.printStackTrace();
        }
        // {"name":"John","age":30}  görünümünde bir config.json oluştu.
    }
}
