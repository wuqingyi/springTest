package com.wqy.services;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {
    @Async
    public void executeAsyncTask(int i){
        System.out.println("执行异步任务："+i);
    }

    @Async
    public void executeAsycTaskPlus(int i){
        System.out.println("执行异步任务+1："+i);
    }
}
