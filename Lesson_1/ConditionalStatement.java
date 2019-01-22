/*
Создайте класс ConditionalStatement с методом main
Запишите следующие условия с помощью языка Java
Используйте переменные и условные операторы
Выведите все сообщения на консоль
 */

public class ConditionalStatement {
    public static void main(String[] args) {

        int age = 33;
        boolean male = true;
        double height = 1.85;
        char nameBeginsLetter = 'S';

        if (age > 20) {
            System.out.println("Your age is " + age + " years old");
        }

        if (male) {
            System.out.println("You are male");
        }

        if (!male) {
            System.out.println("You are female");
        }

        if (height < 1.8) {
            System.out.println("Your height is less than " + height + "m");
        } else {
            System.out.println("Your height is over than " + height + "m");
        }

        if (nameBeginsLetter == 'M') {
            System.out.println("Your name begins with the letter M");
        } else if (nameBeginsLetter == 'I') {
            System.out.println("Your name begins with the letter I");
        } else {
            System.out.println("Your name begins with the letter " + nameBeginsLetter);
        }
    }
}