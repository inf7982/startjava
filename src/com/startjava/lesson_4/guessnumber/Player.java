package com.startjava.lesson_4.guessnumber;

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
}