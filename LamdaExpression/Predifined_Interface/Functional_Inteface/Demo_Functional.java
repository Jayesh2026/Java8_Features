package Predifined_Interface.Functional_Inteface;

import java.util.function.Function;

public class Demo_Functional {

    public static void main(String[] args) {

        /* Functional Interface: It's take two type first is input Type and second return type
                  - Functional<T, R>: the return type is what type we provide in return
                  - contain method: public R (T, t);
        */

//      Here I am multiplying the given number with 2 using functional interface
        Function<Integer, Integer> fun1 = x -> x * 2;
        System.out.println(fun1.apply(10));

//      Here I am checking string of length String
        Function<String, Integer> fun2 = str -> str.length();
        System.out.println("The length of String is: " + fun2.apply("Jayesh"));


    }
}
