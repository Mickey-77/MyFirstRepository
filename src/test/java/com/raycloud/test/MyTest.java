package com.raycloud.test;


import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by tyerwetrw on 2016/3/30.
 */
public class MyTest {
    @Before
    //使用了该元数据的方法在每个测试方法执行之前都要执行一次。
    public void testBefore(){
        System.out.println("testBefore");
    }
    @After
    //使用了该元数据的方法在每个测试方法执行之后要执行一次。
    public void testAfter(){
        System.out.println("testAfter");
    }
    @Ignore
    //该元数据标记的测试方法在测试中会被忽略。
    // 当测试的方法还没有实现，或者测试的方法已经过时，或者在某种条件下才能测试该方法（比如需要一个数据库联接，而在本地测试的时候，数据库并没有连接），那么使用该标签来标示这个方法。同时，你可以为该标签传递一个String的参数，来表明为什么会忽略这个测试方法。比如：@lgnore(“该方法还没有实现”)，在执行的时候，仅会报告该方法没有实现，而不会运行测试方法。
    public void testIgnore(){
        System.out.println("testIgnore");
    }
    @Test(timeout=10000)
    public void say(){
       new com.raycloud.test.Test().main(null);
        System.out.println("say something");

    }
}
