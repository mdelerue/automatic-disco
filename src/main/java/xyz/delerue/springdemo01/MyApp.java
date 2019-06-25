package xyz.delerue.springdemo01;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.delerue.springdemo01.coaches.BaseballCoach;
import xyz.delerue.springdemo01.coaches.Coach;
import xyz.delerue.springdemo01.coaches.CricketCoach;

public class MyApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        Coach theCoach = context.getBean(BaseballCoach.class);
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        CricketCoach theSecondCoach = context.getBean("cricketCoach", CricketCoach.class);
        System.out.println(theSecondCoach.getDailyWorkout());
        System.out.println(theSecondCoach.getDailyFortune());
        System.out.println(theSecondCoach.getEmailAddress());
        System.out.println(theSecondCoach.getTeam());


        Coach baseballCoach = context.getBean("baseballCoach", Coach.class);
        System.out.println(baseballCoach.getDailyWorkout());
        System.out.println(baseballCoach.getDailyFortune());

        Coach basketballCoach = context.getBean("basketballCoach", Coach.class);
        System.out.println(basketballCoach.getDailyWorkout());
        System.out.println(basketballCoach.getDailyFortune());

        Coach trackCoach1 = context.getBean("myTrackCoach", Coach.class);
        Coach trackCoach2 = context.getBean("myTrackCoach", Coach.class);

        System.out.println("track coach identical ? : " + (trackCoach1 == trackCoach2));

        context.close();
    }

}
