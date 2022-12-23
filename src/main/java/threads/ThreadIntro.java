package threads;

public class ThreadIntro implements Runnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadIntro());
        thread.start();
    }

    @Override
    public void run() {
        try{
            Thread.sleep(5000);
            Thread.currentThread().setName("t1");
            System.out.println(Thread.currentThread().getName());
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
