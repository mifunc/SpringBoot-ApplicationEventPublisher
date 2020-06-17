package com.rumenz;

import org.springframework.context.ApplicationEvent;

public class UserServiceEvent extends ApplicationEvent {
    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public UserServiceEvent(Object source) {
        super(source);
    }
}
