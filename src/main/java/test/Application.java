package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Administrator on 2016/11/23.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        System.out.println("Application.class args =  "+args);
        SpringApplication.run(Application.class, args);
    }
}
