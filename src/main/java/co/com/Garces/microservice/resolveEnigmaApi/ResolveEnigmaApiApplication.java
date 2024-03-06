package co.com.Garces.microservice.resolveEnigmaApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = { "co.com.Garces.microservice.resolveEnigmaApi", "co.com.Garces.microservice.resolveEnigmaApi.api" , "co.com.Garces.microservice.resolveEnigmaApi.config"})
public class ResolveEnigmaApiApplication {

    public static void main(String[] args) throws Exception {
        new SpringApplication(ResolveEnigmaApiApplication.class).run(args);
    }
}
