package xyz.delerue.springdemo01.coaches;

import xyz.delerue.springdemo01.fortunes.FortuneService;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    public void setEmailAddress(String emailAddress) {
        System.out.println("Inside setter - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("Inside setter - setTeam");
        this.team = team;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside setter - setFortuneService");
        this.fortuneService = fortuneService;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public CricketCoach() {
        System.out.println("Inside the no-arg constructor - Cricket Coach");
    }

    @Override
    public String getDailyWorkout() {
        return "Run from a plot to another. A lot...";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune() + ". We play against Pakistan !!";
    }
}
