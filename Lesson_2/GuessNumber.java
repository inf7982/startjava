import java.util.Scanner;

public class GuessNumber {
    public GuessNumber(String playerName) {
        String playerAnswer;
        do {
            int randomNumber = (int) (Math.random() * 101);
            Scanner scan = new Scanner(System.in);

            System.out.print("Введите цифру: ");
            Player playerNumber = new Player(scan.nextInt());

            do {
                if (playerNumber.getNumber() > randomNumber) {
                    System.out.print(playerName + ", введенное вами число " + playerNumber.getNumber() + " больше того, что загадал компьютер, попробуйте еще раз: ");
                } else if (playerNumber.getNumber() < randomNumber) {
                    System.out.print(playerName + ", введенное вами число " + playerNumber.getNumber() + " меньше того, что загадал компьютер, попробуйте еще раз: ");
                }
                playerNumber.setNumber(scan.nextInt());
            }
            while (randomNumber != playerNumber.getNumber());

            System.out.println(playerName + ", Вы угадали число " + playerNumber.getNumber());

            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                playerAnswer = scan.next();
            }
            while (!playerAnswer.equals("да") && !playerAnswer.equals("нет"));
        }
        while (!playerAnswer.equals("нет"));
    }
}