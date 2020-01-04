package test;

public class Share2 implements Runnable {
    @Override
    public void run() {
        for(int j=0; j<100000;j++) {
            System.out.println("j................"+j);

        }
    }
}
