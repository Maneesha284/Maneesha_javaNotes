package com.orderannotationdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"com.test","com.test1"})
public class AppConfig {

}
