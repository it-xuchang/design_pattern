package com.xuchang.patterns.creational.simplefactory;

/**
 * 形状工厂
 */
public class ShapeFactory {

    /**
     * 使用 getShape 方法获取形状类型的对象
     * @param shapeType
     * @return
     */
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

    public Shape getShape(Class clazz){
        Shape shape = null;
        try {
            shape = (Shape) clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return shape;
    }


}