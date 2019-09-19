package com.xuchang.principle.openclose;



public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(String name, Double price) {
        super( name, price);
    }

    public Double getDiscountPrice(){
        return super.getPrice()*0.8;
    }

}
