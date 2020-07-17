package com.eureka.eurekaclient;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@EnableZuulProxy
public class EurekaClientApplication {
	public static void main(String[] args) {
	    SpringApplication.run(EurekaClientApplication.class, args);
	  }

	  @Bean
	  public SimpleFilter simpleFilter() {
	    return new SimpleFilter();
	  }	
}
