package xyz.delerue.springdemo01.fortunes;

import org.springframework.stereotype.Component;

@Component
public interface FortuneService {
    String getFortune();

}
