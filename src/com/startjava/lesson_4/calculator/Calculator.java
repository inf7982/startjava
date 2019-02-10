package com.startjava.lesson_4.calculator;

public class Calculator {
    private String mathematicalExpression;

    public Calculator(String mathematicalExpression) {
        this.mathematicalExpression = mathematicalExpression;
    }

    public void calc() {
        String string = mathematicalExpression;
        string.replaceAll("\\s+","");
        String[] numbers = string.split("[+|-|*|/|^|%]");
        int num1 = Integer.parseInt(numbers[0]);
        int num2 = Integer.parseInt(numbers[1]);

        if (string.contains("+")) {
            System.out.println(num1 + num2);
        } else if (string.contains("-")) {
            System.out.println(num1 - num2);
        } else if (string.contains("*")) {
            System.out.println(num1 * num2);
        } else if (string.contains("/")) {
            System.out.println(num1 / num2);
        } else if (string.contains("^")) {
            System.out.println((int) Math.pow(num1, num2));
        } else if (string.contains("%")) {
            System.out.println((int) Math.IEEEremainder(num1, num2));
        }
    }
}