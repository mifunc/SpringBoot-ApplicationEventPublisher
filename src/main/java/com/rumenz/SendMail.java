package com.rumenz;


import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Service
public class SendMail implements ApplicationListener<UserServiceEvent> {
    @Override
    public void onApplicationEvent(UserServiceEvent event) {
        System.out.println("邮件已经发送"+event);
    }
}
