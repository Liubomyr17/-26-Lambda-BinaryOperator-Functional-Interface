package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("X", "A");
        map.put("Y", "B");
        map.put("Z", "C");

        BinaryOperator<String> binaryOpt = (s1,s2)->s1+"-"+s2;
        BinaryOperatorFun(binaryOpt,map).forEach(System.out::println);
    }

    private static List<String> BinaryOperatorFun(BinaryOperator<String> binaryOpt, Map<String, String> map) {
        List<String> biList = new ArrayList<>();
        map.forEach((s1,s2)->biList.add(binaryOpt.apply(s1, s2)));
        return biList;
    }
}
