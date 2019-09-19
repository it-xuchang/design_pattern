package com.xuchang.principle.dependenceinversion;


public class Test {


    public static void main(String[] args) {

        Teacher teacher = new Teacher();
        teacher.studyJavaCource();
        teacher.studyPythonCource();

        User user = new User();
        user.setCourse(new JavaCourse());
        user.studyCourse();


        user = new User();
        user.setCourse(new PythonCourse());
        user.studyCourse();

    }


}
