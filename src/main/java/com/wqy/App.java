package com.wqy;

import com.wqy.configs.*;
import com.wqy.services.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        //spring基本使用
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
//        FunctionService service = context.getBean(FunctionService.class);
//        System.out.println(service.sayHello("wuqy"));
//        context.close();

        //服务上没有注解，配置类里面使用@Bean进行注解
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig2.class);
//        FunctionService2 service = context.getBean(FunctionService2.class);
//        System.out.println(service.sayHello("wuqy"));
//        context.close();

        //spring AOP，关注around建言。
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
//        context.scan("com.wqy.services");//可以再这里添加额外的包进行扫描。
        FunctionService service = context.getBean(FunctionService.class);
        System.out.println(service.sayHello("wuqy"));
        context.close();

        //@Scope用于描述的是Spring容器如何新建Bean的实例的，再service注解为prototype，每次使用该service，都会创建新的实例。
//        //因此service.equals(service2)为false。默认为singleton。
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
//        FunctionService service = context.getBean(FunctionService.class);
//        FunctionService service2 = context.getBean(FunctionService.class);
//        System.out.println(service.equals(service2));
//        context.close();

        //spring EL和资源调用，使用@Value注入数据，重点关注如何从配置文件中获取数据。
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
//        ElService service = context.getBean(ElService.class);
//        service.print();
//        context.close();


        //设置服务的初始化方法和销毁方法
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(InitDestroyConfig.class);
//        InitDestroyService initDestroyService = context.getBean(InitDestroyService.class);
//        initDestroyService.print();
//        context.close();

        //spring 多线程。
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
//        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
//        for (int i = 0; i < 10; i++) {
//            asyncTaskService.executeAsyncTask(i);
//            asyncTaskService.executeAsycTaskPlus(i);
//        }
//        context.close();


        //spring 计划任务，context不能调用close方法。
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScheduleConfig.class);


        
    }
}
