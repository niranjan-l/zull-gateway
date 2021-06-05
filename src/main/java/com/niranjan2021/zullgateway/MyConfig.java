package com.niranjan2021.zullgateway;


import com.netflix.zuul.ZuulFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {


    @Bean
    public ZuulFilter zuulFilter(){
        return  new MyFilter();
    }
}
