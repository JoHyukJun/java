package com.study.springboot.javacodedi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class JavacodediApplication {

	public static void main(String[] args) {
		//SpringApplication.run(JavacodediApplication.class, args);

		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		Member member1 = (Member)context.getBean("member1");
		member1.print();
		
		Member member2 = (Member)context.getBean("hello", Member.class);
		member2.print();

		Printer printer = context.getBean("printerB", Printer.class);
		member1.setPrinter(printer);
		member1.print();

		if (member1 == member2) {
			System.out.println("same object");
		}
		else {
			System.out.println("diff object");
		}
	}

}
