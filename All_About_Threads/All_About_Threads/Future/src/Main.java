import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        SquareCalculator squareCalculator = new SquareCalculator();

        Future<Integer> future1 =  squareCalculator.calculate(10);
        Future<Integer> future2 = squareCalculator.calculate(15);

        while(!(future1.isDone() & future2.isDone())){
            System.out.println(
                    String.format(
                            "future1 is %s and future2 is %s",
                            future1.isDone() ? "Done" : "not Done",
                            future2.isDone() ? "Done" : "not Done"
                    )
            );
            Thread.sleep(100);
        }

        System.out.println(future1.get() + " and " + future2.get());
        squareCalculator.shutdown();
       // squareCalculator.shutdown();
        //   System.out.println(squareCalculator.calculate(10));
    }
}