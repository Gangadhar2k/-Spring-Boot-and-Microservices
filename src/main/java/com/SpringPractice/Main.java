package com.SpringPractice;

import com.SpringPractice.Beans.ClassRoom;
import com.SpringPractice.Beans.PrincipleRoom;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        PrincipleRoom pr =  context.getBean("probj",PrincipleRoom.class);
        System.out.println(pr);
    }
}
