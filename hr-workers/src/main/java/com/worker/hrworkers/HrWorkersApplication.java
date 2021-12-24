package com.worker.hrworkers;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HrWorkersApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrWorkersApplication.class, args);
    }

}
