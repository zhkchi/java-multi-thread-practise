/*
 * Copyright (c) 2019. 苏州飞鹰在线旅游发展有限公司
 */
package com.zhkchi.chapter2;

/**
 * Created in 2020/4/6$
 *
 * @author
 * @description
 */
public class ThreadA extends Thread{

    @Override
    public void run() {
        super.run();
        try {
            //模拟做事情，执行了500ms
            Thread.sleep(500L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("这是线程A");
    }
}
