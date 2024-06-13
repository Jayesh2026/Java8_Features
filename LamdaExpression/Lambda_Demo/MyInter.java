package Lambda_Demo;

@FunctionalInterface
public interface MyInter {

    public abstract void sayHello();
}

// Multiple ways for use interface

// 1. Create a separate class and implement this interface and then call it.
// 2. anonymous class for implementing interface
// 3. use lambda expression
