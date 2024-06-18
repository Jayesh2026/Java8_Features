package method_reference;

public class MethodRef_Demo {

    public static void main(String[] args){

//       Using the static method reference
        // to refer static method
        // Syntax:-  ClassName :: methodName
        Runnable runnable = getRunnable();

        Thread thread = new Thread(runnable);
        thread.start();

//==============================================================
//        Using the constructor

        // For Constructor, we have to use new keyword for refer constructor
        // Syntax :-  ClassName :: new;

        Provider provider = Student::new;
        provider.getStudent();
    }

    private static Runnable getRunnable() {
        MyInterface myInter = Student::doWork;
        myInter.myMethod();

// ==========================================================================
//        Using the non-static method

        // refer no-static method
        // we have to create here instance of class
        // Syntax:- Object::methodName;
        Student doStuff = new Student();
        Runnable runnable1 = doStuff::thread1;
        return runnable1;
    }
}
