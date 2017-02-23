package sample.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        try (ConfigurableApplicationContext ctx = SpringApplication.run(Main.class, args)) {
            Hoge h = ctx.getBean(Hoge.class);
            System.out.println(h);
        }
    }

    @Bean
    public Hoge getHoge() {
        System.out.println("Main#getHoge()");
        return new Hoge("hoge");
    }
}
