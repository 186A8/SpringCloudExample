package example.springcloud;

import example.springcloud.dto.User;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
//    @Qualifier(value ="helloService")
    HelloService helloService;
    private final Logger logger = Logger.getLogger(getClass());

    @RequestMapping(value = "/feign-consumer", method = RequestMethod.GET)
    public String helloConsumer() {
        logger.info("call helloConsumer...");
        return helloService.hello();
    }

    @RequestMapping(value = "/feign-consumer2", method = RequestMethod.GET)
    public String helloConsumer2() {
        StringBuilder sb = new StringBuilder();
        sb.append(helloService.hello()).append("<br/>");
        sb.append(helloService.hello("DIDI")).append("<br/>");
        sb.append(helloService.hello("DIDI", 30)).append("<br/>");
        sb.append(helloService.hello(new User("DIDI", 30))).append("<br/>");
        return sb.toString();
    }

    @Autowired
    RefactorHelloService  refactorHelloService;

    @RequestMapping(value = "/feign-consumer3", method = RequestMethod.GET)
    public String helloConsumer3() {
        StringBuilder sb = new StringBuilder();
        sb.append(refactorHelloService.hello("MIMI")).append("<br/>");
        sb.append(refactorHelloService.hello("MIMI", 35)).append("<br/>");
        sb.append(refactorHelloService.hello(new example.springcloud.dto.User("MIMI", 35))).append("<br/>");
        return sb.toString();
    }
}
