package com.rumenz;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class UserService {

      @Autowired
      ApplicationEventPublisher  ae;

      public void reg(String name){
          System.out.println("用户注册"+name);
          ae.publishEvent(new UserServiceEvent(name));
      }
}
