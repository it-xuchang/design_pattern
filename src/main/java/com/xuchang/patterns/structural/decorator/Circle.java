package com.xuchang.patterns.structural.decorator;


public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个圆");
    }
}
