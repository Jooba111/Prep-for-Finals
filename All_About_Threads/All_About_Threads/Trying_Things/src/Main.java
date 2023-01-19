public class Main {
    public static void main(String[] args) {

        Adding adding = new Adding();
       AddeingAnotherHalf addeingAnotherHalf = new AddeingAnotherHalf();
       AddingWithTwoThreads addingWithTwoThreads = new AddingWithTwoThreads();
        Thread thread1 = new Thread(adding);
        Thread thread2 = new Thread(addeingAnotherHalf);
        Thread thread = new Thread(addingWithTwoThreads);
      //  thread1.start();
     //   thread2.start();

        thread.start();

        try {
        //    thread1.join();
        //    thread2.join();
            thread.join();

        }catch (Exception e){
            System.out.println("Something went wrong!");
        }
       // System.out.println(adding.x +  addeingAnotherHalf.x);

        System.out.println(addingWithTwoThreads.x);
        System.out.println(1001 * 500);
    }
}