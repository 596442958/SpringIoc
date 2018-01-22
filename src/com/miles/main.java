package com.miles;

import com.miles.Service.UserRepository;
import com.miles.comtroller.Home;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        Home home = (Home) ctx.getBean("home");
        System.out.println(home);
    }
}
