package predefined_interface.predicate_interface;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args){

//      Here I'm checking the even or odd number using predicate interface.
//      Predicate interface has return type is boolean
        Predicate<Integer> predicate = i -> i % 2 == 0;

        System.out.println(predicate.test(10));
        System.out.println(predicate.test(15));


        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        Predicate<Integer> predicate2 = age1 -> age1 >=18;

        if(predicate2.test(age)){
            System.out.println("You are eligible for voting");
        }else{
            System.out.println("You are not eligible for voting");
        }

        sc.close();

    }

}
