package com.startjava.lesson_4.calculator;

public class Calculator {
    private String mathExpression;

    public Calculator(String mathExpression) {
        this.mathExpression = mathExpression;
    }

    public void calc() {
        String[] expression = mathExpression.split(" ");
        int num1 = Integer.parseInt(expression[0]);
        String operation = expression[1];
        int num2 = Integer.parseInt(expression[2]);

        switch (operation) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            case "^":
                System.out.println((int) Math.pow(num1, num2));
                break;
            case "%":
                System.out.println((int) Math.IEEEremainder(num1, num2));
                break;
        }
    }
}