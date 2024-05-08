package com.candido.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.candido") //alteração do chatgpt
public class CourseApplication {

    public static void main(String[] args) {
	SpringApplication.run(CourseApplication.class, args);
    }

}
