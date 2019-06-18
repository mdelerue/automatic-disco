package xyz.delerue.springdemo01;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.delerue.springdemo01.coaches.Coach;
import xyz.delerue.springdemo01.coaches.CricketCoach;

public class MyApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        CricketCoach theSecondCoach = context.getBean("mySecondCoach", CricketCoach.class);
        System.out.println(theSecondCoach.getDailyWorkout());
        System.out.println(theSecondCoach.getDailyFortune());
        System.out.println(theSecondCoach.getEmailAddress());
        System.out.println(theSecondCoach.getTeam());

        context.close();
    }

}
