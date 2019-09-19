package com.xuchang.patterns.behavioral.observer;

import java.util.Observable;
import java.util.Observer;


public class Teacher implements Observer {
    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.println(teacherName+"接收到"+course.getCourseName()+"提交的问题："+question.getQuestionContent());

    }
}
