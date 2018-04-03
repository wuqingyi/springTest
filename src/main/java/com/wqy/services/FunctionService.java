package com.wqy.services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class FunctionService {
    public String sayHello(String user){
        return "Hello "+user+"!";
    }
}
