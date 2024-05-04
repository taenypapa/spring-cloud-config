package com.taeny.papa.scc.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class SpringCloudConfigClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigClient2Application.class, args);
    }

}
