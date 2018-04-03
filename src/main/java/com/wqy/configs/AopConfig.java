package com.wqy.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.wqy.aspects")
@EnableAspectJAutoProxy
public class AopConfig {
}
