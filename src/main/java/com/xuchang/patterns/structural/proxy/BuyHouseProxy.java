package com.xuchang.patterns.structural.proxy;


public class BuyHouseProxy implements BuyHouse{

    private BuyHouse buyHouse;

    public BuyHouseProxy(BuyHouse buyHouse) {
        this.buyHouse = buyHouse;
    }

    @Override
    public void buyHouse() {
        System.out.println("准备");
        buyHouse.buyHouse();
        System.out.println("装修");
    }
}
