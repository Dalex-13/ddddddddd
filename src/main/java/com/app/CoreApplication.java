package com.app;

import com.app.atributos.Motor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CoreApplication {

	public static void main(String[] args) {

		//SpringApplication.run(CoreApplication.class, args);

		ConfigurableApplicationContext contex = SpringApplication.run(CoreApplication.class, args);

		Motor m = contex.getBean(Motor.class);

		System.out.println(m);
		System.out.println("prueba");

	}
}
