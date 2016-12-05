package test;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import test.web.HomeController;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MockServletContext.class)
@WebAppConfiguration
public class HomeControllerTest {
    private static ConfigurableApplicationContext context;
    private static HomeController controller;


    @BeforeClass
    public static void setUp() {
        context = SpringApplication.run(Application.class, "");
        controller = (HomeController) context.getBean("homeController");
    }

    @Test
    public void testHello() {
        assertEquals(controller.hello(), "world");

    }

}