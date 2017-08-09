/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phantomdeveloper.springtest1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Phantom
 */
public class SetterInjectionDemo {
    public static void main(String[] args) {
        // load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
				
		// retrieve bean from spring container
		CricketCoach theCoach = context.getBean("cricketCoach", CricketCoach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
                System.out.println(theCoach.getDailyFortune());
                System.out.println(theCoach.getEmailAddress()+"---"+theCoach.getTeam());
		
		// close the context
		context.close();
    }
}
