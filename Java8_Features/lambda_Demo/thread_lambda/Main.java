package lambda_Demo.thread_lambda;

public class Main {
    public static void main(String[] args) {

        Runnable thread1 = () -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Value of i is: " +i);
                    Thread.sleep(1000);
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        };

        Thread t1 = new Thread(thread1);
        t1.start();


        Runnable thread2 = () -> {
            try{
                for (int i = 1; i <= 10; i++){
                    System.out.println(i*2);
                    Thread.sleep(2000);
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        };

        Thread t2 = new Thread(thread2);
        t2.start();
    }
}
