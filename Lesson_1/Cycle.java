/*
Создайте класс Cycle с методом main
Выведите на консоль с помощью цикла for все числа от [0, 20]
Выведите на консоль с помощью цикла while все числа от [6, -6] (шаг итерации равен 2)
Выведите на консоль с помощью цикла do-while сумму всех нечетных чисел от [10, 20]
Покажите Д/З наставнику
 */

public class Cycle {
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }

        int i = 6;
        while (i >= -6) {
            System.out.println(i);
            i-=2;
        }

        int i2 = 10;
        int i3 = 20;
        int sum = 0;
        do {
            i2++;
            if (i2 % 2 != 0) {
                sum += i2;
            }
        }
        while (i2 < i3);
        System.out.println(sum);
    }
}