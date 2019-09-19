package com.xuchang.patterns.behavioral.observer.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


public class MyApplicationListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {

        if(event instanceof EmailEvent){
            System.out.println("接收了一个事件"+event);
        }


    }

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(MyApplicationListener.class);


        context.publishEvent(new EmailEvent("发一份邮件"));

        ((AnnotationConfigApplicationContext) context).close();

    }
}
