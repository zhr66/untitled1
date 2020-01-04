package test;

public class TickSystem implements Runnable{
    private int ticket = 200;

    @Override
    public void run() {
        for(int i=0;i<1000;i++) {
            synchronized (TickSystem.class) {
                if (ticket > 0) {
                    ticket--;
                    System.out.println("恭喜你抢到票,还剩下" + ticket + "张票");
                }
            }
        }

    }
}
