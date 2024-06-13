package Lambda_Demo;

public class Main {

    public static void main(String[] args) {
        System.out.println("My System started.....");

//      1. Created class and implementing interface to use functional interface
//        MyIntern myIntern = new MyInternImpl();
//        myIntern.sayHello();

//        2. Created anonymous class for implementing interface
        MyInter myInter1 = new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("I'm in the anonymous class.....");
            }

        };

        myInter1.sayHello();


//================================================

//      3. using Lambda expression implement lambda expression
        MyInter inr = () -> {
            System.out.println("I'm coming from lambda expression that you just created......");
        };

        inr.sayHello();

        MyInter inr2 = () -> System.out.println("I'm coming from second lambda expression.....");

        inr2.sayHello();

        // multiple way to write when there is only one line
//        SumInter sumInter = (a, b) -> {
//            return a + b;
//        };
//
//        SumInter sumInter = (int a, int b) -> a + b;

        SumInter sumInter = (a, b) -> a + b;

        System.out.println(sumInter.sum(5, 6));
        System.out.println(sumInter.sum(5, 5));

        LengthInter strLength = (str) -> str.length();

        System.out.println(strLength.getLength("Hyyy"));

    }
}