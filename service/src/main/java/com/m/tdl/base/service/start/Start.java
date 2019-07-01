package com.m.tdl.base.service.start;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Start {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
        context.setConfigLocation("/spring/dubbo-provider-context.xml");
        context.refresh();
        System.out.println("DemoService provider (XML) is starting...");
        System.in.read();
    }
}
