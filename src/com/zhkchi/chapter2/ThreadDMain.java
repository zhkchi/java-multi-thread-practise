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
public class ThreadDMain {

    public static void main(String[] args) {

        ThreadD threadD = new ThreadD();
        for (int i = 0; i < 5; i++) {
            new Thread(threadD, "线程名称:(" + i + ")").start();
        }

        Thread threadDMain = Thread.currentThread();
        System.out.println("这是主线程: " + threadDMain);

        System.out.println("当前运行的线程名称：" + threadDMain.getName());
        System.out.println("当先线程组中活动线程的数量：" + Thread.activeCount());
        System.out.println("当前线程的id：" + threadDMain.getId());
        System.out.println("当前线程的优先级：" + threadDMain.getPriority());
        System.out.println("当前线程的状态：" + threadDMain.getState());
        System.out.println("所属线程组：" + threadDMain.getThreadGroup());
        System.out.println("当前线程是否活动中：" + threadDMain.isAlive());
        System.out.println("当前线程是否为守护线程：" + threadDMain.isDaemon());

        try {
            Thread.sleep(10000L); //休息10秒 以便我们的监控工具能监控到
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
