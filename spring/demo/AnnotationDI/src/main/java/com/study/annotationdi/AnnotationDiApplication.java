package com.study.annotationdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnnotationDiApplication {

	public static void main(String[] args) {
		System.out.println("start");
		SpringApplication.run(AnnotationDiApplication.class, args);
	}

}
