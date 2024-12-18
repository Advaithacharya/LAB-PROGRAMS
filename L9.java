package J1;

// Custom Exception class for Division by Zero
class DivByZeroException extends Exception {
    public DivByZeroException(String message) {
        super(message);
    }
}

// Main class
public class L9 {
    public static void main(String[] args) {
        System.out.println("Exception Handling Example");

        int nr = 10;
        int dr = 0;

        try {
            if (dr == 0) {
                throw new DivByZeroException("Division by zero is not allowed");
            }
            int result = nr / dr; // This line will never be executed due to the exception
            System.out.println("Result: " + result);
        } catch (DivByZeroException e1) {
            System.out.println("Custom Exception: " + e1.getMessage());
        } catch (ArithmeticException e2) {
            System.out.println("Arithmetic Exception: " + e2.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}