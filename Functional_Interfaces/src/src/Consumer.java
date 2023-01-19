public interface Consumer <T> {

    /*
         Consumer can be used in all contexts where an object needs to be consumed
         i.e taken as input, and some operation is to be performed on the object without
         returning any result.
     */

    void accept(T t);


    //Hmmm Im not sure how it works...
    default Consumer<T> andThern (Consumer<? super T> after){
        return (T t) -> {accept(t); after.accept(t);};
    }

}
