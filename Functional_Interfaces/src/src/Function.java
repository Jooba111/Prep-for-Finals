import java.util.Objects;

public interface Function <T,R> {

    //This method takes argument and brings back the result/
    //Of course every method in interface is abstract, and public.

    R apply(T t);



    //So this andThen function just apply first function and then the second.
    default <V> Function<T,V> andThen(Function<? super R , ? extends V> after){
        Objects.requireNonNull(after);
        return (T t) -> after.apply((apply(t)));
    };



    //So this opposite of andThen function firstly Second apply is done and then the first.
    default <V> java.util.function.Function<V, R> compose(java.util.function.Function<? super V, ? extends T> before) {
        Objects.requireNonNull(before);
        return (V v) -> apply(before.apply(v));
    }

}