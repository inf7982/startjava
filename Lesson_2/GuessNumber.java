import java.util.Scanner;

public class GuessNumber {
    public void game(String playerName1, String playerName2) {
        int randomNumber = (int) (Math.random() * 101);
        Scanner scan = new Scanner(System.in);
        Player playerNumber1 = new Player();
        Player playerNumber2 = new Player();

        do {
            System.out.print(playerName1 + ", введите число: ");
            playerNumber1.setNumber(scan.nextInt());

            if (playerNumber1.getNumber() > randomNumber) {
                System.out.println(playerName1 + ", введенное вами число " + playerNumber1.getNumber() + " больше того, что загадал компьютер");
            } else if (playerNumber1.getNumber() < randomNumber) {
                System.out.println(playerName1 + ", введенное вами число " + playerNumber1.getNumber() + " меньше того, что загадал компьютер");
            } else {
                System.out.println(playerName1 + ", Вы угадали число " + playerNumber1.getNumber());
                System.out.println("Победил игрок по имени " + playerName1);
                break;
            }

            System.out.print(playerName2 + ", введите число: ");
            playerNumber2.setNumber(scan.nextInt());

            if (playerNumber2.getNumber() > randomNumber) {
                System.out.println(playerName2 + ", введенное вами число " + playerNumber2.getNumber() + " больше того, что загадал компьютер");
            } else if (playerNumber2.getNumber() < randomNumber) {
                System.out.println(playerName2 + ", введенное вами число " + playerNumber2.getNumber() + " меньше того, что загадал компьютер");
            } else {
                System.out.println(playerName2 + ", Вы угадали число " + playerNumber2.getNumber());
                System.out.println("Победил игрок по имени " + playerName2);
            }
        }
        while (randomNumber != playerNumber1.getNumber() && randomNumber != playerNumber2.getNumber());
    }
}