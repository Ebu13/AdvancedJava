import java.io.*;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
// import edebilmek için maven paketlerinden jackson-databind ı indirmek gerekiyor.

public class Main {
    
    public static void main(String[] args) {
        List<Configuration> configurations = new ArrayList<>();
        configurations.add(new Configuration("Ebubekir", 20));
        configurations.add(new Configuration("Serap", 25));
        configurations.add(new Configuration("Doğa", 20));

        // Serileştirme
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(new File("config.json"), configurations);
            System.out.println("Nesneler serileştirildi ve config.json dosyasına yazıldı.");
            //[{"name":"Ebubekir","age":20},{"name":"Serap","age":25},{"name":"Doğa","age":20}] görünümünde yazdı.
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialleştirme
        try {
            ObjectMapper mapper = new ObjectMapper();
            List<Configuration> readConfigurations = mapper.readValue(new File("config.json"), mapper.getTypeFactory().constructCollectionType(List.class, Configuration.class));
            System.out.println("Okunan Nesneler: ");
            for (Configuration config : readConfigurations) {
                System.out.println("Name: " + config.getName() + ", Age: " + config.getAge());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
