package com.xuchang.patterns.creational.singleton;


public enum EnumSingleton {
    INSTANCE;

    public static  EnumSingleton getInstance(){
        return INSTANCE;
    }
}
