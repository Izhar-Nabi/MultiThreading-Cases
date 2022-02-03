package SingleTaskMultiThreads;

public class Thread extends java.lang.Thread {
    @Override
    public void run() {
        System.out.println("Task 2 // 2nd case");
    }
    public static void main(String [] args){
        Thread obj = new Thread(); // thread 1
        Thread Obj2= new Thread(); // thread 2 and so on..... like this we will create the threads
        obj.start();
        Obj2.start();
    }
}
