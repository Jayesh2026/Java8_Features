package Predifined_Interface.Predicate_Interface;

import java.util.Scanner;
import java.util.function.Predicate;

public class Demo_Predicate {

    public static void main(String[] args){

//      Here I'm checking the even or odd number using predicate interface.
//      Predicate interface has return type is boolean
        Predicate<Integer> predic = i -> i % 2 == 0;

        System.out.println(predic.test(10));
        System.out.println(predic.test(15));



        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        Predicate<Integer> predic2 = age1 -> age1 >=18;

        if(predic2.test(age)){
            System.out.println("You are eligible for voting");
        }else{
            System.out.println("You are not eligible for voting");
        }

    }

}
