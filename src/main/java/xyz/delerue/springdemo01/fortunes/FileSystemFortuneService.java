package xyz.delerue.springdemo01.fortunes;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Component
public class FileSystemFortuneService implements FortuneService {

    private List<String> fortunes;

    @Override
    public String getFortune() {
        Random r = new Random();
        return this.fortunes.get(r.nextInt(this.fortunes.size()));
    }


    @PostConstruct
    public void initMyFortunes() {
        try {
            Path path = Paths.get(ClassLoader.getSystemResource("fortunes.txt").toURI());
            this.fortunes = (Files.lines(path)).collect(Collectors.toList());

        } catch (URISyntaxException | IOException e) {
            this.fortunes = new ArrayList<>();
            this.fortunes.add("We gonna have a problem here");
        }
    }
}
