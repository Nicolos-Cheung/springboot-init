package com.zn.springbootdemo.thread.future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by ning on 16/8/18.
 */
public class FutureDemo {

    static class MyCallable implements Callable<String> {
        @Override
        public String call() throws Exception {

            Thread.sleep(5000);
            return "ok";
        }
    }


    public static void main(String[] args) throws Exception {

        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<String> result = executorService.submit(new MyCallable());

        String r = result.get();
        System.out.println(r);

    }
}
