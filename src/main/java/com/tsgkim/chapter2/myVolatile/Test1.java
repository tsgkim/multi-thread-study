package com.tsgkim.chapter2.myVolatile;

import org.junit.Test;

/**
 *
 * @author: shiguang.tu
 * @create: 2018/11/27 10:35 AM
 */
public class Test1 extends Thread {

    private boolean flag = true;

    @Override
    public void run() {

        System.out.println("进入线程了!");

        while (flag) {}

        System.out.println("线程停止了!");

    }

    @Test
    public void myTest() {

        Test1 test1 = new Test1();

        test1.start();

        /*
            这种停止线程的方式在 -server 服务器模式的 64 位 JVM 上会出现死循环的情况，但是自己测试并没有
         */
        test1.flag = false;

    }

}
