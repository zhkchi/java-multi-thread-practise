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
public class ThreadD implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(100000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        System.out.println("当前运行的线程名称：" + name);
        System.out.println("当先线程组中活动线程的数量：" + Thread.activeCount());
        System.out.println("当前线程的id：" + currentThread.getId());
        System.out.println("当前线程的优先级：" + currentThread.getPriority());
        System.out.println("当前线程的状态：" + currentThread.getState());
        System.out.println("所属线程组：" + currentThread.getThreadGroup());
        System.out.println("当前线程是否活动中：" + currentThread.isAlive());
        System.out.println("当前线程是否为守护线程：" + currentThread.isDaemon());
    }
}
