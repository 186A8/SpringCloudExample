package example.springcloud;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class ConsumerController {

    //    @Autowired
//    RestTemplate restTemplate;
//
//    @GetMapping(value = "/ribbon-consumer")
//    public String helloConsumer() {
////        return restTemplate.getForEntity("http://eureka-client/hello",
////                String.class).getBody();
//        return restTemplate.getForObject("http://eureka-client/hello",String.class);
//    }
    @Autowired
    HelloService helloService;

    @GetMapping(value = "/ribbon-consumer")
    public String helloConsumer() {
        return helloService.helloService();
    }
}