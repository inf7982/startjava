package com.startjava.lesson_4.guessnumber;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int randomNumber;
    private Scanner scan = new Scanner(System.in);
    private int attempt = 0;

    public GuessNumber(Player player1, Player player2, int maxNumber) {
        this.player1 = player1;
        this.player2 = player2;
        randomNumber = (int) (Math.random() * maxNumber);
    }

    public void startGame() {
        initializeArray(player1, 1);
        initializeArray(player2, 1);

        do {
            if (playGame(player1)) {
                break;
            }

            if (playGame(player2)) {
                break;
            }

            if (attempt == 9) {
                break;
            }

            attempt++;
        }
        while (randomNumber != player1.getAnswer(attempt) || randomNumber != player2.getAnswer(attempt));

        getAnswers(player1);
        getAnswers(player2);

        initializeArray(player1, 0);
        initializeArray(player2, 0);
    }

    private void initializeArray(Player player, int full) {
        if (full == 1) {
            Arrays.fill(player.getNumbers(), -1);
        } else {
            Arrays.fill(player.getNumbers(), 0, (attempt + 1), -1);
        }
    }

    private boolean playGame(Player player) {
        inputNumber(player);
        guessNumber(player);
        checkAttempts(player);
        return player.getAnswer(attempt) == randomNumber;
    }

    private void inputNumber(Player player) {
        System.out.print(player.getName() + ", введите число: ");
        player.setNumbers(attempt, scan.nextInt());
    }

    private void guessNumber(Player player) {
        int playerNumber = player.getAnswer(attempt);
        if (playerNumber > randomNumber) {
            System.out.println(player.getName() + ", введенное вами число " + playerNumber + " больше того, что загадал компьютер");
        } else if (playerNumber < randomNumber) {
            System.out.println(player.getName() + ", введенное вами число " + playerNumber + " меньше того, что загадал компьютер");
        } else {
            System.out.println("Игрок " + player.getName() + " угадал число " + playerNumber + " c " + (attempt + 1) + " попытки");
        }
    }

    private void checkAttempts(Player player) {
        if (attempt == 9) {
            System.out.println("У " + player.getName() + " кончились попытки");
        }
    }

    private void getAnswers(Player player) {
        System.out.print(player.getName());

        if (player.getAnswer(attempt) == randomNumber) {
            for (int i = 0; i < player.getCopyOfAnswers(attempt + 1).length; i++) {
                System.out.print(" " + player.getCopyOfAnswers(attempt + 1)[i]);
            }
        } else {
            for (int i = 0; i < player.getCopyOfAnswers(attempt).length; i++) {
                System.out.print(" " + player.getCopyOfAnswers(attempt)[i]);
            }
        }

        System.out.println("");
    }
}