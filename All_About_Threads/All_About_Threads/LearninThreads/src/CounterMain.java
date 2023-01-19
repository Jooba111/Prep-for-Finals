public class CounterMain {

    public static void main(String[] args){

        Counter counter = new Counter();

        Thread thread1 = new Thread(() -> {
           for(int i=0; i<10; i++)
               System.out.println(counter.inc());

        }, "Thread 1");

        Thread thread2 = new Thread(() -> {
            for(int i=0; i<10; i++)
                System.out.println(counter.inc());
        }, "Thread 2");


        thread1.start();
        thread2.start();


        try{
         thread1.join();
         thread2.join();
        }catch (Exception e){
            System.out.println("Oops something went wrong!");
        }

        System.out.println(counter.getCount());
    }
}
