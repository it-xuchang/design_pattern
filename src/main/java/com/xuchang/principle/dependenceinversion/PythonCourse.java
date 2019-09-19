package com.xuchang.principle.dependenceinversion;


public class PythonCourse implements Course {
    @Override
    public void studyCourse() {
        System.out.println("学习Python课程");
    }
}
