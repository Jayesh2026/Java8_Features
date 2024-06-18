package predefined_interface.function_interface;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {

        /*
         * Function Interface: It's take two type first is input Type and second return type
         * - Functional<T, R>: the return type is what type we provide in return
         * - contain method: public R (T, t);
         */

        // Here I am multiplying the given number with 2 using functional interface
        Function<Integer, Integer> fun1 = x -> x * 2;
        System.out.println(fun1.apply(10));

        Function<Integer, Integer> fun2 = x -> x * x * x;
        System.out.println(fun2.apply(5));

        // Here I am checking string of length String
        Function<String, Integer> fun3 = str -> str.length();
        System.out.println("The length of String is: " + fun3.apply("Jayesh"));

        System.out.println(fun1.andThen(fun2).apply(2));
        System.out.println(fun1.compose(fun2).apply(2));

    }
}
