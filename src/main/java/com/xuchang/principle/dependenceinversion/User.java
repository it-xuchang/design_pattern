package com.xuchang.principle.dependenceinversion;


public class User {

    private Course course;

//    public User(Course course){
//        this.course = course;
//    }


    public void studyCourse(){
        course.studyCourse();
    }


    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
