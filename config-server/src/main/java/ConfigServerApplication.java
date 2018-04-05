import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.boot.builder.SpringApplicationBuilder;
        import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {
    public static void main(String[] args) {
//        SpringApplication.run(ConfigServerApplication.class,args);args
        new SpringApplicationBuilder(ConfigServerApplication.class).web(true).run(args);
    }
}
