package com.study.springboot.javacodedi;

public class PrinterB implements Printer {
    @Override
    public void print(String message) {
        System.out.println("PRINTER B: " + message);
    }   
}
