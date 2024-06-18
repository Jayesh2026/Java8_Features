package static_default_interface;

public interface My_Interface {

    static int square(int number) {
        return number * number;
    }

    default int add(int a, int b) {
        return a + b;
    }

}
