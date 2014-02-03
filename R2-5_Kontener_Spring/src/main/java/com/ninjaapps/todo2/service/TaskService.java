package com.ninjaapps.todo2.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Author: Daniel
 */
public class TaskService
        implements ITaskService, InitializingBean, DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initialization...");
    }

    public void initMethod() {
        System.out.println("Init Method...");
    }

    public void defaultInitMethod() {
        System.out.println("DefaultInit Method...");
    }

    @Override
    public String getServiceId() {
        return "taskService#1";
    }

    @Override
    public void destroy() {
        System.out.println("Destroying...");
    }

    public void destroyMethod() {
        System.out.println("Destroy Method...");
    }

    public void defaultDestroyMethod() {
        System.out.println("DefaultDestroy Method...");
    }

}
