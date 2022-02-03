package MultiTaskMultiThreads;

public class MultiThreads extends Thread {
    @Override
    public void run() {
        System.out.println("Thread 3 Multi task - multi Threads");
    }

    public static void main(String[] args) {
        MultiThreads t = new MultiThreads();
        Threads t2= new Threads();
        t.start();
        t2.start();
    }
}
class Threads extends Thread {
    @Override
    public void run() {
        System.out.println("Threads");
    }
}
