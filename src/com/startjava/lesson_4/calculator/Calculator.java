package com.startjava.lesson_4.calculator;

public class Calculator {
    private String mathematicalExpression;

    public void calc() {
        String string = mathematicalExpression;
        String[] parts = string.split("[+|-|*|/|^|%]");
        String part1 = parts[0];
        String part2 = parts[1];
        int num1 = Integer.parseInt(part1);
        int num2 = Integer.parseInt(part2);

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

    public Calculator(String mathematicalExpression) {
        this.mathematicalExpression = mathematicalExpression;
    }
}