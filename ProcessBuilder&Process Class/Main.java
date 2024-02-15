import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        // Komutu oluştur
        ProcessBuilder processBuilder = new ProcessBuilder();
        // Komutu ayarla
        processBuilder.command("cmd.exe", "/c", "dir");
        try {
            // İşlemi başlat
            Process process = processBuilder.start();
            // İşlem çıktısını oku
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // İşlemi sonlandır
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
