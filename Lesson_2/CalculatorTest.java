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
        System.out.print("Введите первое число: ");
        Scanner scanNum1 = new Scanner(System.in);
        int num1 = scanNum1.nextInt();

        System.out.print("Введите знак математической операции: ");
        Scanner scanMathOperation = new Scanner(System.in);
        String mathOperation = scanMathOperation.next();

        System.out.print("Введите второе число: ");
        Scanner scanNum2 = new Scanner(System.in);
        int num2 = scanNum2.nextInt();

        Calculator calculator = new Calculator();
        calculator.calc(num1, mathOperation, num2);
    }
}