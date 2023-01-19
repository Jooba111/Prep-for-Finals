
/*
   *** I'll test some functionality here Lol...
 */
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        System.out.println("==========Consumer=============");
        //===========================================================
        //Consumer

        Consumer<Integer> consumer = (t) -> System.out.println("I'm printing : " + t);

        Consumer<String> consumer_For_Strings = (S) -> {
            String name = "Nin";
            S = name;
            System.out.println(S);
        };

        consumer.accept(10);
        consumer.accept(11);
        consumer.accept(12);
        consumer_For_Strings.accept("juba");

        List<Integer> Mylist = Arrays.asList(1,2,3,4,5);
        Mylist.stream().forEach(consumer);  // So as it seems forEach(Consumer<? super T) action) haha.

        //==================================================================
        //==================================================================

        System.out.println("===========Predicate=============");
        //Predicate

        //using lambda with an interface
        Predicate<Integer> predicate = (t) -> t % 2 == 0 ? true : false;
        System.out.println(predicate.test(5));
        System.out.println(predicate.test(10));

       //using old method, we created the class, where we implemented a method which was in Predicate's interface
        //Now we created object of this class and we are able to use this method.
        PredicateDemo<Integer> predicateDemo = new PredicateDemo<>();
        System.out.println(predicateDemo.test(30));

        List<Integer> Mylist2 = Arrays.asList(1,2,3,4,5,6);
        Mylist2.stream().filter(t -> t % 2 ==0).forEach(System.out::println); //Well, filter is taking predicate as argument.
        //As it turned out filter() -method using a predicate as an argument.



        //==================================================================
        //==================================================================
        System.out.println("===========Supplier+++++++++++++=");

        Supplier<String> supplier = () -> "Me var supplier";
        Supplier<String> supplier1 = () -> "No element is the List";
        System.out.println(supplier.get());

        List<String> myList3 = Arrays.asList();

        System.out.println(myList3.stream().findAny().orElse(supplier1.get()));

        //==================================================================
        //==================================================================
        System.out.println("=================Function==================");

        Function<String, Integer> Counter = (t) -> t.length(); //This function takes a string and returns the size of it.
        Function<Integer, Integer> Adder = (t) -> t + 5; //This function takes an Integer and returns t+5.

        System.out.println("Well, my name's size is : "+  Counter.apply("Juba"));

        System.out.println("Trying with andThen | This will have to print 9 : " + Counter.andThen(Adder).apply("Juba"));

        System.out.println("Trying with compose | This also will have to print 9 : " +  Adder.compose(Counter).apply("Juba"));

        //There are also  BiFunction - which is typically the same Function, but it takes 2 arguments and returns one...
        //There are more specific Functional interfaces too. Have research.


    }
}