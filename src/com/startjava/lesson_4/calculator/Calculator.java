package com.startjava.lesson_4.calculator;

public class Calculator {
    private String mathematicalExpression;

    public Calculator(String mathematicalExpression) {
        this.mathematicalExpression = mathematicalExpression;
    }

    public void calc() {
        String string = mathematicalExpression;
        String[] numbers = string.split(" ");
        int num1 = Integer.parseInt(numbers[0]);
        String operation = numbers[1];
        int num2 = Integer.parseInt(numbers[2]);

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