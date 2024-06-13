package Predifined_Interface.Functional_Inteface;

import java.util.function.Function;
import java.util.function.Predicate;

public class Demo_FunctionAndPredicate {

    public static void main(String[] args) {

        Student[] stud = {
                new Student("Ram",80),
                new Student("Sham", 60),
                new Student("Prasad", 45),
                new Student("Vijay", 30),
                new Student("Bhalerav", 15)
        };

        Function<Student, String> func = std -> {
            int marks = std.marks;
            String grade = "";

            if(marks >= 80)
                grade = "A";
            else if(marks >= 60)
                grade = "B";
            else if(marks >= 45)
                grade = "C";
            else if(marks >= 30)
                grade = "D";
            else
                grade = "F[Failed]";
            return grade;
        };

        Predicate<Student> stud1 = s -> s.marks <= 25;

        for(Student s1 : stud){

            if(stud1.test(s1)){
                System.out.println(s1.name);
                System.out.println(s1.marks);
                System.out.println(func.apply(s1));
                System.out.println();
            }
        }

    }
}


class Student{

    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

}
