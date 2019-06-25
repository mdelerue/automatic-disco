package xyz.delerue.springdemo01.coaches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import xyz.delerue.springdemo01.fortunes.FortuneService;

@Component("myTrackCoach")
@Scope("prototype")
public class TrackCoach implements Coach {

    private FortuneService fortuneService;


    @Autowired
    public TrackCoach(@Qualifier("happyFortuneService") FortuneService fortuneService) {
        System.out.println("TrackCoach - Constructor");
        System.out.println(">> " + fortuneService + " : fortuneService address");
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
