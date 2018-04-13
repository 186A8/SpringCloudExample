package example.springcloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ConfigClientApplication {
    public static void main(String[] args) {
//        SpringApplication.run(ConfigServerApplication.class,args);args
        new SpringApplicationBuilder(ConfigClientApplication.class).web(true).run(args);
    }
}
