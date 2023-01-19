public class SyncCounterMain {

    public static void main(String[] args){

        SyncCounter syncCounter = new SyncCounter();

        Thread thread1 = new Thread(() -> {
              for(int i=0; i<1_000_000; i++){
                  syncCounter.incCount();
              }
            System.out.println(syncCounter.getCount());

        });

    Thread thread2 = new Thread(() -> {
        for(int i=0; i<1_000_000; i++){
            syncCounter.incCount();
        }
        System.out.println(syncCounter.getCount());
    });


    thread1.start();
    thread2.start();

    }

}

