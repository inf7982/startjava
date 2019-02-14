package com.startjava.lesson_4.guessnumber;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int i, int value) {
        this.numbers[i] = value;
    }

    public void displayPlayerNumbers(Player player, int attempt) {
        int[] newArray = Arrays.copyOf(player.getNumbers(), attempt);
        System.out.print(player.getName());
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(" " + newArray[i]);
        }
        System.out.println("");
    }
}