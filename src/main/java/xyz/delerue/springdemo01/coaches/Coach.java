package xyz.delerue.springdemo01.coaches;

import org.springframework.stereotype.Component;

@Component
public interface Coach {
    String getDailyWorkout();
    String getDailyFortune();
}
