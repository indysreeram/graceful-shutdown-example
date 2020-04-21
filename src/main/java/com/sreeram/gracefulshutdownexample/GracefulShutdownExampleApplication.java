package com.sreeram.gracefulshutdownexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PreDestroy;

@SpringBootApplication
public class GracefulShutdownExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(GracefulShutdownExampleApplication.class, args);

	}

		@PreDestroy
		public void onDestroy() throws Exception {
			System.out.println("Spring Container is destroyed!");
		}


}
