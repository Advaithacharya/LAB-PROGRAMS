package J1;

// Implementing Runnable interface
class MyRunnable implements Runnable {
    @Override
    public void run() {
        try {
            // Sleep for 5 milliseconds
            Thread.sleep(5);
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class L11 {
    public static void main(String[] args) {
        System.out.println("Runnable Example");

        // Creating MyRunnable object
        MyRunnable mr1 = new MyRunnable();

        // Creating threads and starting them
        Thread t1 = new Thread(mr1);
        Thread t2 = new Thread(mr1);
        Thread t3 = new Thread(mr1);

        // Starting threads
        t1.start();
        t2.start();
        t3.start();
    }
}