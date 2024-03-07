// Main class ında import com.fasterxml.jackson.databind.ObjectMapper; olduğu için önceki denemelerdeki gibi
// implements Serializable dememe gerek yok

public class Configuration {
    private String name;
    private int age;

    public Configuration() {
    }

    public Configuration(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}