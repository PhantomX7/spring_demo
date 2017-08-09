/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phantomdeveloper.springtest1;

/**
 *
 * @author Phantom
 */
public class CricketCoach implements Coach{
    
    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    public CricketCoach() {
        System.out.println("I am here.... #CricketCoach");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("BUzzz....");
        this.fortuneService = fortuneService;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("Email buzzz");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("Team buzzz");
        this.team = team;
    }

    @Override
    public String getDailyWorkout() {
        return "Hit ball 5 times a day";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
    
}
