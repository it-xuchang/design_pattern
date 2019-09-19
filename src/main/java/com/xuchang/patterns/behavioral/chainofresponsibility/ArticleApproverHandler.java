package com.xuchang.patterns.behavioral.chainofresponsibility;

import org.springframework.util.StringUtils;

/**
 * 责任链模式  具体处理者角色
 */
public class ArticleApproverHandler extends ApproverHandler {
    @Override
    public void publish(Course course) {
        if(!StringUtils.isEmpty(course.getArticle())){
            System.out.println(course.getName()+",有笔记，批准");
            if(getNext()!=null){
                getNext().publish(course);
            }
        }else {
            System.out.println(course.getName()+",不含笔记，不批准");
        }
    }
}
