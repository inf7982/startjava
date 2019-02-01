import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите ИМЯ первого игрока: ");
        Player playerName1 = new Player(scan.next());

        System.out.print("Введите ИМЯ второго игрока: ");
        Player playerName2 = new Player(scan.next());

        String playerAnswer;

        do {
            do {
                GuessNumber guessNumber = new GuessNumber();
                guessNumber.game(playerName1.getName(), playerName2.getName());

                System.out.print("Хотите продолжить? [да/нет]: ");
                playerAnswer = scan.next();
            }
            while (!playerAnswer.equals("да") && !playerAnswer.equals("нет"));
        }
        while (!playerAnswer.equals("нет"));
    }
}