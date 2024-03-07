import java.io.ObjectInputFilter;
import java.io.Serializable;

public class ExampleObject implements Serializable {
    private static final long serialVersionUID = 1L;
    private String data = "Example Data";

    // Eğer bu sınıf serileştirilirken kullanılacak bir özel filtre belirlemek istersek:
    private static final ObjectInputFilter filter = (serialClass) -> {
        if (serialClass.equals(ExampleObject.class.getName())) {
            return ObjectInputFilter.Status.ALLOWED; // Serileştirme izin verilir
        } else {
            return ObjectInputFilter.Status.REJECTED; // Diğer sınıfların serileştirilmesi reddedilir
        }
    };

    // Özel filtre kullanımı
    static {
        ObjectInputFilter.Config.setSerialFilter(filter);
    }
}