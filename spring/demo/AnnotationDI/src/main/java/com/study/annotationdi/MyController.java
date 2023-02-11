package com.study.annotationdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
    @Autowired
    Member member1;

    @Autowired
    @Qualifier("printerB")
    Printer printer;

    @Autowired
    Member member2;

    @RequestMapping("/test")
    public @ResponseBody String root() {
        member1.print();

        member1.setPrinter(printer);
        member1.print();

        if (member1 == member2) {
            System.out.println("same object");
        }
        else {
            System.out.println("diff object");
        }

        return "annotation used";
    }
    
}
