package com.spring.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"com.spring.annotation",
		"com.spring.model"})
public class EntityConfigurations {

}
