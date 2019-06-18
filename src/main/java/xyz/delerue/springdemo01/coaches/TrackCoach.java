package xyz.delerue.springdemo01.coaches;

import xyz.delerue.springdemo01.fortunes.FortuneService;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }
}
