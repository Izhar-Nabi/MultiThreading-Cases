package SingleTaskSingleThread;

public class SingleThreadSingleTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Task 2... single task from single thread");
    }
    public static void main(String [] args){
        SingleThreadSingleTask thd= new SingleThreadSingleTask();

    }
}
