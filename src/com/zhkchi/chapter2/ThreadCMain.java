/*
 * Copyright (c) 2019. 苏州飞鹰在线旅游发展有限公司
 */
package com.zhkchi.chapter2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created in 2020/4/6$
 *
 * @author
 * @description
 */
public class ThreadCMain {

    public static void main(String[] args) {
        ThreadC threadC = new ThreadC();
        FutureTask<String> futureTask = new FutureTask<>(threadC);
        new Thread(futureTask).start();
        System.out.println("这是主线程， begin");
        try {
            System.out.println("得到的返回结果：" + futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("这是主线程，end");
    }
}
