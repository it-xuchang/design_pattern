package com.xuchang.patterns.structural.facade;

public class Ssd implements Computer {
    @Override
    public void open() {
        System.out.println("启动硬盘");
    }
}