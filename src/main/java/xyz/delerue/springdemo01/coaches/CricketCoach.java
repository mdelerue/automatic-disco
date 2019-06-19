package xyz.delerue.springdemo01.coaches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import xyz.delerue.springdemo01.fortunes.FortuneService;

import java.beans.BeanProperty;

@Component
public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    @Value("${foo.email}")
    private String emailAddress;
    @Value("${foo.team}")
    private String team;

    public void setEmailAddress(String emailAddress) {
        System.out.println("Inside setter - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("Inside setter - setTeam");
        this.team = team;
    }

    @Autowired
    @Qualifier("fileSystemFortuneService")
    public void yoyoyoyo(FortuneService fortuneService) {
        System.out.println("Inside yoyoyoo - setFortuneService");
        System.out.println(">> " + fortuneService);
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
        return this.fortuneService.getFortune() ;
    }
}
