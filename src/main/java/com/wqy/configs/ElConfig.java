package com.wqy.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan("com.wqy.services")
@PropertySource({"classpath:test.properties", "classpath:hello.txt"}) //如果使用maven管理项目， test.properties必须放在 src/main/resources 这个文件夹中，否则报错.
public class ElConfig {
    //必须创建一个PropertySourcesPlaceholderConfigurer，才能从配置文件中读取数据。
    @Bean
    public PropertySourcesPlaceholderConfigurer propertyConfigure() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
