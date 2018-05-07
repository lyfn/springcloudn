package com.cloud.springcloudribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
@EnableHystrixDashboard
public class SpringCloudRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudRibbonApplication.class, args);
	}


	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

//	@Autowired
//	private HelloService helloService;

//	@RequestMapping(value = "/hi")
//	public String hi(@RequestParam String name){
//		return hiService(name);
//	}
//
//
//	@Autowired
//	RestTemplate restTemplate;
//
//	public String hiService(String name) {
//		return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
//	}
}
