package com.yu.service.impl;

import com.yu.service.SimpleDynamiceProxyService;

/**
 * Created by d on 2018/6/21.
 */
public class RealObject  implements SimpleDynamiceProxyService {

    public void doSomething() {
        System.out.println("hello  doSomething");
    }

    public void somethingElse(String arg) {
        System.out.println("hello  somethingElse " +  arg);
    }
}
