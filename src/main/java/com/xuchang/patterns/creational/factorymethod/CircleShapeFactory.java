package com.xuchang.patterns.creational.factorymethod;



/**
 * 方法工厂
 */
public class CircleShapeFactory extends ShapeFactory {

    @Override
    public Shape getShape() {
        return new Circle();
    }

}
