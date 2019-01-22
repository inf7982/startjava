/*
Реализуйте Калькулятор, который должен уметь выполнять математические операции (+, -, *, /, ^, %) над целыми положительными числами:
- для проверки знака математической операции воспользуйтесь оператором if else
- выведите на экран результат работы калькулятора с помощью System.out.println()
 */

public class Calculator {

    static int exponent(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result = result * a;
        }
        return result;
    }

    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 2;
        char oper = '^';

        if (oper == '+') {
            System.out.println(num1 + num2);
        } else if (oper == '-') {
            System.out.println(num1 - num2);
        } else if (oper == '*') {
            System.out.println(num1 * num2);
        } else if (oper == '/') {
            System.out.println(num1 / num2);
        } else if (oper == '^') {
            System.out.println(exponent(num1, num2));
        } else if (oper == '%') {
            System.out.println(num1 % num2);
        }
    }
}