package com.jacken.actuatoradminserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * adminui  监控中心2.1.9版本有问题 ，必须要用 低版
 * 2.0.5
 */
@EnableAutoConfiguration
@Configuration
@EnableAdminServer
public class ActuatorAdminServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActuatorAdminServerApplication.class, args);
    }

}
