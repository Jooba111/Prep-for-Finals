public class SharedObject {

    public static void main(String [] args){

        Runnable runnable= new MyRunnable();

        Thread thread1 = new Thread(runnable, "Thread 1"); //The second argument is a name of the thread.
        Thread thread2 = new Thread(runnable, "Thread 2");

        thread1.start();
        thread2.start();

    }

}
