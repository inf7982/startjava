/*
Создайте класс ConditionalStatement с методом main
Запишите следующие условия с помощью языка Java
Используйте переменные и условные операторы
Выведите все сообщения на консоль
 */

public class ConditionalStatement {
    public static void main(String[] args) {

        int age = 100;
        boolean sex = false;
        double height = 1.2;
        char nameBeginsLetter = 'S';

        if (yourAge > 20) {
            System.out.println("Your age is " + age + " years old");
        }

        if (youAreMale) {
            System.out.println("You are male");
        }

        if (!youAreMale) {
            System.out.println("You are female");
        }

        if (yourHeight < 1.8) {
            System.out.println("Your height is less than " + yourHeight + "m");
        } else {
            System.out.println("Your height is over than " + yourHeight + "m");
        }

        if (yourNameBeginsWithTheLetter == 'M') {
            System.out.println("Your name begins with the letter M");
        } else if (yourNameBeginsWithTheLetter == 'I') {
            System.out.println("Your name begins with the letter I");
        } else {
            System.out.println("Your name begins with the letter " + yourNameBeginsWithTheLetter);
        }
    }
}