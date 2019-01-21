/*
Создайте класс ConditionalStatement с методом main
Запишите следующие условия с помощью языка Java
Используйте переменные и условные операторы
Выведите все сообщения на консоль
 */

public class ConditionalStatement {
    public static void main(String[] args) {

        int yourAge = 100;
        boolean youAreMale = false;
        double yourHeight = 1.2;
        char yourNameBeginsWithTheLetter = 'S';

        if (yourAge > 20) {
            System.out.println("Your age is "+yourAge+" years old");
        }

        if (youAreMale) {
            System.out.println("You are male");
        }

        if (!youAreMale) {
            System.out.println("You are female");
        }

        if (yourHeight < 1.8) {
            System.out.println("Your height is less than "+yourHeight+"m");
        } else {
            System.out.println("Your height is over than "+yourHeight+"m");
        }

        if (yourNameBeginsWithTheLetter == 'M') {
            System.out.println("Your name begins with the letter M");
        } else if (yourNameBeginsWithTheLetter == 'I') {
            System.out.println("Your name begins with the letter I");
        } else {
            System.out.println("Your name begins with the letter "+yourNameBeginsWithTheLetter);
        }

    }
}