package com.xuchang.principle.demeter;

import java.util.ArrayList;
import java.util.List;


public class TeamLeader {


    public void checkNumberOfCourses(){

        // 去查一下课程数
        List<Course> courseList = new ArrayList<Course>();
        for(int i = 0 ;i < 10;i++){
            courseList.add(new Course());
        }

        System.out.println("在线课程的数量是："+courseList.size());
    }



}
