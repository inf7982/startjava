package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String args[]) {
        String playerAnswer;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Введите математическое выражение: ");
            String mathematicalExpression = scan.nextLine();

            Calculator calculator = new Calculator(mathematicalExpression);
            calculator.calc();

            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                playerAnswer = scan.nextLine();
            }
            while (!playerAnswer.equals("да") && !playerAnswer.equals("нет"));
        }
        while (!playerAnswer.equals("нет"));
    }
}