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
public class ThreadDaemonA extends Thread{

    @Override
    public void run() {

        for (int i = 0; i < 9999999L; i++) {
            System.out.println("后台线程A第" + i + "次执行");
        }

    }
}
