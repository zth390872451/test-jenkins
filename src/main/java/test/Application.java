package test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Administrator on 2016/11/23.
 */
@SpringBootApplication
public class Application {
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        System.out.println("Application.class args =  "+args);
        SpringApplication app = new SpringApplication(Application.class);
        app.run(args);
       /* SimpleCommandLinePropertySource source = new SimpleCommandLinePropertySource(args);

        Environment env = app.run(args).getEnvironment();
        try {
            log.info("Access URLs:\n ----------------------------------------------------------\n\t" +
                            "Local: \t\t http://127.0.0.1:{}\n\t" +
                            "External: \t http://{}:{} \n----------------------------------------------------------",
                    env.getProperty("server.port"),
                    InetAddress.getLocalHost().getHostAddress(),
                    env.getProperty("server.port"));
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }*/
        log.error("test success???");
        System.out.println("true = " + true);
    }
}
