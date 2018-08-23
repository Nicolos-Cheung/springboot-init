package com.zn.springbootdemo.thread.future;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * Created by ning on 16/8/18.
 */
public class FutureTaskExample {
    public static void main(String[] args) throws Exception {

        FutureTask<String> task = new FutureTask<String>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(5000);
                return "ok";
            }
        });

        new Thread(task).start();

        //do something...
        String s = task.get();  //获取线程执行结果

    }
}



