package com.hogwartsmini.demo.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.nio.charset.Charset;
import java.util.List;

@Configuration  //声明为bean
public class WebMvcConfig extends WebMvcConfigurationSupport {

    @Autowired
    private DemoInterceptor demoInterceptor;
    @Override   //标注继承父类的方法
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(demoInterceptor).addPathPatterns("/**")
        .excludePathPatterns("/hogwarts/login")
                ;
    }

    protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        super.configureMessageConverters(converters);
        converters.add(messageConverter());
    }
    @Bean
    public HttpMessageConverter<String> messageConverter(){
        return new StringHttpMessageConverter(Charset.forName("UTF-8"));
    }

}
