package com.xuchang.patterns.structural.decorator;

/**
 * 定义：在不改变原有对象的基础之上，将功能附加到对象上
 * 提供了比继承更有弹性的代替方案（扩展原有对象功能）
 * 类型：结构型
 *
 * 适用场景：
 * 扩展一个类的功能或给一个类添加附加职责
 * 动态的给一个对象添加功能，这些功能可以再动态的撤销
 * 优点：
 * - 继承的有力补充，比继承灵活，不改变原有对象的情况下给一个对象扩展功能
 * - 通过使用不同装饰类以及这些装饰类的排列组合，可以实现不同效果
 * - 符合开闭原则
 * 缺点：
 * - 会出现更多的代码，跟多的类，增加程序复杂性
 * - 动态装饰时，多层装饰时会更复杂
 */
public class Test {

    public static void main(String[] args) {
        Shape circle = new Circle();
        Rectangle rectangle = new Rectangle();

        ShapeDecorator shapeDecorator = new RedShapeDecorator(circle);
        ShapeDecorator shapeDecorator2 = new RedShapeDecorator(rectangle);

        shapeDecorator.draw();
        shapeDecorator2.draw();

    }
}
