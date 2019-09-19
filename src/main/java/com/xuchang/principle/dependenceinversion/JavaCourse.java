package com.xuchang.principle.dependenceinversion;


public class JavaCourse implements Course {

    @Override
    public void studyCourse() {
        System.out.println("学习Java课程");
    }
}
