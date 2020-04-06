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
public class ThreadDaemon {

    public static void main(String[] args) {

        Thread threadA = new Thread();
        Thread threadB = new Thread();
        threadA.setDaemon(true);

        threadB.start();
        threadA.start();

        Thread mainThread = Thread.currentThread();
        System.out.println("线程A是不是守护线程: "+ threadA.isDaemon());
        System.out.println("线程B是不是守护线程: "+ threadB.isDaemon());
        System.out.println("线程Main是不是守护线程: "+ mainThread.isDaemon());





    }
}
