package com.myTraining.core.services.impl;


import org.osgi.service.component.annotations.Component;
import com.myTraining.core.services.HelloWorldService;

@Component(service = HelloWorldService.class, immediate = true)
public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public String getMessage() {
        return "Hello World from AEM Service!";
    }
}
