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
        do {
            inputNumber(player1);
            suggestPlayer(player1);
            if (player1.getNumbers()[attempt] == randomNumber) {
                break;
            }
            checkAttempts(player1);

            inputNumber(player2);
            suggestPlayer(player2);
            if (player2.getNumbers()[attempt] == randomNumber) {
                break;
            }
            checkAttempts(player2);

            if (attempt == 9) {
                break;
            }

            attempt++;
        }
        while (randomNumber != player1.getNumbers()[attempt] || randomNumber != player2.getNumbers()[attempt]);

        Player dpn = new Player();
        dpn.displayPlayerNumbers(player1);
        dpn.displayPlayerNumbers(player2);

        negativeNumberAssignment(player1);
        negativeNumberAssignment(player2);
    }

    public void inputNumber(Player player) {
        System.out.print(player.getName() + ", введите число: ");
        player.setNumbers(attempt, scan.nextInt());
    }

    public void suggestPlayer(Player player) {
        if (player.getNumbers()[attempt] > randomNumber) {
            System.out.println(player.getName() + ", введенное вами число " + player.getNumbers()[attempt] + " больше того, что загадал компьютер");
        } else if (player.getNumbers()[attempt] < randomNumber) {
            System.out.println(player.getName() + ", введенное вами число " + player.getNumbers()[attempt] + " меньше того, что загадал компьютер");
        } else {
            System.out.println("Игрок " + player.getName() + " угадал число " + player.getNumbers()[attempt] + " c " + (attempt + 1) + " попытки");
        }
    }

    public void checkAttempts(Player player) {
        if (attempt == 9) {
            System.out.println("У " + player.getName() + " кончились попытки");
        }
    }

//    public void displayPlayerNumbers(Player player) {
//        int[] newArray = Arrays.copyOf(player.getNumbers(), player.getNumbers().length);
//        System.out.print(player.getName());
//        for (int i = 0; i < newArray.length; i++) {
//            if (newArray[i] != 0) {
//                System.out.print(" " + newArray[i]);
//            }
//        }
//        System.out.println("");
//    }

    public void negativeNumberAssignment(Player player) {
        Arrays.fill(player.getNumbers(), 0, (attempt + 1), 0);
    }
}