package predefined_interface.consumer_interface;

import java.util.function.Consumer;

public class ConsumerDemo {

    /* Consumer Interface: It takes the Object and does not return anything.
                        - It's return type is void.
     */

    public static void main(String[] args){

        Consumer<String> consumer = System.out::println;
        consumer.accept("Hello");

        int[] arr = {1,2,3,4,5,6,7,8,9};

        Consumer<Integer> consumer1 = num -> System.out.print(num+" ");
        for(int ele : arr){
            consumer1.accept(ele);
        }

        System.out.println();

    }
}


