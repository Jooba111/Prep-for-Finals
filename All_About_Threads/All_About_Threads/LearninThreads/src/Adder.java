public class Adder {

    protected long count = 0;

    public long incAndGet(){

        //this section is called critical section.

        synchronized (this) {
            this.count++;      //this instruction is not atomic.
            return this.count;
        }
    }

    public long get() {return this.count; }

}
