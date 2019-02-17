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

    public int getNumbers(int attempt) {
        return numbers[attempt];
    }

    public int[] getNewArray(int attempt) {
        return Arrays.copyOf(numbers, attempt);
    }
}