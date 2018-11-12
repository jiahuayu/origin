package com.yu.controller;

import com.yu.service.SimpleDynamiceProxyService;
import com.yu.service.impl.RealObject;

import java.lang.reflect.Proxy;

/**
 * Created by Yu on 2018/6/21.
 *
 * Java的动态代理比代理的思想更向前迈进了一步，因为它可以动态地创建代理并动态地处理对所代理方法的调用。
 */
public class SimpleDynamicProxy {

    public static void consumer(SimpleDynamiceProxyService iface) {
        iface.doSomething();
        iface.somethingElse("Yu");
    }

    public static void main(String[] args) {
        RealObject real = new RealObject();
        consumer(real);
        // insert a proxy and call again:

        SimpleDynamiceProxyService proxy =  (SimpleDynamiceProxyService)Proxy.newProxyInstance(SimpleDynamiceProxyService.class.getClassLoader(),
                new Class[]{SimpleDynamiceProxyService.class},new DynamicProxyHandler(real));
        consumer(proxy);

    }
}
