package myspringboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        String fn ="";
        for (int i = 0; i < 10; i++) {
             fn ="a"+"b";
        }

        String c = fn;
        SpringApplication.run(DemoApplication.class, args);

    }

}
