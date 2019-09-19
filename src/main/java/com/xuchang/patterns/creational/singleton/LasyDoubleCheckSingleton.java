package com.xuchang.patterns.creational.singleton;


public class LasyDoubleCheckSingleton {

    // happens-before  写操作先于读操作
    private volatile static LasyDoubleCheckSingleton instance;

    private LasyDoubleCheckSingleton(){}

    public static LasyDoubleCheckSingleton getInstance(){
        if(instance == null){  // 第一次判断
            synchronized (LasyDoubleCheckSingleton.class){
                if(instance == null){   // 第二次判断
                    instance = new LasyDoubleCheckSingleton();
                }
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
                    + LasyDoubleCheckSingleton.getInstance());
                }
            }).start();
        }
    }
}
