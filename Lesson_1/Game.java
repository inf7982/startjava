/*
Напишите игру Угадай число:
- компьютер "загадывает" целое число от 0 до 100, которое вам необходимо угадать
- после каждой неудачной попытки выводите подсказки: System.out.println("Введенное вами число больше (меньше) того, что загадал компьютер")
- если число угадано — System.out.println("Вы угадали!")
- игра продолжается до тех пор, пока число не будет угадано
 */

public class Game {

    public static void main(String[] args) {
        int randomNum = 5;
        int userNum = 6;

        if (randomNum > userNum) {
            System.out.println("Введенное вами число меньше того, что загадал компьютер");
        } else if (randomNum < userNum) {
            System.out.println("Введенное вами число больше того, что загадал компьютер");
        } else {
            System.out.println("Вы угадали!");
        }
    }
}