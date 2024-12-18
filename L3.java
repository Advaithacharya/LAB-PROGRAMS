package J1;

class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to raise salary by a given percentage
    public void raiseSalary(double percent) {
        if (percent > 0) {
            double increment = salary * (percent / 100);
            salary = salary + increment;
            System.out.println("Salary has been raised by " + percent + "%.");
            System.out.println("New Salary: " + salary);
        } else {
            System.out.println("Invalid percentage. Salary remains unchanged.");
        }
    }

    // Method to display employee details
    public void showEmployeeDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

public class L3 {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee ganesh = new Employee(1, "Ganesh", 10000);
        
        // Displaying employee details
        ganesh.showEmployeeDetails();
        
        // Raising salary by 20%
        ganesh.raiseSalary(20);
        
        // Displaying updated employee details
        ganesh.showEmployeeDetails();
    }
}