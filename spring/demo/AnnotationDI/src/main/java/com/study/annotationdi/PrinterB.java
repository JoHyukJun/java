package com.study.annotationdi;

import org.springframework.stereotype.Component;

@Component("printerB")
public class PrinterB implements Printer {
    @Override
    public void print(String message) {
        System.out.println("PRINTER B: " + message);
    }   
}
