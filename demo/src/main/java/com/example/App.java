package com.example;

import org.springframework.stereotype.Component;

import com.example.demo.Dev;
@Component
public class App {
public static void main(String[] args) {
 Dev dev = new Dev();
 dev.build();
}
}
