package com.wqy.services;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ElService {

    @Value("Hello world!")
    private String normal;

    @Value("#{systemProperties['os.name']}")
    private String osName;

    @Value("#{T(java.lang.Math).random()*100.0}")
    private double randNum;

    @Value("classpath:hello.txt")
    private Resource testFile;

    @Value("http://www.baidu.com")
    private Resource testUrl;

    //从test.properties配置文件中获取数据。
    @Value("${book.author}")
    private String author;

    public void print() throws IOException {
        System.out.println(this.normal);
        System.out.println(this.osName);
        System.out.println(this.randNum);
        System.out.println(IOUtils.toString(this.testFile.getInputStream()));
        System.out.println(this.testUrl);
        System.out.println(this.author);
    }
}
