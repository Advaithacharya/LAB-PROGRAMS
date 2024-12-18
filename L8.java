package J1;

// Outer class
class Outer {
    void display() {
        System.out.println("Outer class display method");
    }

    // Inner class
    class Inner {
        void display() {
            System.out.println("Inner class display method");
        }
    }
}

// Main class
public class L8 {
    public static void main(String[] args) {
        System.out.println("Outer Inner Example");

        // Create an instance of Outer class
        Outer o1 = new Outer();
        o1.display();

        // Create an instance of Inner class using the Outer instance
        Outer.Inner i1 = o1.new Inner();
        i1.display();
    }
}