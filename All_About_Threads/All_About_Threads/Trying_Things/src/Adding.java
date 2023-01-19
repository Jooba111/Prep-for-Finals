public class Adding implements Runnable{
    volatile public long x = 0;
    volatile public int mutex = 0;
    Mutex Mutex = new Mutex();
    public  void run(){
        add();
    }

    public void add(){
        for(int i=1; i<500; i++){
            x += i;
        }
    }
}
