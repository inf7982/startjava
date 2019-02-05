package com.startjava.lesson_2_3.guessnumber;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int randomNumber = (int) (Math.random() * 101);
    Scanner scan = new Scanner(System.in);

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

            if (player1.getNumber() == randomNumber) {
                break;
            }

            inputNumber(player2);
            suggestPlayer(player2);
        }
        while (randomNumber != player1.getNumber() && randomNumber != player2.getNumber());
    }

    public void negativeNumberAssignment(Player player) {
        player.setNumber(-1);
    }

    public void inputNumber(Player player) {
        System.out.print(player.getName() + ", введите число: ");
        player.setNumber(scan.nextInt());
    }

    public void suggestPlayer(Player player) {
        if (player.getNumber() > randomNumber) {
            System.out.println(player.getName() + ", введенное вами число " + player.getNumber() + " больше того, что загадал компьютер");
        } else if (player.getNumber() < randomNumber) {
            System.out.println(player.getName() + ", введенное вами число " + player.getNumber() + " меньше того, что загадал компьютер");
        } else {
            System.out.println(player.getName() + ", Вы угадали число " + player.getNumber());
            System.out.println("Победил игрок по имени " + player.getName());
        }
    }
}