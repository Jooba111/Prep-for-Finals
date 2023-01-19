public class AddingWithTwoThreads implements Runnable{

    public volatile long x = 0;
    Mutex mutex = new Mutex();

    public void run(){

        //So task is can i control threads behavior? One thread has to work on add1 function and another thread has to work on add2 function.


        mutex.Wait();
        add1();
        mutex.Signal();

        mutex.Wait();
        add2();
        mutex.Signal();
    }

    public synchronized void add1(){
        for(int i= 1; i<500; i++){
            x += 1;
        }
    }

    public synchronized void add2(){
        for(int i = 500; i<= 1000; i++){
            x += i;
        }
    }



}
