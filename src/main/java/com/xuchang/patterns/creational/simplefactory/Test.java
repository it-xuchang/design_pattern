package com.xuchang.patterns.creational.simplefactory;

/**
 *
 定义：由一个工厂对象决定创建出哪一种产品类的实例
 简单工厂模式的实质是由一个工厂类根据传入的参数，动态决定应该创建哪一个产品类。
 类型：创建型，但不属于GOF23设计模式。
 适用场景：
 工厂类负责创建的对象比较少
 客户端（应用层）只需要知道传入工厂类的参数，对于如何创建对象（逻辑）不关心
 优点：只需要传入一个正确的参数，就可以获取你所需要的对象，而无需知道其细节创建
 缺点：工厂类的职责相对过重，增加新的产品，需要修改工厂类的判断逻辑，违背了开闭原则
 */
public class Test {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape = shapeFactory.getShape(Circle.class);

        shape.draw();


    }
}