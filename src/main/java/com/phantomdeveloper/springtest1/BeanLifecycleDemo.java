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
public class BeanLifecycleDemo {
    public static void main(String[] args) {
        
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanLifecycleApplicationContext.xml");
        
        Coach coach=context.getBean("myCoach",Coach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune()); 
        
        
        context.close();
    }
}
