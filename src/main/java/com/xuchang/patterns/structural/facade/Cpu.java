package com.xuchang.patterns.structural.facade;


public class Cpu implements Computer {
    @Override
    public void open() {
        System.out.println("启动CPU");
    }
}