package org.merkart.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages="org.merkart.app")
@SpringBootApplication
public class MerkartApplication {

	public static void main(String... args) {
		SpringApplication.run(MerkartApplication.class, args);
	}

}
