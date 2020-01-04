package test;

public class Share1 implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<100000;i++) {
            System.out.println("i..."+i);
        }

    }
}
