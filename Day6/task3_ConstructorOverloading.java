package Day6;

public class task3_ConstructorOverloading {
    String name;
    private int userId;
    String CompanyName;
    String Address;
    protected int age;
    private String position;

    task3_ConstructorOverloading(String name, int userId) {
        this("Axis", "Delhi", 23, "DM");
        this.name = name;
        this.userId = userId;
    }
    
    task3_ConstructorOverloading( String CompanyName, String Address, int age, String position) {
        this.CompanyName = CompanyName;
        this.Address = Address;
        this.age= age;
        this.position = position;
    }

    public static void main(String[] args) {
        task3_ConstructorOverloading user = new task3_ConstructorOverloading("Sahil", 74545);
        System.out.println("Printing User Information: ");  
        System.out.println("Name: "+user.name+"\nId: "+user.userId+"\nCompany Name: "+user.CompanyName+"\nAddress: "+user.Address+"\nAge: "+user.age+"\nPosition: "+user.position); 
    }
    
}
