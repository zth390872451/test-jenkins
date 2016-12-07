package test.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {  
  
    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {  
        return "world";  
    }
    @ResponseBody
    @RequestMapping("/")
    public String test() {
        return "test";
    }
}  