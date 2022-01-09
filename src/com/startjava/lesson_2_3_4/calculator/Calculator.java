package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public static int calculate(String expression) {
        String[] elements = expression.split(" ");
        int num1 = Integer.parseInt(elements[0]);
        int num2 = Integer.parseInt(elements[2]);
        String operation = elements[1];
        int result = 0;
        switch (operation) {
            case "+":
                return Math.addExact(num1, num2);
            case "-":
                return Math.subtractExact(num1, num2);
            case "/":
                return num1 / num2;
            case "%":
                return num1 % num2;
            case "*":
                return Math.multiplyExact(num1, num2);
            case "^":
                return (int) Math.pow(num1, num2);
        }
        return result;
    }
}



    /*private int num1;
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
}*/