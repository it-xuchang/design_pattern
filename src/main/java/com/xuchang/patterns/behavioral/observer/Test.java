package com.xuchang.patterns.behavioral.observer;

/**
 * 观察者模式
 * 定义：定义了对象之间的一对多依赖，让多个观察者对象同时监听某一个主题对象，当主题对象发生变化时，它的所有依赖者（观察者）都会收到通知并更新
 * 类型：行为型
 * 适用场景：关联行为场景，建立一套触发机制
 * 优点：
 * 观测者和被观测者之间建立一个抽象的耦合
 * 观测者模式支持广播通信
 * 缺点：
 * 观测者之间有过多的细节依赖、提高时间消耗及程序复杂度
 * 使用要得当，要避免循环调用
 */
public class Test {

    public static void main(String[] args) {
        Course course = new Course("Java设计模式");
        Teacher teacher = new Teacher("老师");

        //被观察者绑定观测者
        course.addObserver(teacher);

        Question question = new Question();
        question.setUserName("用户");
        question.setQuestionContent("什么是Java观察者模式");

        course.produceQuestion(course,question);
    }
}
