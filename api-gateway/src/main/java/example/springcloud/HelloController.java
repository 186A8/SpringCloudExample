package example.springcloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/local/hello")
    public String hellow(){
        return "Hello World Local!";
    }
}
