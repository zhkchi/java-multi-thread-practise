/*
 * Copyright (c) 2019. 苏州飞鹰在线旅游发展有限公司
 */
package com.zhkchi.chapter2;

import java.util.concurrent.Callable;

/**
 * Created in 2020/4/6$
 *
 * @author
 * @description
 */
public class ThreadC implements Callable<String> {
    @Override
    public String call() throws Exception {
        try {
            Thread.sleep(500L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("这是线程C");
        return "Thread C";
    }
}
