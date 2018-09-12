package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MyConfig extends WebMvcConfigurerAdapter {
/*  @Override
public void addResourceHandlers(ResourceHandlerRegistry registry) {
	registry.addResourceHandler("css/").addResourceLocations("resources/static/css/");
}*/
}
