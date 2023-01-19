public class SyncCounter {

    private long count = 0;

    public void incCount(){
        synchronized (this) {this.count++;}
    }

    public long getCount(){
       synchronized (this){return this.count;}
    }

}
