package com.xuchang.patterns.behavioral.observer.spring;

import org.springframework.context.ApplicationEvent;


public class EmailEvent extends ApplicationEvent {

    private String content;

    public EmailEvent(Object source, String content) {
        super(source);
        this.content = content;
    }

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public EmailEvent(Object source) {
        super(source);
    }
}
