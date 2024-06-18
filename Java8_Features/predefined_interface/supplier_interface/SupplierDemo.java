package predefined_interface.supplier_interface;

import java.util.function.Supplier;

public class SupplierDemo {

    /*  Supplier Interface : It's basically use for the get the data
                            - It's return type isIt represents a supplier of results, and
            it does not take any arguments, but it produces a result.
            The result is obtained by calling the get() method
     */

    public static void main(String[] args) {

        Supplier<String> supplier1 = new Supplier<String>() {
            @Override
            public String get() {
                return "Hello, world!";
            }
        };

        System.out.println("Result from supplier: " + supplier1.get());
    }
}
