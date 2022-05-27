package com.alipay.sofa.ark.classisolation;

import com.alipay.sofa.ark.support.startup.SofaArkBootstrap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringbootArkDemoApplication {

	public static void main(String[] args) {
		SofaArkBootstrap.launch(args);
		SpringApplication.run(SpringbootArkDemoApplication.class, args);
	}
}
