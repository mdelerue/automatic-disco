package xyz.delerue.springdemo01.coaches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import xyz.delerue.springdemo01.fortunes.FortuneService;

@Component
public class BasketballCoach implements Coach {



    private FortuneService fortuneService;


    @Autowired
    @Qualifier("happyFortuneService")
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Basketball coach fortuneService Setter");
        System.out.println(">> " + fortuneService + " : fortuneService address");
        this.fortuneService = fortuneService;
    }

    public BasketballCoach() {
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
