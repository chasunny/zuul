package com.example.netflixzuulapigatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;





@EnableDiscoveryClient
@EnableZuulProxy
@SpringBootApplication
@EnableFeignClients("com.example.netflixzuulapigatewayserver")
public class NetflixZuulApiGatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixZuulApiGatewayServerApplication.class, args);
	}
	
//	@Bean
//	public PreFilter preFilter() {
//		return new PreFilter();
//	}
//
//	@Bean
//	public PostFilter postFilter() {
//		return new PostFilter();
//	}
//
//	@Bean
//	public ErrorFilter errorFilter() {
//		return new ErrorFilter();
//	}
//
//	@Bean
//	public RouteFilter routeFilter() {
//		return new RouteFilter();
//	}
//	
}
