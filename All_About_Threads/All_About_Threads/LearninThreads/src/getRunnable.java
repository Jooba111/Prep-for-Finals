public class getRunnable implements Runnable{
    Adder counter = null;
    private String message = null;

    getRunnable(Adder counter, String message){
        this.counter = counter;
        this.message = message;
    }

    public void run(){
        for(int i= 0; i<1_000_000; i++) synchronized (this) {counter.incAndGet();}

        System.out.println(message + counter.get());
    }


}
