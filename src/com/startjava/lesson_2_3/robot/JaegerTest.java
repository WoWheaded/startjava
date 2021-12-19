package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger("Mark-3", "Gipsy Danger", "United States of America", 79.25, 1.980, 7, 8, 6);
        System.out.println(jaeger1);
        Jaeger jaeger2 = new Jaeger("Mark-4", "Crimson Typhoon", "China", 76.2, 1.722, 9, 8, 6);
        System.out.println(jaeger2);
    }
}