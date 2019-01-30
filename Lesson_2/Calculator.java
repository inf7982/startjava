/*
Модифицируйте программу Калькулятор:
- реализуйте дополнительный класс CalculatorTest
- для проверки знака математической операции воспользуйтесь оператором switch

формат ввода математического выражения:
- Введите первое число: 2
- Введите знак математической операции: ^
- Введите второе число: 10
 */

public class Calculator {
    public void calc(int num1, String mathOperation, int num2) {
        switch (mathOperation) {
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
                System.out.println(raisePower(num1, num2));
                break;
            case "%":
                System.out.println(num1 % num2);
                break;
        }
    }

    static int raisePower(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }
}