package com.xuchang.patterns.behavioral.chainofresponsibility;

import org.springframework.util.StringUtils;


public class PPTApproverHandler extends ApproverHandler {
    @Override
    public void publish(Course course) {
        if(!StringUtils.isEmpty(course.getArticle())){
            System.out.println(course.getName()+",有ppt，批准");
            if(getNext()!=null){
                getNext().publish(course);
            }
        }else {
            System.out.println(course.getName()+",不含ppt，不批准");
        }
    }
}
