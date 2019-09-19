package com.xuchang.patterns.structural.facade;



public class Ddr implements Computer {
    @Override
    public void open() {
        System.out.println("启动内存");
    }
}