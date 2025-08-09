package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.example.demo.Dev;

public class App {
public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");

 Dev dev =  (Dev)  context.getBean("dev");
//  dev.setAge(9);
 System.out.println( dev.getAge());

}
}
