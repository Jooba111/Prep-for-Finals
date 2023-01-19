public class SeparateObject {

    public static void main(String [] args){


        //in this case these threads do not share any variables so they won't affect each other.
        Runnable runnable1 = new MyRunnable();
        Runnable runnable2 = new MyRunnable();

        Thread thread1 = new Thread(runnable1, "Thread 1"); //The second argument is a name of the thread.
        Thread thread2 = new Thread(runnable2, "Thread 2");

        thread1.start();
        thread2.start();

    }

}
