package com.xuchang.patterns.structural.decorator;


public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder(shape);
    }

    private void setRedBorder(Shape shape){
        System.out.println("画上红色边框");
    }
}
