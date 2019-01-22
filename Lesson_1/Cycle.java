/*
Создайте класс Cycle с методом main
Выведите на консоль с помощью цикла for все числа от [0, 20]
Выведите на консоль с помощью цикла while все числа от [6, -6] (шаг итерации равен 2)
Выведите на консоль с помощью цикла do-while сумму всех нечетных чисел от [10, 20]
Покажите Д/З наставнику
 */

public class Cycle {

    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        int i = 6;
        while (i >= -6) {
            System.out.println(i);
            i -= 2;
        }

        i = 10;
        int sum = 0;
        do {
            if (i % 2 != 0) {
                sum += i;
            }
            i++;
        }
        while (i < 20);
        System.out.println(sum);
    }
}