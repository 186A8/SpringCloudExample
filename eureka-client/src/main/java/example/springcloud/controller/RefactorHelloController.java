package example.springcloud.controller;

import example.springcloud.dto.User;
import example.springcloud.service.HelloService;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RefactorHelloController implements HelloService {
    private final Logger logger = Logger.getLogger(getClass());

    @Override
    public String hello(String name) {
        logger.info("call hello(name "+name+") ==============================================");
        return "Hello "+ name;
    }

    @Override
    public User hello(String name, Integer age) {
        logger.info("call hello(name "+name+", age "+age+") ==============================================");
        return new User(name, age);
    }

    @Override
    public String hello(User user) {
        logger.info("call hello(User user) ==============================================" + user.toString());
        return "Hello "+ user.getName() + ", " + user.getAge();
    }
}
