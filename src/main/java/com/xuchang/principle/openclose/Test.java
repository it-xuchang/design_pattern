package com.xuchang.principle.openclose;


public class Test {
    public static void main(String[] args) {

        Course course = new JavaCourse("Java开发", 500d);

        System.out.println(course.getPrice());


    }
}
