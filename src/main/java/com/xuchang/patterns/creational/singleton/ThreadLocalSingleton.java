package com.xuchang.patterns.creational.singleton;

public class ThreadLocalSingleton {

    private static ThreadLocal<ThreadLocalSingleton> threadLocal = new ThreadLocal(){
        @Override
        protected Object initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton(){}

    public static ThreadLocalSingleton getInstance(){
        return threadLocal.get();
    }


    public static void main(String[] args) {
        System.out.println(ThreadLocalSingleton.getInstance());
        for(int i=0;i<5;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {

                    System.out.println(Thread.currentThread().getName()+": "
                            +ThreadLocalSingleton.getInstance());
                }
            }).start();
        }
    }
}
