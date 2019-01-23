/*
Реализуйте Калькулятор, который должен уметь выполнять математические операции (+, -, *, /, ^, %) над целыми положительными числами:
- для проверки знака математической операции воспользуйтесь оператором if else
- выведите на экран результат работы калькулятора с помощью System.out.println()
 */

public class Calculator {

    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 2;
        char mathOperation = '^';

        if (mathOperation == '+') {
            System.out.println(num1 + num2);
        } else if (mathOperation == '-') {
            System.out.println(num1 - num2);
        } else if (mathOperation == '*') {
            System.out.println(num1 * num2);
        } else if (mathOperation == '/') {
            System.out.println(num1 / num2);
        } else if (mathOperation == '^') {
            System.out.println(exponentCalculation(num1, num2));
        } else if (mathOperation == '%') {
            System.out.println(num1 % num2);
        }
    }

    static int exponentCalculation(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }
}