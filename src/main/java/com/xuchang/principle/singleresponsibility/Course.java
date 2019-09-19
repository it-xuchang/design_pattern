package com.xuchang.principle.singleresponsibility;


public interface Course {

    String getCourseName();
    byte[] getCourseVideo();



    void studyCourse();
    void refundCourse();

}
