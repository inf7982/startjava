package com.startjava.lesson_2_3.calculator;

/*
Модифицируйте программу Калькулятор:
- реализуйте дополнительный класс CalculatorTest
- для проверки знака математической операции воспользуйтесь оператором switch

формат ввода математического выражения:
- Введите первое число: 2
- Введите знак математической операции: ^
- Введите второе число: 10
 */

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String args[]) {
        String playerAnswer;
        Scanner scan = new Scanner(System.in);
        
        do {
            System.out.print("Введите первое число: ");
            int num1 = scan.nextInt();

            System.out.print("Введите знак математической операции: ");
            String mathOperation = scan.next();

            System.out.print("Введите второе число: ");
            int num2 = scan.nextInt();

            Calculator calculator = new Calculator();
            calculator.calc(num1, mathOperation, num2);

            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                playerAnswer = scan.next();
            }
            while (!playerAnswer.equals("да") && !playerAnswer.equals("нет"));
        }
        while (!playerAnswer.equals("нет"));
    }
}