package com.xuchang.patterns.behavioral.chainofresponsibility;

import org.springframework.util.StringUtils;


public class VideoApproverHandler extends ApproverHandler {
    @Override
    public void publish(Course course) {
        if(!StringUtils.isEmpty(course.getArticle())){
            System.out.println(course.getName()+",有视频，批准");
            if(getNext()!=null){
                getNext().publish(course);
            }
        }else {
            System.out.println(course.getName()+",不含视频，不批准");
        }
    }
}
