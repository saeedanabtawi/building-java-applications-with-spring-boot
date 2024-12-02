package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        try (var ctx = SpringApplication.run(Main.class, args)) {
            System.out.println("# Beans: " + ctx.getBeanDefinitionCount());
            var names = ctx.getBeanDefinitionNames();
            Arrays.sort(names);
            Arrays.asList(names).forEach(System.out::println);
        }
    }
}