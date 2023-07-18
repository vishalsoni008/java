package threads.joinmethod;

public class JoinMethod {
    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(3000);
                System.out.println("hello");
            }
            catch (InterruptedException interruptedException){
                interruptedException.printStackTrace();
            }
        });

        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("main method");
    }
}
