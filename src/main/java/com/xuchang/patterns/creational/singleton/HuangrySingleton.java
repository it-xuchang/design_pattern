package com.xuchang.patterns.creational.singleton;



import java.io.Serializable;

public class HuangrySingleton implements Serializable {

    private static HuangrySingleton instance = new HuangrySingleton();

    private HuangrySingleton(){
        if(instance !=null){
            throw new RuntimeException("禁止通过反射创建");
        }
    }

    public static HuangrySingleton getInstance(){
        return instance;
    }

    public Object readResolve(){
        return (Object) instance;
    }
}
