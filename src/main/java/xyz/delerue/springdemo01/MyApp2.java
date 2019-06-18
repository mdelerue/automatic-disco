package xyz.delerue.springdemo01;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.delerue.springdemo01.coaches.Coach;
import xyz.delerue.springdemo01.coaches.CricketCoach;

public class MyApp2 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("scopeApplicationContext.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach theCoachBis = context.getBean("myCoach", Coach.class);

        System.out.println("Same bean :" + (theCoach == theCoachBis));

        context.close();
    }

}
