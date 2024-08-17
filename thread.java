class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - Count: " + i);
            try {
                // Sleep for 500 milliseconds
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(getName() + " was interrupted.");
            }
        }
        System.out.println(getName() + " has finished execution.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating threads
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");
        MyThread thread3 = new MyThread("Thread 3");

        // Setting priorities
        thread1.setPriority(Thread.MIN_PRIORITY); // Priority 1
        thread2.setPriority(Thread.NORM_PRIORITY); // Priority 5 (default)
        thread3.setPriority(Thread.MAX_PRIORITY); // Priority 10

        // Starting threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
//output
Thread 3 - Count: 1
Thread 3 - Count: 2
Thread 3 - Count: 3
Thread 3 - Count: 4
Thread 3 - Count: 5
Thread 3 has finished execution.
Thread 2 - Count: 1
Thread 2 - Count: 2
Thread 2 - Count: 3
Thread 2 - Count: 4
Thread 2 - Count: 5
Thread 2 has finished execution.
Thread 1 - Count: 1
Thread 1 - Count: 2
Thread 1 - Count: 3
Thread 1 - Count: 4
Thread 1 - Count: 5
Thread 1 has finished execution.
