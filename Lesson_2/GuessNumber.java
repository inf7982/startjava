import java.util.Scanner;

public class GuessNumber {
    Player player1;
    Player player2;
    Scanner scan = new Scanner(System.in);
    int randomNumber = (int) (Math.random() * 101);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void playGame() {
        while (randomNumber != player1.getNumber() && randomNumber != player2.getNumber()) {
            player1.setNumber(-1);
            player2.setNumber(-1);
            System.out.println(randomNumber);

            suggestPlayer(player1);
            if (player1.getNumber() == randomNumber) {
                break;
            }
            suggestPlayer(player2);
        }
    }

    public void suggestPlayer(Player player) {
        System.out.print(player.getName() + ", введите число: ");
        player.setNumber(scan.nextInt());

        if (player.getNumber() > randomNumber) {
            System.out.println(player.getName() + ", введенное вами число " + player.getNumber() + " больше того, что загадал компьютер");
        } else if (player.getNumber() < randomNumber) {
            System.out.println(player.getName() + ", введенное вами число " + player.getNumber() + " меньше того, что загадал компьютер");
        } else {
            System.out.println(player.getName() + ", Вы угадали число " + player.getNumber());
            System.out.println("Победил игрок по имени " + player.getName());
        }
    }
}