package method_reference;

import java.time.LocalDate;

public class Student {

    // static method
    public static void doWork(){
        System.out.println("Hyy, I'm from DoStuff class, doWork() method");
        LocalDate now = LocalDate.now();
        System.out.println(now);
    }


    // non-static method
    public void thread1(){
        System.out.println("Hyy, I'm from DoStuff class, thread1() method");

        try{
            for(int i=1; i<=10; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }


    // Constructor
    public Student(){
        System.out.println("Hello, I'm constructor of Student class");
    }

}
