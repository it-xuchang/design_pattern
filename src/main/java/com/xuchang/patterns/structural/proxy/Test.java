package com.xuchang.patterns.structural.proxy;

import java.lang.reflect.Proxy;

/**
 * 代理模式
 * 定义：为其他对象提供一种代理，以控制对这个对象的访问
 * 代理对象在客户端和目标对象之间起到中介的作用
 *
 * 类型：结构型
 * 适用场景：
 * 保护目标对象
 * 增强目标对象
 * 优点：
 *  代理模式能将代理对象与真实被调用的目标对象分离
 *  一定程度上降低了系统 的耦合度，扩展性好
 *  保护目标对象
 *  增强目标对象
 * 缺点：
 *  代理模式会造成系统设计中类的数目增加
 *  在客户端和目标对象增加一个代理对象，会造成请求处理速度变慢
 *  增加系统的复杂度
 * 扩展：
 *  静态代理
 *  动态代理
 */
public class Test {

    public static void main(String[] args) {
        BuyHouseImpl buyHouse = new BuyHouseImpl();

        BuyHouseProxy proxy = new BuyHouseProxy(buyHouse);
        proxy.buyHouse();

        BuyHouse buyHouse1 = (BuyHouse) Proxy.newProxyInstance(Test.class.getClassLoader(),
                new Class[]{BuyHouse.class},new JDKInvocationHandler(buyHouse));

        buyHouse1.buyHouse();

        BuyHouse buyHouse2 =(BuyHouse) new CglibInteceptor(buyHouse).getProxy();
        buyHouse2.buyHouse();


    }


}
