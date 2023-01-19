public class Mutex{

    private int key = 0;

    public synchronized void Wait(){
        while(key  < 0){
            try {
             wait();
            }catch (Exception e){
                System.out.println("Something went wrong!");
            }
        }
        key--;
    }

    public synchronized void Signal(){
        key++;
        notifyAll();
    }

}
