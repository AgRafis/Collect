import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<String> phone1 = new ArrayList<>();
        phone1.add("3-3-3");
        User user1 = new User(1, "Nikolay", 23, phone1);
        System.out.println("ID: " + user1.id + ";");
        System.out.println("Name: " + user1.name + ";");
        System.out.println("Age: " + user1.age + ";");
        System.out.println("Phone: " + phone1 + ".");

        ArrayList<String> phone2 = new ArrayList<>();
        phone2.add("3-2-8");
        phone2.add("5-4-5-5");
        phone2.add("6-7-5-4-1");
        User user2 = new User(2, "Petr", 45, phone2);
        System.out.println("ID: " + user2.id + ";");
        System.out.println("Name: " + user2.name + ";");
        System.out.println("Age: " + user2.age + ";");
        System.out.println("Phone: " + phone2 + ".");

    }
}
