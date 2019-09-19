package com.xuchang.patterns.creational.singleton;

public class StaticInnerClassSingleton {

    private static class InnerClass{
        static {
            System.out.println("innerclass");
        }
        private static StaticInnerClassSingleton
                instance = new StaticInnerClassSingleton();
    }

    private StaticInnerClassSingleton(){

    }

    public static StaticInnerClassSingleton getInstance(){
        System.out.println("getInstance");
        return InnerClass.instance;
    }

    public static void main(String[] args) {
        StaticInnerClassSingleton.getInstance();
    }
}
