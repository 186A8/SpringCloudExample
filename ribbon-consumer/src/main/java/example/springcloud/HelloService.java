package example.springcloud;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheKey;
import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheResult;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;
    private Logger logger = LogManager.getLogger(HelloService.class);

    @CacheResult
    @HystrixCommand(fallbackMethod = "helloFallback")
    public String helloService() {
        long start = System.currentTimeMillis();
        String rc = restTemplate.getForObject("http://eureka-client/hello", String.class);
        long end = System.currentTimeMillis();
        logger.info("Spend time : "+ (end - start));
        return rc;
    }

    public String helloFallback() {
        return "error";
    }
}
