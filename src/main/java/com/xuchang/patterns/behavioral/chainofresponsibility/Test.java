package com.xuchang.patterns.behavioral.chainofresponsibility;

/**
 * 责任链模式
 * 定义：允许一个对象在其内部状态改变时，改变它的行为
 * 类型：行为型
 * 适用场景：一个对象存在多个状态（不同状态下行为不同），且状态可互相转换
 * 优点：
 * 将不同的状态隔离
 * 把各种状态的转换逻辑，分布到State的子类中，减少互相间依赖
 * 增加新的状态非常简单
 * 缺点：状态多的业务场景导致类数目增加，系统变复杂
 */
public class Test {

    public static void main(String[] args) {

        Course course = new Course();
        course.setName("Java设计模式");
        course.setArticle("Java设计模式笔记");
        course.setVideo("Java设计模式视频");
        course.setVideo("Java设计模式ppt");

        // 组装责任链
        ApproverHandler articleApproverHandler = new ArticleApproverHandler();
        ApproverHandler vidowApproverHandler = new VideoApproverHandler();

        ApproverHandler pptApproverHandler = new PPTApproverHandler();

        // 传入下一个执行对象
        articleApproverHandler.setNext(vidowApproverHandler);
        vidowApproverHandler.setNext(pptApproverHandler);

        //提交请求
        articleApproverHandler.publish(course);

    }

}
