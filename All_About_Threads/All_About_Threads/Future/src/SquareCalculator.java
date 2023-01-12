import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SquareCalculator {

    private Executors Executos;
   // private ExecutorService executor = Executos.newSingleThreadExecutor(); //well this is onlyt able to handle with one thread at a time

    private ExecutorService executor = Executos.newFixedThreadPool(5); //now i can tell them how many threads i want them to handle bzzzbzz.

    public Future<Integer> calculate (Integer input){
        return executor.submit(()->{
            Thread.sleep(2000);
            return input*input;
        });
    }

    public void shutdown(){
        executor.shutdown();
    }

}
