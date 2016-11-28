package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public StringBuilder home() {
        List<String> streamList = Arrays.asList("Hello,", " World!");
        StringBuilder sb = new StringBuilder();
        for(String s : streamList) {
            sb.append(s);
        }
        return sb;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}