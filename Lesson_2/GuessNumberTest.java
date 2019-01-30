import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        String playerAnswer;
        Scanner scan = new Scanner(System.in);
        Player player1 = new Player();
        Player player2 = new Player();

        System.out.print("Введите ИМЯ первого игрока: ");
        player1.name = scan.next();

        System.out.print("Введите ИМЯ второго игрока: ");
        player2.name = scan.next();

        do {
            int randomNumber = (int) (Math.random() * 101);
            System.out.println("РАНДОМНАЯ ЦИФРА: " + randomNumber);

            System.out.print("Введите ЦИФРУ первого игрока: ");
            player1.number = scan.nextInt();

            GuessNumber game = new GuessNumber();
            game.method(player1.name, randomNumber, player1.number);

            System.out.print("Введите ЦИФРУ второго игрока: ");
            player2.number = scan.nextInt();

            game.method(player2.name, randomNumber, player2.number);

            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                playerAnswer = scan.next();
            }
            while (!playerAnswer.equals("да") & !playerAnswer.equals("нет"));
        }
        while (!playerAnswer.equals("нет"));
    }
}