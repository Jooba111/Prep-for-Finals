import java.util.concurrent.BlockingQueue;

public class PoolThreadRunnable implements Runnable{

    private Thread thread = null;
    private BlockingQueue taskQueue = null;
    private boolean isStopped = false;

    public PoolThreadRunnable(BlockingQueue queue){
        this.taskQueue = queue;
    }


    public void run(){
        this.thread = Thread.currentThread();
        while(!isStopped){

            try{
                Runnable runnable = (Runnable) taskQueue.take();
                runnable.run();
            }catch (Exception e){

            }

        }
    }

    public synchronized  void doStop(){
        isStopped = true;
        //break pool thread out of dequeue() call.
        this.thread.interrupt();
    }

    public synchronized boolean isStopped(){
        return isStopped;
    }


}
