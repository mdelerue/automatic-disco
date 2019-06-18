package xyz.delerue.springdemo01.coaches;

import xyz.delerue.springdemo01.fortunes.FortuneService;

public class BasketballCoach implements Coach {

    private FortuneService fortuneService;

    public BasketballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice dunk in the morning";
    }

    @Override
    public String getDailyFortune() {
        return "Pass the ball, " + this.fortuneService.getFortune();
    }
}
