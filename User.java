import java.util.ArrayList;

public class User {
    int id;
    String name;
    int age;
    ArrayList<String> phoneNumbers;

    public void fillingFields(int id, String name, int age, ArrayList<String> phoneNumbers) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumbers = phoneNumbers;

    }

}
