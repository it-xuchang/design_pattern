package com.xuchang.patterns.creational.singleton;

public class LasySingleton {

    private static LasySingleton instance;


    private LasySingleton(){
        if(instance !=null){
            throw new RuntimeException("禁止通过反射创建");
        }
    }

    public static LasySingleton getInstance(){
        synchronized (LasySingleton.class){
            if(instance == null){
                instance = new LasySingleton();
            }
        }

        return instance;
    }

    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+": "
                    +LasySingleton.getInstance());
                }
            }).start();
        }
    }
}
