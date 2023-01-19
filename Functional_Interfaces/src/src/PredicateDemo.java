

/*
   Core idea is that if there were not lambda expression nor anonymous classes we would always have to
   create individual classes for interfaces. where we'll be able to do implementations.
 */


public class PredicateDemo <T> implements Predicate <T>{

    @Override
    public boolean test(T t){
         return (Integer)t % 2 == 0;
    };


}
