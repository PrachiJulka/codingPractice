package geeksForGeeks.Arrays.threading;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceEx {

    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(4);
        for (int i=0;i<10;i++){
            CompletableFuture.supplyAsync(()-> 1+1)
                    .thenApply((q)->q+1)
                    .thenApply((q)->q*2)
                    .thenAccept((q)-> System.out.println("result"+q));
        }

//        executorService.shutdown();
//       // executorService.submit(()-> System.out.println("eeee"));
//        //System.out.println(executorService.isShutdown());
//        executorService.shutdownNow().forEach((i)-> System.out.println("ff"+i));

        System.out.println("wwwwwww");

    }
}
