package com.startjava.lesson_1.game;

/*
Напишите игру Угадай число:
- компьютер "загадывает" целое число от 0 до 100, которое вам необходимо угадать
- после каждой неудачной попытки выводите подсказки: System.out.println("Введенное вами число больше (меньше) того, что загадал компьютер")
- если число угадано — System.out.println("Вы угадали!")
- игра продолжается до тех пор, пока число не будет угадано
 */

public class Game {

    public static void main(String[] args) {
        int randomNum = 352;
        int userNum = 6;

        do {
            if (userNum > randomNum) {
                System.out.println("Введенное вами число " + userNum + " больше того, что загадал компьютер");
                userNum--;
            } else {
                System.out.println("Введенное вами число " + userNum + " меньше того, что загадал компьютер");
                userNum++;
            }
            userNum = (randomNum - userNum) / 2 + userNum;
        }
        while (randomNum != userNum);
        System.out.println("Вы угадали число " + userNum);
    }
}