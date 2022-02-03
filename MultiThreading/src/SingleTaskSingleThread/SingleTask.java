package SingleTaskSingleThread;
//performing single task from single Thread..
public class SingleTask extends Thread {
    public void run(){
        System.out.println("Thread 1");
    }
    public static void main(String args[]){ //---> main Threead
    SingleTask thread1= new SingleTask(); // thread one.
    thread1.start();
    }
}
