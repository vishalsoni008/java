package threads.waitmethod;

public class WaitMethod {
    public static void main(String[] args) {

        WaitMethod waitMethod = new WaitMethod();

        Thread thread = new Thread(waitMethod.runnable);

        Thread thread1 = new Thread(waitMethod.runnable1);

        thread.start();
        thread1.start();

    }

    Runnable runnable = () -> {
        synchronized (this) {
            try {
                for (int i = 0; i < 11; i = i + 2) {
                    System.out.print(i + " ");
                    wait();
                    notify();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    };

    Runnable runnable1 = () -> {
        synchronized (this) {
            try {
                for (int i = 1; i < 11; i = i + 2) {
                    System.out.print(i + " ");
                    notify();
                    wait();
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    };
}
