package Day6;
import java.util.*;

public class task2_Constructor {
    String name;
    private int userId;
    String CompanyName;
    String Address;
    protected int age;
    private String position;
    Scanner sc = new Scanner(System.in); 

    task2_Constructor(String a, int b, String c, String d, int e, String f) {
        name = a;
        userId = b;
        CompanyName = c;
        Address = d;
        age= e;
        position = f;
    }


    public void displayuser() {
        System.out.println("Name: " + name + " User Id: " + userId + " Company Name: " + CompanyName + " Address " + Address + " Age " + age + " Position: " + position);
    }

    public static void main(String[] args) {
        task2_Constructor user1 = new task2_Constructor("Sahil", 74545, "Axis", "Delhi", 23, "DM");
        task2_Constructor user2 = new task2_Constructor("Priyanshu", 67435, "Axis", "Jaipur", 22, "DM");
        user1.displayuser();
        user2.displayuser();
    }
}
