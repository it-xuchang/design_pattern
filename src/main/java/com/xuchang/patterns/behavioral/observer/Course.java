package com.xuchang.patterns.behavioral.observer;

import java.util.Observable;


public class Course extends Observable {

    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void produceQuestion(Course course,Question question){
        System.out.println(question.getUserName()+"在"+course.getCourseName()+"上提交问题："+question.getQuestionContent());

        // 修改状态
        setChanged();
        // 通知观测者
        notifyObservers(question);
    }
}
