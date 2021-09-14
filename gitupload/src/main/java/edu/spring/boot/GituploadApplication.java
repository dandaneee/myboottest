package edu.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
public class GituploadApplication {

	public static void main(String[] args) {
		SpringApplication.run(GituploadApplication.class, args);
		System.out.println("출2");
	}

}
