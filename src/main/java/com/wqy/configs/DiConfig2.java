package com.wqy.configs;

import com.wqy.services.FunctionService2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DiConfig2 {
    @Bean
    public FunctionService2 getFunctionService2(){
        return new FunctionService2();
    }
}
