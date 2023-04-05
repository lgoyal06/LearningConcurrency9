package java9.threading.other;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class ComparableFuturesDemo {

    public static void main(String... s) {
        completeOnTime();
        //delayedExecutor();
    }

    private static void completeOnTime() {
        int value1 = 10;
        int value2 = 30;
        CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return value1 + value2;
        }).completeOnTimeout(10, 6, TimeUnit.SECONDS).thenAccept(result -> System.out.println("Result from completeOnTime()==>" + result));
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void orTimeOut() {
        int value = 34;
        int value1 = 45;
        CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return value + value1;
        }).orTimeout(2, TimeUnit.SECONDS).whenComplete((result, exception) -> {
            System.out.println("Result from orTimeout()==> " + result);
            if (exception != null) {
                exception.printStackTrace();
                System.out.println("Job not completed on Time");
            }
        });
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void delayedExecutor() {
        int value = 34;
        int value1 = 45;
        CompletableFuture.supplyAsync(() -> value + value1,
                CompletableFuture.delayedExecutor(2, TimeUnit.SECONDS)).thenAccept(result -> System.out.println(result));
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
