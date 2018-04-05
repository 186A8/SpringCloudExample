package example.springcloud;

import example.springcloud.service.HelloService;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "eureka-client",fallback = HelloServiceFallback.class)
public interface RefactorHelloService extends HelloService {

}
