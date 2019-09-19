package com.xuchang.principle.openclose;


public class JavaCourse implements Course{

    private String name;
    private Double price;

    public JavaCourse(String name, Double price) {

        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public Double getPrice() {
        return this.price;
    }


}
