package com.startjava.lesson_4.guessnumber;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int randomNumber = (int) (Math.random() * 101);
    private Scanner scan = new Scanner(System.in);
    private int counter = 0;


    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void playGame() {
        negativeNumberAssignment(player1);
        negativeNumberAssignment(player2);

        do {
            inputNumber(player1);
            suggestPlayer(player1);
            if (player1.getNumbers()[counter] == randomNumber) {
                break;
            }
            checkAttempts(player1);

            inputNumber(player2);
            suggestPlayer(player2);
            if (player2.getNumbers()[counter] == randomNumber) {
                break;
            }
            checkAttempts(player2);

            if (counter == 9) {
                break;
            }

            counter++;
        }
        while (randomNumber != player1.getNumbers()[counter] || randomNumber != player2.getNumbers()[counter]);
        arrayOutput(player1);
        arrayOutput(player2);
    }

    public void arrayOutput(Player player) {
        int[] newArray = Arrays.copyOf(player.getNumbers(), player.getNumbers().length);
        System.out.print(player.getName());
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] != 0) {
                System.out.print(" " + newArray[i]);
            }
        }
        System.out.println("");
    }

    public void checkAttempts(Player player) {
        if (counter == 9) {
            System.out.println("У " + player.getName() + " кончились попытки");
        }
    }

    public void negativeNumberAssignment(Player player) {
        for (int i = 0; i < player.getNumbers().length; i++) {
            if (player.getNumbers()[i] == 0) {
                Arrays.fill(player.getNumbers(), 0, i++, 0);
                break;
            }
        }
    }

    public void inputNumber(Player player) {
        System.out.print(player.getName() + ", введите число: ");
        player.setNumbers(counter, scan.nextInt());
    }

    public void suggestPlayer(Player player) {
        if (player.getNumbers()[counter] > randomNumber) {
            System.out.println(player.getName() + ", введенное вами число " + player.getNumbers()[counter] + " больше того, что загадал компьютер");
        } else if (player.getNumbers()[counter] < randomNumber) {
            System.out.println(player.getName() + ", введенное вами число " + player.getNumbers()[counter] + " меньше того, что загадал компьютер");
        } else {
            int attempt = counter + 1;
            System.out.println("Игрок " + player.getName() + " угадал число " + player.getNumbers()[counter] + " c " + attempt + " попытки");
        }
    }
}