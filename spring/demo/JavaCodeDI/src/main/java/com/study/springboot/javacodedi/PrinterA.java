package com.study.springboot.javacodedi;

public class PrinterA implements Printer {
    @Override
    public void print(String message) {
        System.out.println("PRINTER A: " + message);
    }    
}
