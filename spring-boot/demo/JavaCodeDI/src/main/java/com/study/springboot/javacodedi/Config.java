package com.study.springboot.javacodedi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Member member1() {
        // setter injection
        Member member1 = new Member();
        member1.setName("jo");
        member1.setNickname("karam");
        member1.setPrinter(new PrinterA());

        return member1;
    }

    @Bean(name="hello")
    public Member member2() {
        // constructor injection
        return new Member("lee", "poy", new PrinterA());
    }
    
    @Bean
    public PrinterA printerA() {
        return new PrinterA();
    }

    @Bean
    public PrinterB printerB() {
        return new PrinterB();
    }
}
