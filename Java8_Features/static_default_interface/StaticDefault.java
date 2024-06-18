package static_default_interface;

public class StaticDefault implements My_Interface{


    public int addition(int num1, int num2){
        return add(num1, num2);
    } 

    public static void main(String[] args) {

        int num = 5;

        int square = My_Interface.square(num);
        System.out.println(square);


        StaticDefault sd = new StaticDefault();        
        int sum = sd.addition(5, 6);

        System.out.println(sum);
        
        


    }
}
