package com.wqy.configs;

import com.wqy.services.InitDestroyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.wqy.services")
public class InitDestroyConfig {
//    @Bean(initMethod = "init", destroyMethod = "destroy")
//    public InitDestroyService getInitDestroyService(){
//        return new InitDestroyService();
//    }

}
