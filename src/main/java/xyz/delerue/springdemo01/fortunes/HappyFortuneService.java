package xyz.delerue.springdemo01.fortunes;

public class HappyFortuneService implements FortuneService {


    @Override
    public String getFortune() {
        return "Today is your lucky day";
    }
}
