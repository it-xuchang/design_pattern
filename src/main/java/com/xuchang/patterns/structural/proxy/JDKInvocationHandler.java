package com.xuchang.patterns.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class JDKInvocationHandler implements InvocationHandler {

    private Object object;

    public JDKInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("准备");
        Object result = method.invoke(object,args);
        System.out.println("装修");

        return result;
    }
}
