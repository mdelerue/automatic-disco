package xyz.delerue.springdemo01;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.delerue.springdemo01.coaches.BaseballCoach;
import xyz.delerue.springdemo01.coaches.Coach;
import xyz.delerue.springdemo01.coaches.CricketCoach;

public class MyApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        /*
        Coach theCoach = context.getBean(BaseballCoach.class);
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        Coach theCoachBis = context.getBean(BaseballCoach.class);
        */

        CricketCoach theSecondCoach = context.getBean("cricketCoach", CricketCoach.class);
        System.out.println(theSecondCoach.getDailyWorkout());
        System.out.println(theSecondCoach.getDailyFortune());
        System.out.println(theSecondCoach.getEmailAddress());
        System.out.println(theSecondCoach.getTeam());


        Coach trackCoach = context.getBean("baseballCoach", Coach.class);
        System.out.println(trackCoach.getDailyWorkout());
        System.out.println(trackCoach.getDailyFortune());

        Coach basketballCoach = context.getBean("basketballCoach", Coach.class);
        System.out.println(basketballCoach.getDailyWorkout());
        System.out.println(basketballCoach.getDailyFortune());

        context.close();
    }

}
