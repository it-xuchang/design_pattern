package com.xuchang.patterns.creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * 定义：保证一个类仅有一个实例，并提供一个全局访问点
 * 类型：创建型
 * 适用场景：
 * 想确保任何情况下都绝对只有一个实例
 * 优点：
 * 在内存里只有一个实例，减少了内存开销
 * 可以避免对资源的多重占用
 * 设置全局访问点，严格的控制访问
 * 缺点：
 * 没有接口，扩展困难
 * 注意项：
 * 私有构造器
 * 线程安全
 * 延迟加载
 * 序列化和反序列化安全
 * 防止反射攻击
 * 应用：
 * Jdk:
 * Runtime
 * Spring
 */
public class Test {

    public static void main(String[] args) throws Exception{

//        HuangrySingleton singleton1 = HuangrySingleton.getInstance();
//
//        ObjectOutputStream out1 = new ObjectOutputStream(new FileOutputStream("singletonFile"));
//        out1.writeObject(singleton1);
//
//        ObjectInputStream in = new ObjectInputStream(new FileInputStream("singletonFile"));
//
//        HuangrySingleton newSingleton = (HuangrySingleton) in.readObject();
//
//        System.out.println(singleton);
////        System.out.println(newSingleton);
//
//        Class clazz = HuangrySingleton.class;
//        Constructor constructor = clazz.getDeclaredConstructor();
//
//        constructor.setAccessible(true);
//        Object newInstance = constructor.newInstance();
//
//        System.out.println(newInstance);


//        Class clazz = LasySingleton.class;
//        Constructor constructor = clazz.getDeclaredConstructor();
//
//        constructor.setAccessible(true);
//        Object newInstance = constructor.newInstance();
//
//
//        LasySingleton instance = LasySingleton.getInstance();
//
//
//        System.out.println(instance);
//        System.out.println(newInstance);


        EnumSingleton singleton = EnumSingleton.getInstance();
//
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singletonFile"));
        out.writeObject(singleton);

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("singletonFile"));

        EnumSingleton newSingleton = (EnumSingleton) in.readObject();

        System.out.println(singleton);
        System.out.println(newSingleton);


        Class clazz = EnumSingleton.class;
        Constructor constructor = clazz.getDeclaredConstructor(String.class,int.class);
        constructor.setAccessible(true);
        constructor.newInstance("fox",10);



    }
}
