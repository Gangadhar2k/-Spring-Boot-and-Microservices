package com.SpringPractice;

import com.SpringPractice.Beans.ClassRoom;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        ClassRoom cr = (ClassRoom) context.getBean("cls");
        System.out.println(cr);
    }
}
