package com.startjava.lesson_4.guessnumber;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int randomNumber = (int) (Math.random() * 101);
    private Scanner scan = new Scanner(System.in);
    private int attempt = 0;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void playGame() {
        initializeArray(player1, 1);
        initializeArray(player2, 1);

        do {
            combineFunctions(player1);
            if (player1.getNumbers(attempt) == randomNumber) {
                break;
            }

            combineFunctions(player2);
            if (player2.getNumbers(attempt) == randomNumber) {
                break;
            }

            if (attempt == 9) {
                break;
            }

            attempt++;
        }
        while (randomNumber != player1.getNumbers(attempt) || randomNumber != player2.getNumbers(attempt));

        newArray(player1);
        newArray(player2);

        initializeArray(player1, 0);
        initializeArray(player2, 0);
    }

    public void initializeArray(Player player, int full) {
        if (full == 1) {
            Arrays.fill(player.getNumbers(), -1);
        } else {
            Arrays.fill(player.getNumbers(), 0, (attempt + 1), -1);
        }
    }

    public void combineFunctions(Player player) {
        inputNumber(player);
        guessNumber(player);
        checkAttempts(player);
    }

    public void inputNumber(Player player) {
        System.out.print(player.getName() + ", введите число: ");
        player.setNumbers(attempt, scan.nextInt());
    }

    public void guessNumber(Player player) {
        int playerNumber = player.getNumbers(attempt);
        if (playerNumber > randomNumber) {
            System.out.println(player.getName() + ", введенное вами число " + playerNumber + " больше того, что загадал компьютер");
        } else if (playerNumber < randomNumber) {
            System.out.println(player.getName() + ", введенное вами число " + playerNumber + " меньше того, что загадал компьютер");
        } else {
            System.out.println("Игрок " + player.getName() + " угадал число " + playerNumber + " c " + (attempt + 1) + " попытки");
        }
    }

    public void checkAttempts(Player player) {
        if (attempt == 9) {
            System.out.println("У " + player.getName() + " кончились попытки");
        }
    }

    public void newArray(Player player) {
        System.out.print(player.getName());

        if (player.getNumbers(attempt) == randomNumber) {
            for (int i = 0; i < player.getNewArray(attempt + 1).length; i++) {
                System.out.print(" " + player.getNewArray(attempt + 1)[i]);
            }
        } else {
            for (int i = 0; i < player.getNewArray(attempt).length; i++) {
                System.out.print(" " + player.getNewArray(attempt)[i]);
            }
        }

        System.out.println("");
    }
}