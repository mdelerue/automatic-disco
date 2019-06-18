package xyz.delerue.springdemo01.fortunes;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ChuckFactsFortuneService implements FortuneService {

    private List<String> fortunes = Stream.of("Chuck Norris threw a grenade and killed 50 people, then it exploded.", "Death once had a near-Chuck-Norris experience.", "Chuck Norris can strangle you with a cordless phone.")
            .collect(Collectors.toList());

    public String getFortune() {
        Random r = new Random();
        return this.fortunes.get(r.nextInt(this.fortunes.size()));
    }
}
