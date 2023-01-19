import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ThreadPool {

    private BlockingQueue<Runnable> taskQueue = null;
    private List<PoolThreadRunnable> runnables = new ArrayList<>();
    private boolean isStopped = false;

    public ThreadPool(int noOfThreads, int maxNoOfTaks){
        taskQueue = new ArrayBlockingQueue<>(maxNoOfTaks);

        for(int i=0; i<noOfThreads; i++){
            PoolThreadRunnable poolThreadRunnable = new PoolThreadRunnable(taskQueue);

            runnables.add(poolThreadRunnable);
        }

        for(PoolThreadRunnable runnable : runnables){
            new Thread(runnable).start();;
        }
    }


    public synchronized void execute (Runnable task) throws Exception{

        if(this.isStopped)throw new IllegalStateException("ThreadPool is stopped");

        this.taskQueue.offer(task); //just inserting a runnable object into my BlockingQueue

    }


    public synchronized void stop(){

        this.isStopped = true;

        for(PoolThreadRunnable runnable : runnables){
            runnable.doStop();
        }

    }

    public synchronized void waitUntilAllTaskFinished(){
        while(this.taskQueue.size() > 0){
            try{
                Thread.sleep(1);
            }catch (Exception e){
                System.out.println("Oops");
            }
        }
    }





}
