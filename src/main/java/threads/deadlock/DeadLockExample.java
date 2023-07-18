package threads.deadlock;

public class DeadLockExample {
    public static void main(String[] args) {

        Object lock1 = "vishal";
        Object lock2 = "soni";

        Thread thread = new Thread(() -> {
            synchronized (lock1){
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (lock2){
                    System.out.println("lock acc");
                }
            }
        });

        Thread thread1 = new Thread(() -> {
            synchronized (lock2){
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (lock1){
                    System.out.println("lock acc");
                }
            }
        });

        thread.start();
        thread1.start();
    }
}
