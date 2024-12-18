package J1;

import java.util.Scanner;

class Stack {
    int top;
    int[] s1 = new int[3]; // Stack array with a fixed size of 3
    int len1 = s1.length;

    // Constructor
    Stack() {
        top = -1;
    }

    // Push method
    void push(int item) {
        if (len1 - 1 == top) {
            System.out.println("Stack Overflow: Unable to push " + item);
        } else {
            top = top + 1;
            s1[top] = item;
            System.out.println(item + " has been pushed into the stack.");
        }
    }

    // Pop method
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow: No items to pop.");
        } else {
            int item = s1[top];
            System.out.println(item + " has been popped from the stack.");
            top = top - 1;
        }
    }

    // Display method
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty. No items to display.");
        } else {
            System.out.println("Items in the Stack are:");
            for (int i = top; i >= 0; i--) {
                System.out.println(s1[i]);
            }
        }
    }
}

public class L2 {
    public static void main(String[] args) {
        System.out.println("Stack Program");

        int ch;
        int item;
        Stack stk = new Stack();
        Scanner sc1 = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 1 for PUSH, 2 for POP, 3 for DISPLAY, 4 to EXIT");
            ch = sc1.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter the item to be pushed:");
                    item = sc1.nextInt();
                    stk.push(item);
                    break;

                case 2:
                    stk.pop();
                    break;

                case 3:
                    stk.display();
                    break;

                case 4:
                    System.out.println("Exiting Program.");
                    System.exit(0);

                default:
                    System.out.println("Enter a valid choice.");
            }
        }
    }
}