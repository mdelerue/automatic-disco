package xyz.delerue.springdemo01.coaches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import xyz.delerue.springdemo01.fortunes.ChuckFactsFortuneService;
import xyz.delerue.springdemo01.fortunes.FortuneService;

@Component
public class BaseballCoach implements Coach {

    @Autowired
    @Qualifier("chuckFactsFortuneService")
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        System.out.println(">> " + this.fortuneService + " : fortuneService address");
        return "Hit the ball : " + this.fortuneService.getFortune();
    }

    public void doMyStartupStuff() {
        System.out.println("Initializing Baseball coach " + this);
    }

    public void doMyShutdownMessyThings() {
        System.out.println("I'm shutting down " + this);
    }
}
