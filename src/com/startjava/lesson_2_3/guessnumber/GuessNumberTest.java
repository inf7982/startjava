package com.startjava.lesson_2_3.guessnumber;
import java.util.Scanner;
import com.startjava.lesson_2_3.guessnumber.*;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите ИМЯ первого игрока: ");
        Player player1 = new Player(scan.next());

        System.out.print("Ââåäèòå ÈÌß âòîðîãî èãðîêà: ");
        Player player2 = new Player(scan.next());

        String playerAnswer;

        do {
            GuessNumber game = new GuessNumber(player1, player2);
            game.playGame();
            do {
                System.out.print("Õîòèòå ïðîäîëæèòü? [äà/íåò]: ");
                playerAnswer = scan.next();
            }
            while (!playerAnswer.equals("äà") && !playerAnswer.equals("íåò"));
        }
        while (!playerAnswer.equals("íåò"));
    }
}