package com.xuchang.patterns.structural.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


public class CglibInteceptor implements MethodInterceptor {

    private Object object;

    public CglibInteceptor(Object object) {
        this.object = object;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("准备");
        Object result = method.invoke(object,objects);
        System.out.println("装修");

        return result;
    }

    public Object getProxy(){
        Enhancer enhancer = new Enhancer();
        enhancer.setCallback(this);
        enhancer.setSuperclass(object.getClass());
        return enhancer.create();
    }

}
