package test;

public class TestMain {
    public static void main(String[] args) {
        /*Runnable runnable1 = new Share1();
        Runnable runnable2 = new Share2();
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();*/
        Runnable runnable = new TickSystem();
        Thread thread3 = new Thread(runnable);
        Thread thread4 = new Thread(runnable);
        Thread thread5 = new Thread(runnable);
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
