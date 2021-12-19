package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private char sign;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public void calculate() {
        switch(sign) {
            case '+' : 
                System.out.println("Ответ = " + (num1 + num2));
                break;
            case'-' :
                System.out.println("Ответ = " + (num1 - num2));
                break;
            case '*' :
                System.out.println("Ответ = " + (num1 * num2));
                break;
            case '/' :
                double n1 = num1 * 1.0;
                double n2 = num2 * 1.0;
                System.out.println("Ответ = " + (n1 / n2));
                break;
            case '^' :
                int res = 1;
                for(int i = 0; i < num2; i++) {
                    res *= num1;
                }
                System.out.println("Ответ = " + res);
                break;
            case '%' :
                System.out.println("Ответ = " + (num1 % num2));
                break;
        }
    }
}