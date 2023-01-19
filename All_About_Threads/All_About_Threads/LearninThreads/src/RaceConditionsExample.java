public class RaceConditionsExample {


    public static void main(String[] args){

        Adder adder = new Adder();

        Thread thread1 = new Thread(new getRunnable(adder, "Thread1 final count: "));
        Thread thread2 = new Thread(new getRunnable(adder,"Thread2 final count: "));

        thread1.start();
        thread2.start();

    }


}
