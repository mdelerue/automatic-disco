package xyz.delerue.springdemo01.coaches;

import xyz.delerue.springdemo01.fortunes.FortuneService;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return "Hit the ball : " + this.fortuneService.getFortune();
    }

    public void doMyStartupStuff() {
        System.out.println("Initializing Baseball coach " + this);
    }

    public void doMyShutdownMessyThings() {
        System.out.println("I'm shutting down " + this);
    }
}
