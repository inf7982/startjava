package com.startjava.lesson_4.guessnumber;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("У вас 10 попыток");

        System.out.print("Введите ИМЯ первого игрока: ");
        Player player1 = new Player(scan.next());

        System.out.print("Введите ИМЯ второго игрока: ");
        Player player2 = new Player(scan.next());

        String playerAnswer;

        do {
            GuessNumber game = new GuessNumber(player1, player2);
            game.playGame();

            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                playerAnswer = scan.next();
            } while (!playerAnswer.equals("да") && !playerAnswer.equals("нет"));
        } while (!playerAnswer.equals("нет"));
    }
}
