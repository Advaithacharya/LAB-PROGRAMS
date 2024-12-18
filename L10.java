package J1;

// Define MyPackage class
class MyPackage {
    public void display() {
        System.out.println("This message is from MyPackage class within J1");
    }
}

// Define MyPackage2 class
class MyPackage2 {
    public void display() {
        System.out.println("This message is from MyPackage2 class");
    }
}

// Define MyPackage3 class
class MyPackage3 {
    public void display() {
        System.out.println("This message is from MyPackage3 class");
    }
}

// Main class
public class L10 {
    public static void main(String[] args) {
        System.out.println("Package Example");

        // Create objects for all three classes
        MyPackage mypack1 = new MyPackage();
        MyPackage2 mypack2 = new MyPackage2();
        MyPackage3 mypack3 = new MyPackage3();

        // Call their respective display methods
        mypack1.display();
        mypack2.display();
        mypack3.display();
    }
}