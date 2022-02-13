package com.ait.microservice.springhelloworld;

import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.text.SimpleDateFormat;

import static com.ait.microservice.springhelloworld.HelloService.DATE_FORMAT_NOW;

@RestController
@RequestMapping("/")
public class HelloRoot {
    @RequestMapping("/")
    public String index() {
        return "Hello World from Spring Boot " + now();
    }

    public static String now() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
        return sdf.format(cal.getTime());
    }
}


