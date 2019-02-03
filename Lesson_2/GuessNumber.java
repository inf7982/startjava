import java.util.Scanner;

public class GuessNumber {
    Player player1;
    Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void playGame() {
        int randomNumber = (int) (Math.random() * 101);
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print(player1.getName() + ", введите число: ");
            player1.setNumber(scan.nextInt());

            if (player1.getNumber() > randomNumber) {
                System.out.println(player1.getName() + ", введенное вами число " + player1.getNumber() + " больше того, что загадал компьютер");
            } else if (player1.getNumber() < randomNumber) {
                System.out.println(player1.getName() + ", введенное вами число " + player1.getNumber() + " меньше того, что загадал компьютер");
            } else {
                System.out.println(player1.getName() + ", Вы угадали число " + player1.getNumber());
                System.out.println("Победил игрок по имени " + player1.getName());
                break;
            }

            System.out.print(player2.getName() + ", введите число: ");
            player2.setNumber(scan.nextInt());

            if (player2.getNumber() > randomNumber) {
                System.out.println(player2.getName() + ", введенное вами число " + player2.getNumber() + " больше того, что загадал компьютер");
            } else if (player2.getNumber() < randomNumber) {
                System.out.println(player2.getName() + ", введенное вами число " + player2.getNumber() + " меньше того, что загадал компьютер");
            } else {
                System.out.println(player2.getName() + ", Вы угадали число " + player2.getNumber());
                System.out.println("Победил игрок по имени " + player2.getName());
            }
        }
        while (randomNumber != player1.getNumber() && randomNumber != player2.getNumber());
    }
}