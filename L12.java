package J1;

class MyThread extends Thread {
    // Constructor to set the name of the thread
    public MyThread(String name) {
        super(name);  // Set the name of the thread
    }

    // Override the run method
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try {
                Thread.sleep(1000);  // Sleep for 1 second for demonstration
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class L12 {
    public static void main(String[] args) {
        System.out.println("Thread Example");

        // Create MyThread object
        MyThread t1 = new MyThread("ChildThread");

        // Start the thread explicitly
        t1.start();
    }
}