import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите ИМЯ первого игрока: ");
        Player playerName1 = new Player(scan.next());
        GuessNumber gamePlayer1 = new GuessNumber(playerName1.getName());

        System.out.print("Введите ИМЯ второго игрока: ");
        Player playerName2 = new Player(scan.next());
        GuessNumber gamePlayer2 = new GuessNumber(playerName2.getName());
    }
}