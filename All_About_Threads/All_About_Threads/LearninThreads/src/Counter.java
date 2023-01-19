//
//
//
// This counter vanishes the myths about volatile keyword.
//
//

public class Counter {

    private volatile int count = 0;

    public  boolean inc(){
        if(this.count == 10){
            System.out.println(Thread.currentThread().getName() + " : " + count);

            return false;
        }

        this.count++;  // incrementing in java is not atomic
        //read of variable
        //increment of variable
        //write of variable

        System.out.println(Thread.currentThread().getName() + " : " + count);

        return true;
    }

    public int getCount(){
        return this.count;
    }

}

