package com.xuchang.patterns.behavioral.chainofresponsibility;

/**
 * 抽象处理者（Handler）角色：定义一个处理请求的接口，包含抽象处理方法和一个后继连接。
 * 批准者
 */
public abstract class ApproverHandler {

    private ApproverHandler next;

    // 处理请求的方法  handlerRequest(Request request)
    public abstract void publish(Course course);

    public ApproverHandler getNext() {
        return next;
    }

    public void setNext(ApproverHandler next) {
        this.next = next;
    }
}
