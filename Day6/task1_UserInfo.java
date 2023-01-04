package Day6;
import java.util.*;

public class task1_UserInfo {
    String UserInfo;
    String name;
    private int userId;
    String CompanyName;
    String Address;
    protected int age;
    private String position;
    Scanner sc = new Scanner(System.in); 

    public void createuser() {
        System.out.println("Name:");
        name = sc.next();
        System.out.println("User ID:");
        userId = sc.nextInt();
        System.out.println("Company Name:");
        CompanyName = sc.next();
        System.out.println("Address:");
        Address = sc.next();
        System.out.println("Age:");
        age = sc.nextInt();
        System.out.println("Position:");
        position = sc.next();
        
    }

    public void displayuser() {
        System.out.println("Name: " + name + " User Id: " + userId + " Company Name: " + CompanyName + " Address " + Address + " Age " + age + " Position: " + position);
    }

    public static void main(String[] args) {
        task1_UserInfo user = new task1_UserInfo();
        user.createuser();
        user.displayuser();
    }
}
