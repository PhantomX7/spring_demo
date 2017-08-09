/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phantomdeveloper.springtest1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Lab04
 */
public class BeanScopeDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");
        
        Coach coachA=context.getBean("myCoach",Coach.class);
        Coach coachB=context.getBean("myCoach",Coach.class);
        System.out.println(coachA);
        System.out.println(coachB);
        
        context.close();
    }
}
