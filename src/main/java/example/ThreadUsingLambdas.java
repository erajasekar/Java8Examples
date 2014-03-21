package example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * Created by relango on 3/21/2014.
 */
public class ThreadUsingLambdas {
    private static Thread oldWay(){
        return new Thread(new Runnable(){
           @Override
            public void run() {
               System.out.println("Old way " + System.currentTimeMillis());
            }
        });
    }

    private static Thread usingLambdas(){
        return new Thread(() -> System.out.println("usingLambdas " + System.currentTimeMillis()));
    }


    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        IntStream.rangeClosed(1,5).forEach(i -> {
                    executorService.submit(oldWay());
                    executorService.submit(usingLambdas());
                }
        );
        executorService.shutdown();

    }
}
