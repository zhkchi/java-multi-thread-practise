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
public class ThreadAMain {

    public static void main(String[] args) {
        Thread thread = new ThreadA();
        thread.start();
        System.out.println("这是主线程");
    }
}
